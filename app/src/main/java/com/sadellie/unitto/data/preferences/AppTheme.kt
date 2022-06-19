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

package com.sadellie.unitto.data.preferences

import android.os.Build
import com.sadellie.unitto.R


/**
 * All possible state of theme in the app
 */
object AppTheme {
    // Used on app launch when we don't know which theme to use
    const val NOT_SET = 0

    const val AUTO = 1
    const val LIGHT = 2
    const val DARK = 3
    const val LIGHT_DYNAMIC = 4
    const val DARK_DYNAMIC = 5
    const val AMOLED = 6
}

/**
 * Device specific map of available themes. Used in settings
 */
val APP_THEMES: Map<Int, Int> by lazy {
    // Dynamic themes are only for Android 8.1 and later
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
        mapOf(
            AppTheme.AUTO to R.string.force_auto_mode,
            AppTheme.LIGHT to R.string.force_light_mode,
            AppTheme.DARK to R.string.force_dark_mode,
            AppTheme.AMOLED to R.string.force_amoled_mode,
            AppTheme.LIGHT_DYNAMIC to R.string.force_light_dynamic_mode,
            AppTheme.DARK_DYNAMIC to R.string.force_dark_dynamic_mode,
        )
    } else {
        mapOf(
            AppTheme.AUTO to R.string.force_auto_mode,
            AppTheme.LIGHT to R.string.force_light_mode,
            AppTheme.DARK to R.string.force_dark_mode,
            AppTheme.AMOLED to R.string.force_amoled_mode,
        )
    }
}
