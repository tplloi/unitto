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

package com.sadellie.unitto.data.units

/**
 * All UnitIDs. Long file.
 *
 * NEVER CHANGE IDS THAT ARE ALREADY HERE, THESE IDS ARE USED IN DATABASE
 */
object MyUnitIDS {
    // LENGTH
    const val attometer = "attometer"
    const val nanometer = "nanometer"
    const val micrometer = "micrometer"
    const val millimeter = "millimeter"
    const val decimeter = "decimeter"
    const val centimeter = "centimeter"
    const val meter = "meter"
    const val kilometer = "kilometer"
    const val mile = "mile"
    const val yard = "yard"
    const val foot = "foot"
    const val inch = "inch"
    const val light_year = "light_year"
    const val parsec = "parsec"
    const val kiloparsec = "kiloparsec"
    const val megaparsec = "megaparsec"
    const val mercury_equatorial_radius = "mercury_equatorial_radius"
    const val venus_equatorial_radius = "venus_equatorial_radius"
    const val earth_equatorial_radius = "earth_equatorial_radius"
    const val mars_equatorial_radius = "mars_equatorial_radius"
    const val jupiter_equatorial_radius = "jupiter_equatorial_radius"
    const val saturn_equatorial_radius = "saturn_equatorial_radius"
    const val uranus_equatorial_radius = "uranus_equatorial_radius"
    const val neptune_equatorial_radius = "neptune_equatorial_radius"
    const val sun_equatorial_radius = "sun_equatorial_radius"

    // MASS
    const val electron_mass_rest = "electron_mass_rest"
    const val atomic_mass_unit = "atomic_mass_unit"
    const val milligram = "milligram"
    const val gram = "gram"
    const val kilogram = "kilogram"
    const val metric_ton = "metric_ton"
    const val imperial_ton = "imperial_ton"
    const val pound = "pound"
    const val ounce = "ounce"
    const val carat = "carat"
    const val mercury_mass = "mercury_mass"
    const val venus_mass = "venus_mass"
    const val earth_mass = "earth_mass"
    const val mars_mass = "mars_mass"
    const val jupiter_mass = "jupiter_mass"
    const val saturn_mass = "saturn_mass"
    const val uranus_mass = "uranus_mass"
    const val neptune_mass = "neptune_mass"
    const val sun_mass = "sun_mass"

    // TEMPERATURE
    const val celsius = "celsius"
    const val fahrenheit = "fahrenheit"
    const val kelvin = "kelvin"

    // SPEED
    const val millimeter_per_hour = "millimeter_per_hour"
    const val millimeter_per_minute = "millimeter_per_minute"
    const val millimeter_per_second = "millimeter_per_second"
    const val centimeter_per_hour = "centimeter_per_hour"
    const val centimeter_per_minute = "centimeter_per_minute"
    const val centimeter_per_second = "centimeter_per_second"
    const val kilometer_per_hour = "kilometer_per_hour"
    const val kilometer_per_minute = "kilometer_per_minute"
    const val kilometer_per_second = "kilometer_per_second"
    const val meter_per_hour = "meter_per_hour"
    const val meter_per_minute = "meter_per_minute"
    const val meter_per_second = "meter_per_second"
    const val foot_per_hour = "foot_per_hour"
    const val foot_per_minute = "foot_per_minute"
    const val foot_per_second = "foot_per_second"
    const val yard_per_hour = "yard_per_hour"
    const val yard_per_minute = "yard_per_minute"
    const val yard_per_second = "yard_per_second"
    const val mile_per_hour = "mile_per_hour"
    const val mile_per_minute = "mile_per_minute"
    const val mile_per_second = "mile_per_second"
    const val knot = "knot"
    const val velocity_of_light_in_vacuum = "velocity_of_light_in_vacuum"
    const val cosmic_velocity_first = "cosmic_velocity_first"
    const val cosmic_velocity_second = "cosmic_velocity_second"
    const val cosmic_velocity_third = "cosmic_velocity_third"
    const val earths_orbital_speed = "earths_orbital_speed"
    const val mach = "mach"
    const val mach_si_standard = "mach_si_standard"

