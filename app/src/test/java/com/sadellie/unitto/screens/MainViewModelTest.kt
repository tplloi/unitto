/*
 * Unitto is a unit converter for Android
 * Copyright (c) 2022-2022 Elshan Agaev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sadellie.unitto.screens

import android.os.StrictMode
import androidx.room.Room
import com.sadellie.unitto.data.KEY_0
import com.sadellie.unitto.data.KEY_1
import com.sadellie.unitto.data.KEY_2
import com.sadellie.unitto.data.KEY_3
import com.sadellie.unitto.data.KEY_4
import com.sadellie.unitto.data.KEY_5
import com.sadellie.unitto.data.KEY_6
import com.sadellie.unitto.data.KEY_7
import com.sadellie.unitto.data.KEY_8
import com.sadellie.unitto.data.KEY_9
import com.sadellie.unitto.data.KEY_COMMA
import com.sadellie.unitto.data.KEY_DIVIDE
import com.sadellie.unitto.data.KEY_DOT
import com.sadellie.unitto.data.KEY_EXPONENT
import com.sadellie.unitto.data.KEY_LEFT_BRACKET
import com.sadellie.unitto.data.KEY_MINUS
import com.sadellie.unitto.data.KEY_MULTIPLY
import com.sadellie.unitto.data.KEY_PLUS
import com.sadellie.unitto.data.KEY_RIGHT_BRACKET
import com.sadellie.unitto.data.KEY_SQRT
import com.sadellie.unitto.data.preferences.DataStoreModule
import com.sadellie.unitto.data.preferences.UserPreferencesRepository
import com.sadellie.unitto.data.units.AllUnitsRepository
import com.sadellie.unitto.data.units.database.MyBasedUnitDatabase
import com.sadellie.unitto.data.units.database.MyBasedUnitsRepository
import com.sadellie.unitto.screens.main.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config


@ExperimentalCoroutinesApi
class CoroutineTestRule(private val dispatcher: TestDispatcher = UnconfinedTestDispatcher()) :
    TestWatcher() {

    override fun starting(description: Description) {
        super.starting(description)
        Dispatchers.setMain(dispatcher)
    }

    override fun finished(description: Description) {
        super.finished(description)
        Dispatchers.resetMain()
    }

}


@OptIn(ExperimentalCoroutinesApi::class)
@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner::class)
class MainViewModelTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    val coroutineTestRule = CoroutineTestRule()

    private lateinit var viewModel: MainViewModel
    private val allUnitsRepository = AllUnitsRepository()

    @Before
    fun setUp() {
        viewModel = MainViewModel(
            UserPreferencesRepository(
                DataStoreModule().provideUserPreferencesDataStore(
                    RuntimeEnvironment.getApplication()
                )
            ), MyBasedUnitsRepository(
                Room.inMemoryDatabaseBuilder(
                    RuntimeEnvironment.getApplication(), MyBasedUnitDatabase::class.java
                ).build().myBasedUnitDao()
            ), RuntimeEnvironment.getApplication(), allUnitsRepository
        )
    }

    @Test
    fun processInputTest() = runTest {
        // https://github.com/robolectric/robolectric/issues/6377#issuecomment-843779001
        StrictMode.enableDefaults()
        val testDispatcher = UnconfinedTestDispatcher(testScheduler)
        Dispatchers.setMain(testDispatcher)
        viewModel.mainFlow.launchIn(CoroutineScope(testDispatcher))

        /**
         * For simplicity comments will have structure:
         * currentInput | userInput | processed internal input | processed display output
         */
        `test 0`()
        `test digits from 1 to 9`()
        `test plus, divide and multiply operators`()
        `test dot`()
        `test minus`()
        `test brackets`()

        Dispatchers.resetMain()
    }

    private fun `test 0`() {
        // 0 | 000 | 0 | 0
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        assertEquals("0", viewModel.inputValue.value)
        assertEquals("0", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 123 | 000 | 123000
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_3)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        assertEquals("123000", viewModel.inputValue.value)
        assertEquals("123000", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 123. | 000 | 123.000
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_3)
        viewModel.processInput(KEY_DOT)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        assertEquals("123.000", viewModel.inputValue.value)
        assertEquals("123.000", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // - | 000 | -0
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        assertEquals("-0", viewModel.inputValue.value)
        assertEquals("–0", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 12+ | 000 | 12+0
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        assertEquals("12+0", viewModel.inputValue.value)
        assertEquals("12+0", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // √0 | 000 | √0
        viewModel.processInput(KEY_SQRT)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_0)
        assertEquals("√0", viewModel.inputValue.value)
        assertEquals("√0", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()
    }

    private fun `test digits from 1 to 9`() {
        // 0 | 123456789 | 123456789
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_3)
        viewModel.processInput(KEY_4)
        viewModel.processInput(KEY_5)
        viewModel.processInput(KEY_6)
        viewModel.processInput(KEY_7)
        viewModel.processInput(KEY_8)
        viewModel.processInput(KEY_9)
        assertEquals("123456789", viewModel.inputValue.value)
        assertEquals("123456789", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()
    }

    private fun `test plus, divide and multiply operators`() {
        // 0 | +++ | 0
        viewModel.processInput(KEY_PLUS)
        assertEquals("0", viewModel.inputValue.value)
        assertEquals("0", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 123 | +++ | 123+
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_3)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_PLUS)
        assertEquals("123+", viewModel.inputValue.value)
        assertEquals("123+", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 1- | *** | 1*
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MULTIPLY)
        viewModel.processInput(KEY_MULTIPLY)
        viewModel.processInput(KEY_MULTIPLY)
        assertEquals("1*", viewModel.inputValue.value)
        assertEquals("1×", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 1/- | +++ | 1+
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_DIVIDE)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_PLUS)
        assertEquals("1+", viewModel.inputValue.value)
        assertEquals("1+", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()
    }

    private fun `test dot`() {
        // 0 | . | 0.
        viewModel.processInput(KEY_DOT)
        assertEquals("0.", viewModel.inputValue.value)
        assertEquals("0.", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 1 | . | 1.
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_DOT)
        assertEquals("1.", viewModel.inputValue.value)
        assertEquals("1.", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 1+ | . | 1+.
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_DOT)
        assertEquals("1+.", viewModel.inputValue.value)
        assertEquals("1+.", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // √ | . | √.
        viewModel.processInput(KEY_SQRT)
        viewModel.processInput(KEY_DOT)
        assertEquals("√.", viewModel.inputValue.value)
        assertEquals("√.", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()
    }

    private fun `test minus`() {
        // 0 | --- | -
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        assertEquals("-", viewModel.inputValue.value)
        assertEquals("–", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 12 | --- | 12-
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        assertEquals("12-", viewModel.inputValue.value)
        assertEquals("12–", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 12+ | --- | 12-
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        assertEquals("12-", viewModel.inputValue.value)
        assertEquals("12–", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 12/ | --- | 12/-
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_DIVIDE)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        assertEquals("12/-", viewModel.inputValue.value)
        assertEquals("12÷–", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // √ | --- | √-
        viewModel.processInput(KEY_SQRT)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        viewModel.processInput(KEY_MINUS)
        assertEquals("√-", viewModel.inputValue.value)
        assertEquals("√–", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()
    }

    private fun `test brackets`() {
        // 0 | ( | (
        viewModel.processInput(KEY_LEFT_BRACKET)
        assertEquals("(", viewModel.inputValue.value)
        assertEquals("(", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // 0 | ((( | (((
        viewModel.processInput(KEY_LEFT_BRACKET)
        viewModel.processInput(KEY_LEFT_BRACKET)
        viewModel.processInput(KEY_LEFT_BRACKET)
        assertEquals("(((", viewModel.inputValue.value)
        assertEquals("(((", viewModel.mainFlow.value.inputValue)
        viewModel.clearInput()

        // √ | (10+2) | √(10+2)
        viewModel.processInput(KEY_SQRT)
        viewModel.processInput(KEY_LEFT_BRACKET)
        viewModel.processInput(KEY_1)
        viewModel.processInput(KEY_0)
        viewModel.processInput(KEY_PLUS)
        viewModel.processInput(KEY_2)
        viewModel.processInput(KEY_RIGHT_BRACKET)
        assertEquals("√(10+2)", viewModel.inputValue.value)
        assertEquals("√(10+2)", viewModel.mainFlow.value.inputValue)
    }

    @Test
    fun deleteSymbolTest() = runTest {
        // https://github.com/robolectric/robolectric/issues/6377#issuecomment-843779001
        StrictMode.enableDefaults()
        val testDispatcher = UnconfinedTestDispatcher(testScheduler)
        Dispatchers.setMain(testDispatcher)
        viewModel.mainFlow.launchIn(CoroutineScope(testDispatcher))

        listOf(
            KEY_1, KEY_2, KEY_3, KEY_4, KEY_5, KEY_6, KEY_7, KEY_8, KEY_9, KEY_0,
            KEY_DOT, KEY_COMMA, KEY_LEFT_BRACKET, KEY_RIGHT_BRACKET,
            KEY_PLUS, KEY_MINUS, KEY_DIVIDE, KEY_MULTIPLY, KEY_EXPONENT, KEY_SQRT,
        ).forEach {
            // We enter one symbol and delete it, should be default as a result
            viewModel.processInput(it)
            viewModel.deleteDigit()
            assertEquals("0", viewModel.mainFlow.value.inputValue)
            assertEquals("0", viewModel.inputValue.value)
        }
        viewModel.clearInput()

        // Now we check that we can delete multiple values
        viewModel.processInput(KEY_3)
        viewModel.processInput(KEY_SQRT)
        viewModel.processInput(KEY_9)
        viewModel.deleteDigit()
        assertEquals("3√", viewModel.inputValue.value)
        assertEquals("3√", viewModel.mainFlow.value.inputValue)

        Dispatchers.resetMain()
    }

}