    // DATA
    const val bit = "bit"
    const val kibibit = "kibibit"
    const val kilobit = "kilobit"
    const val megabit = "megabit"
    const val mebibit = "mebibit"
    const val gigabit = "gigabit"
    const val terabit = "terabit"
    const val petabit = "petabit"
    const val exabit = "exabit"
    const val byte = "byte"
    const val kibibyte = "kibibyte"
    const val kilobyte = "kilobyte"
    const val megabyte = "megabyte"
    const val mebibyte = "mebibyte"
    const val gigabyte = "gigabyte"
    const val terabyte = "terabyte"
    const val petabyte = "petabyte"
    const val exabyte = "exabyte"

    // VOLUME
    const val attoliter = "attoliter"
    const val milliliter = "milliliter"
    const val liter = "liter"
    const val us_liquid_gallon = "gallon"
    const val us_liquid_quart = "us_liquid_quart"
    const val us_liquid_pint = "us_liquid_pint"
    const val us_legal_cup = "us_legal_cup"
    const val us_fluid_ounce = "us_fluid_ounce"
    const val us_tablespoon = "us_tablespoon"
    const val us_teaspoon = "us_teaspoon"
    const val imperial_gallon = "imperial_gallon"
    const val imperial_quart = "imperial_quart"
    const val imperial_pint = "imperial_pint"
    const val imperial_cup = "imperial_cup"
    const val imperial_fluid_ounce = "imperial_fluid_ounce"
    const val imperial_tablespoon = "imperial_tablespoon"
    const val imperial_teaspoon = "imperial_teaspoon"
    const val cubic_millimeter = "cubic_millimeter"
    const val cubic_centimeter = "cubic_centimeter"
    const val cubic_meter = "cubic_meter"
    const val cubic_kilometer = "cubic_kilometer"

    // TIME
    const val attosecond = "attosecond"
    const val nanosecond = "nanosecond"
    const val microsecond = "microsecond"
    const val millisecond = "millisecond"
    const val jiffy = "jiffy"
    const val second = "second"
    const val minute = "minute"
    const val hour = "hour"
    const val day = "day"
    const val week = "week"

    // AREA
    const val electron_cross_section = "electron_cross_section"
    const val cent = "cent"
    const val acre = "acre"
    const val hectare = "hectare"
    const val square_foot = "square_foot"
    const val square_mile = "square_mile"
    const val square_yard = "square_yard"
    const val square_inch = "square_inch"
    const val square_micrometer = "square_micrometer"
    const val square_millimeter = "square_millimeter"
    const val square_centimeter = "square_centimeter"
    const val square_decimeter = "square_decimeter"
    const val square_meter = "square_meter"
    const val square_kilometer = "square_kilometer"

    // ENERGY
    const val electron_volt = "electron_volt"
    const val attojoule = "attojoule"
    const val joule = "joule"
    const val kilojoule = "kilojoule"
    const val gigajoule = "gigajoule"
    const val megajoule = "megajoule"
    const val energy_ton = "energy_ton"
    const val kiloton = "kiloton"
    const val megaton = "megaton"
    const val gigaton = "gigaton"
    const val energy_horse_power_metric = "energy_horse_power_metric"
    const val calorie_th = "calorie_th"
    const val kilocalorie_th = "kilocalorie_th"

    // POWER
    const val attowatt = "attowatt"
    const val watt = "watt"
    const val kilowatt = "kilowatt"
    const val megawatt = "megawatt"
    const val horse_power_mechanical = "horse_power_mechanical"

    // ANGLE
    const val angle_second = "angle_second"
    const val angle_minute = "angle_minute"
    const val degree = "degree"
    const val radian = "radian"
    const val sextant = "sextant"
    const val turn = "turn"

    // DATA TRANSFER
    const val bit_per_second = "bit_per_second"
    const val kibibit_per_second = "kibibit_per_second"
    const val kilobit_per_second = "kilobit_per_second"
    const val megabit_per_second = "megabit_per_second"
    const val mebibit_per_second = "mebibit_per_second"
    const val gigabit_per_second = "gigabit_per_second"
    const val terabit_per_second = "terabit_per_second"
    const val petabit_per_second = "petabit_per_second"
    const val exabit_per_second = "exabit_per_second"
    const val byte_per_second = "byte_per_second"
    const val kibibyte_per_second = "kibibyte_per_second"
    const val kilobyte_per_second = "kilobyte_per_second"
    const val megabyte_per_second = "megabyte_per_second"
    const val mebibyte_per_second = "mebibyte_per_second"
    const val gigabyte_per_second = "gigabyte_per_second"
    const val terabyte_per_second = "terabyte_per_second"
    const val petabyte_per_second = "petabyte_per_second"
    const val exabyte_per_second = "exabyte_per_second"

    // PRESSURE
    const val attopascal = "attopascal"
    const val femtopascal = "femtopascal"
    const val picopascal = "picopascal"
    const val nanopascal = "nanopascal"
    const val micropascal = "micropascal"
    const val millipascal = "millipascal"
    const val centipascal = "centipascal"
    const val decipascal = "decipascal"
    const val pascal = "pascal"
    const val dekapascal = "dekapascal"
    const val hectopascal = "hectopascal"
    const val millibar = "millibar"
    const val bar = "bar"
    const val kilopascal = "kilopascal"
    const val megapascal = "megapascal"
    const val gigapascal = "gigapascal"
    const val terapascal = "terapascal"
    const val petapascal = "petapascal"
    const val exapascal = "exapascal"
    const val psi = "psi"
    const val ksi = "ksi"
    const val standard_atmosphere = "standard_atmosphere"
    const val torr = "torr"
    const val micron_of_mercury = "micron_of_mercury"
    const val millimeter_of_mercury = "millimeter_of_mercury"

    // ACCELERATION
    const val attometer_per_square_second = "attometer_per_square_second"
    const val femtometer_per_square_second = "femtometer_per_square_second"
    const val picometer_per_square_second = "picometer_per_square_second"
    const val nanometer_per_square_second = "nanometer_per_square_second"
    const val micrometer_per_square_second = "micrometer_per_square_second"
    const val millimeter_per_square_second = "millimeter_per_square_second"
    const val centimeter_per_square_second = "centimeter_per_square_second"
    const val decimeter_per_square_second = "decimeter_per_square_second"
    const val meter_per_square_second = "meter_per_square_second"
    const val kilometer_per_square_second = "kilometer_per_square_second"
    const val dekameter_per_square_second = "dekameter_per_square_second"
    const val hectometer_per_square_second = "hectometer_per_square_second"
    const val gal = "gal"
    const val mercury_surface_gravity = "mercury_surface_gravity"
    const val venus_surface_gravity = "venus_surface_gravity"
    const val earth_surface_gravity = "earth_surface_gravity"
    const val mars_surface_gravity = "mars_surface_gravity"
    const val jupiter_surface_gravity = "jupiter_surface_gravity"
    const val saturn_surface_gravity = "saturn_surface_gravity"
    const val uranus_surface_gravity = "uranus_surface_gravity"
    const val neptune_surface_gravity = "neptune_surface_gravity"
    const val sun_surface_gravity = "sun_surface_gravity"

    // CURRENCY
    const val currency_1inch = "1inch"
    const val currency_ada = "ada"
    const val currency_aed = "aed"
    const val currency_afn = "afn"
    const val currency_algo = "algo"
    const val currency_all = "all"
    const val currency_amd = "amd"
    const val currency_ang = "ang"
    const val currency_aoa = "aoa"
    const val currency_ars = "ars"
    const val currency_atom = "atom"
    const val currency_aud = "aud"
    const val currency_avax = "avax"
    const val currency_awg = "awg"
    const val currency_azn = "azn"
    const val currency_bam = "bam"
    const val currency_bbd = "bbd"
    const val currency_bch = "bch"
    const val currency_bdt = "bdt"
    const val currency_bgn = "bgn"
    const val currency_bhd = "bhd"
    const val currency_bif = "bif"
    const val currency_bmd = "bmd"
    const val currency_bnb = "bnb"
    const val currency_bnd = "bnd"
    const val currency_bob = "bob"
    const val currency_brl = "brl"
    const val currency_bsd = "bsd"
    const val currency_btc = "btc"
    const val currency_btn = "btn"
    const val currency_busd = "busd"
    const val currency_bwp = "bwp"
    const val currency_byn = "byn"
    const val currency_byr = "byr"
    const val currency_bzd = "bzd"
    const val currency_cad = "cad"
    const val currency_cdf = "cdf"
    const val currency_chf = "chf"
    const val currency_chz = "chz"
    const val currency_clf = "clf"
    const val currency_clp = "clp"
    const val currency_cny = "cny"
    const val currency_cop = "cop"
    const val currency_crc = "crc"
    const val currency_cro = "cro"
    const val currency_cuc = "cuc"
    const val currency_cup = "cup"
    const val currency_cve = "cve"
    const val currency_czk = "czk"
    const val currency_dai = "dai"
    const val currency_djf = "djf"
    const val currency_dkk = "dkk"
    const val currency_doge = "doge"
    const val currency_dop = "dop"
    const val currency_dot = "dot"
    const val currency_dzd = "dzd"
    const val currency_egld = "egld"
    const val currency_egp = "egp"
    const val currency_enj = "enj"
    const val currency_ern = "ern"
    const val currency_etb = "etb"
    const val currency_etc = "etc"
    const val currency_eth = "eth"
    const val currency_eur = "eur"
    const val currency_fil = "fil"
    const val currency_fjd = "fjd"
    const val currency_fkp = "fkp"
    const val currency_ftt = "ftt"
    const val currency_gbp = "gbp"
    const val currency_gel = "gel"
    const val currency_ggp = "ggp"
    const val currency_ghs = "ghs"
    const val currency_gip = "gip"
    const val currency_gmd = "gmd"
    const val currency_gnf = "gnf"
    const val currency_grt = "grt"
    const val currency_gtq = "gtq"
    const val currency_gyd = "gyd"
    const val currency_hkd = "hkd"
    const val currency_hnl = "hnl"
    const val currency_hrk = "hrk"
    const val currency_htg = "htg"
    const val currency_huf = "huf"
    const val currency_icp = "icp"
    const val currency_idr = "idr"
    const val currency_ils = "ils"
    const val currency_imp = "imp"
    const val currency_inj = "inj"
    const val currency_inr = "inr"
    const val currency_iqd = "iqd"
    const val currency_irr = "irr"
    const val currency_isk = "isk"
    const val currency_jep = "jep"
    const val currency_jmd = "jmd"
    const val currency_jod = "jod"
    const val currency_jpy = "jpy"
    const val currency_kes = "kes"
    const val currency_kgs = "kgs"
    const val currency_khr = "khr"
    const val currency_kmf = "kmf"
    const val currency_kpw = "kpw"
    const val currency_krw = "krw"
    const val currency_ksm = "ksm"
    const val currency_kwd = "kwd"
    const val currency_kyd = "kyd"
    const val currency_kzt = "kzt"
    const val currency_lak = "lak"
    const val currency_lbp = "lbp"
    const val currency_link = "link"
    const val currency_lkr = "lkr"
    const val currency_lrd = "lrd"
    const val currency_lsl = "lsl"
    const val currency_ltc = "ltc"
    const val currency_ltl = "ltl"
    const val currency_luna = "luna"
    const val currency_lvl = "lvl"
    const val currency_lyd = "lyd"
    const val currency_mad = "mad"
    const val currency_matic = "matic"
    const val currency_mdl = "mdl"
    const val currency_mga = "mga"
    const val currency_mkd = "mkd"
    const val currency_mmk = "mmk"
    const val currency_mnt = "mnt"
    const val currency_mop = "mop"
    const val currency_mro = "mro"
    const val currency_mur = "mur"
    const val currency_mvr = "mvr"
    const val currency_mwk = "mwk"
    const val currency_mxn = "mxn"
    const val currency_myr = "myr"
    const val currency_mzn = "mzn"
    const val currency_nad = "nad"
    const val currency_ngn = "ngn"
    const val currency_nio = "nio"
    const val currency_nok = "nok"
    const val currency_npr = "npr"
    const val currency_nzd = "nzd"
    const val currency_omr = "omr"
    const val currency_one = "one"
    const val currency_pab = "pab"
    const val currency_pen = "pen"
    const val currency_pgk = "pgk"
    const val currency_php = "php"
    const val currency_pkr = "pkr"
    const val currency_pln = "pln"
    const val currency_pyg = "pyg"
    const val currency_qar = "qar"
    const val currency_ron = "ron"
    const val currency_rsd = "rsd"
    const val currency_rub = "rub"
    const val currency_rwf = "rwf"
    const val currency_sar = "sar"
    const val currency_sbd = "sbd"
    const val currency_scr = "scr"
    const val currency_sdg = "sdg"
    const val currency_sek = "sek"
    const val currency_sgd = "sgd"
    const val currency_shib = "shib"
    const val currency_shp = "shp"
    const val currency_sll = "sll"
    const val currency_sol = "sol"
    const val currency_sos = "sos"
    const val currency_srd = "srd"
    const val currency_std = "std"
    const val currency_svc = "svc"
    const val currency_syp = "syp"
    const val currency_szl = "szl"
    const val currency_thb = "thb"
    const val currency_theta = "theta"
    const val currency_tjs = "tjs"
    const val currency_tmt = "tmt"
    const val currency_tnd = "tnd"
    const val currency_top = "top"
    const val currency_trx = "trx"
    const val currency_try = "try"
    const val currency_ttd = "ttd"
    const val currency_twd = "twd"
    const val currency_tzs = "tzs"
    const val currency_uah = "uah"
    const val currency_ugx = "ugx"
    const val currency_uni = "uni"
    const val currency_usd = "usd"
    const val currency_usdc = "usdc"
    const val currency_usdt = "usdt"
    const val currency_uyu = "uyu"
    const val currency_uzs = "uzs"
    const val currency_vef = "vef"
    const val currency_vet = "vet"
    const val currency_vnd = "vnd"
    const val currency_vuv = "vuv"
    const val currency_wbtc = "wbtc"
    const val currency_wst = "wst"
    const val currency_xaf = "xaf"
    const val currency_xag = "xag"
    const val currency_xau = "xau"
    const val currency_xcd = "xcd"
    const val currency_xdr = "xdr"
    const val currency_xlm = "xlm"
    const val currency_xmr = "xmr"
    const val currency_xof = "xof"
    const val currency_xpf = "xpf"
    const val currency_xrp = "xrp"
    const val currency_yer = "yer"
    const val currency_zar = "zar"
    const val currency_zmk = "zmk"
    const val currency_zmw = "zmw"
    const val currency_zwl = "zwl"

    // FLUX
    const val maxwell = "maxwell"
    const val weber = "weber"
    const val milliweber = "milliweber"
    const val microweber = "microweber"
    const val kiloweber = "kiloweber"
    const val megaweber = "megaweber"
    const val gigaweber = "gigaweber"

    // NUMBER BASE
    const val binary = "binary"
    const val ternary = "ternary"
    const val quaternary = "quaternary"
    const val quinary = "quinary"
    const val senary = "senary"
    const val septenary = "septenary"
    const val octal = "octal"
    const val nonary = "nonary"
    const val decimal = "decimal"
    const val undecimal = "undecimal"
    const val duodecimal = "duodecimal"
    const val tridecimal = "tridecimal"
    const val tetradecimal = "tetradecimal"
    const val pentadecimal = "pentadecimal"
    const val hexadecimal = "hexadecimal"
}