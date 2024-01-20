/*
 * Unitto is a unit converter for Android
 * Copyright (c) 2023-2024 Elshan Agaev
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

package com.sadellie.unitto.data.converter.collections

import com.sadellie.unitto.core.base.R
import com.sadellie.unitto.data.model.UnitGroup
import com.sadellie.unitto.data.model.unit.AbstractUnit
import com.sadellie.unitto.data.model.unit.ReverseUnit
import com.sadellie.unitto.data.converter.UnitID
import java.math.BigDecimal

internal val currencyCollection: List<AbstractUnit> by lazy {
    listOf(
        ReverseUnit(UnitID.currency_1inch,    BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_1inch,    R.string.unit_currency_1inch_short),
        ReverseUnit(UnitID.currency_ada,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ada,      R.string.unit_currency_ada_short),
        ReverseUnit(UnitID.currency_aed,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_aed,      R.string.unit_currency_aed_short),
        ReverseUnit(UnitID.currency_afn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_afn,      R.string.unit_currency_afn_short),
        ReverseUnit(UnitID.currency_algo,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_algo,     R.string.unit_currency_algo_short),
        ReverseUnit(UnitID.currency_all,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_all,      R.string.unit_currency_all_short),
        ReverseUnit(UnitID.currency_amd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_amd,      R.string.unit_currency_amd_short),
        ReverseUnit(UnitID.currency_ang,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ang,      R.string.unit_currency_ang_short),
        ReverseUnit(UnitID.currency_aoa,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_aoa,      R.string.unit_currency_aoa_short),
        ReverseUnit(UnitID.currency_ars,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ars,      R.string.unit_currency_ars_short),
        ReverseUnit(UnitID.currency_atom,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_atom,     R.string.unit_currency_atom_short),
        ReverseUnit(UnitID.currency_aud,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_aud,      R.string.unit_currency_aud_short),
        ReverseUnit(UnitID.currency_avax,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_avax,     R.string.unit_currency_avax_short),
        ReverseUnit(UnitID.currency_awg,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_awg,      R.string.unit_currency_awg_short),
        ReverseUnit(UnitID.currency_azn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_azn,      R.string.unit_currency_azn_short),
        ReverseUnit(UnitID.currency_bam,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bam,      R.string.unit_currency_bam_short),
        ReverseUnit(UnitID.currency_bbd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bbd,      R.string.unit_currency_bbd_short),
        ReverseUnit(UnitID.currency_bch,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bch,      R.string.unit_currency_bch_short),
        ReverseUnit(UnitID.currency_bdt,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bdt,      R.string.unit_currency_bdt_short),
        ReverseUnit(UnitID.currency_bgn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bgn,      R.string.unit_currency_bgn_short),
        ReverseUnit(UnitID.currency_bhd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bhd,      R.string.unit_currency_bhd_short),
        ReverseUnit(UnitID.currency_bif,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bif,      R.string.unit_currency_bif_short),
        ReverseUnit(UnitID.currency_bmd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bmd,      R.string.unit_currency_bmd_short),
        ReverseUnit(UnitID.currency_bnb,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bnb,      R.string.unit_currency_bnb_short),
        ReverseUnit(UnitID.currency_bnd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bnd,      R.string.unit_currency_bnd_short),
        ReverseUnit(UnitID.currency_bob,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bob,      R.string.unit_currency_bob_short),
        ReverseUnit(UnitID.currency_brl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_brl,      R.string.unit_currency_brl_short),
        ReverseUnit(UnitID.currency_bsd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bsd,      R.string.unit_currency_bsd_short),
        ReverseUnit(UnitID.currency_btc,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_btc,      R.string.unit_currency_btc_short),
        ReverseUnit(UnitID.currency_btn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_btn,      R.string.unit_currency_btn_short),
        ReverseUnit(UnitID.currency_busd,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_busd,     R.string.unit_currency_busd_short),
        ReverseUnit(UnitID.currency_bwp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bwp,      R.string.unit_currency_bwp_short),
        ReverseUnit(UnitID.currency_byn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_byn,      R.string.unit_currency_byn_short),
        ReverseUnit(UnitID.currency_byr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_byr,      R.string.unit_currency_byr_short),
        ReverseUnit(UnitID.currency_bzd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_bzd,      R.string.unit_currency_bzd_short),
        ReverseUnit(UnitID.currency_cad,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cad,      R.string.unit_currency_cad_short),
        ReverseUnit(UnitID.currency_cdf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cdf,      R.string.unit_currency_cdf_short),
        ReverseUnit(UnitID.currency_chf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_chf,      R.string.unit_currency_chf_short),
        ReverseUnit(UnitID.currency_chz,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_chz,      R.string.unit_currency_chz_short),
        ReverseUnit(UnitID.currency_clf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_clf,      R.string.unit_currency_clf_short),
        ReverseUnit(UnitID.currency_clp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_clp,      R.string.unit_currency_clp_short),
        ReverseUnit(UnitID.currency_cny,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cny,      R.string.unit_currency_cny_short),
        ReverseUnit(UnitID.currency_cop,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cop,      R.string.unit_currency_cop_short),
        ReverseUnit(UnitID.currency_crc,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_crc,      R.string.unit_currency_crc_short),
        ReverseUnit(UnitID.currency_cro,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cro,      R.string.unit_currency_cro_short),
        ReverseUnit(UnitID.currency_cuc,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cuc,      R.string.unit_currency_cuc_short),
        ReverseUnit(UnitID.currency_cup,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cup,      R.string.unit_currency_cup_short),
        ReverseUnit(UnitID.currency_cve,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_cve,      R.string.unit_currency_cve_short),
        ReverseUnit(UnitID.currency_czk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_czk,      R.string.unit_currency_czk_short),
        ReverseUnit(UnitID.currency_dai,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_dai,      R.string.unit_currency_dai_short),
        ReverseUnit(UnitID.currency_djf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_djf,      R.string.unit_currency_djf_short),
        ReverseUnit(UnitID.currency_dkk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_dkk,      R.string.unit_currency_dkk_short),
        ReverseUnit(UnitID.currency_doge,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_doge,     R.string.unit_currency_doge_short),
        ReverseUnit(UnitID.currency_dop,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_dop,      R.string.unit_currency_dop_short),
        ReverseUnit(UnitID.currency_dot,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_dot,      R.string.unit_currency_dot_short),
        ReverseUnit(UnitID.currency_dzd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_dzd,      R.string.unit_currency_dzd_short),
        ReverseUnit(UnitID.currency_egld,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_egld,     R.string.unit_currency_egld_short),
        ReverseUnit(UnitID.currency_egp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_egp,      R.string.unit_currency_egp_short),
        ReverseUnit(UnitID.currency_enj,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_enj,      R.string.unit_currency_enj_short),
        ReverseUnit(UnitID.currency_ern,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ern,      R.string.unit_currency_ern_short),
        ReverseUnit(UnitID.currency_etb,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_etb,      R.string.unit_currency_etb_short),
        ReverseUnit(UnitID.currency_etc,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_etc,      R.string.unit_currency_etc_short),
        ReverseUnit(UnitID.currency_eth,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_eth,      R.string.unit_currency_eth_short),
        ReverseUnit(UnitID.currency_eur,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_eur,      R.string.unit_currency_eur_short),
        ReverseUnit(UnitID.currency_fil,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_fil,      R.string.unit_currency_fil_short),
        ReverseUnit(UnitID.currency_fjd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_fjd,      R.string.unit_currency_fjd_short),
        ReverseUnit(UnitID.currency_fkp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_fkp,      R.string.unit_currency_fkp_short),
        ReverseUnit(UnitID.currency_ftt,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ftt,      R.string.unit_currency_ftt_short),
        ReverseUnit(UnitID.currency_gbp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gbp,      R.string.unit_currency_gbp_short),
        ReverseUnit(UnitID.currency_gel,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gel,      R.string.unit_currency_gel_short),
        ReverseUnit(UnitID.currency_ggp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ggp,      R.string.unit_currency_ggp_short),
        ReverseUnit(UnitID.currency_ghs,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ghs,      R.string.unit_currency_ghs_short),
        ReverseUnit(UnitID.currency_gip,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gip,      R.string.unit_currency_gip_short),
        ReverseUnit(UnitID.currency_gmd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gmd,      R.string.unit_currency_gmd_short),
        ReverseUnit(UnitID.currency_gnf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gnf,      R.string.unit_currency_gnf_short),
        ReverseUnit(UnitID.currency_grt,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_grt,      R.string.unit_currency_grt_short),
        ReverseUnit(UnitID.currency_gtq,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gtq,      R.string.unit_currency_gtq_short),
        ReverseUnit(UnitID.currency_gyd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_gyd,      R.string.unit_currency_gyd_short),
        ReverseUnit(UnitID.currency_hkd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_hkd,      R.string.unit_currency_hkd_short),
        ReverseUnit(UnitID.currency_hnl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_hnl,      R.string.unit_currency_hnl_short),
        ReverseUnit(UnitID.currency_hrk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_hrk,      R.string.unit_currency_hrk_short),
        ReverseUnit(UnitID.currency_htg,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_htg,      R.string.unit_currency_htg_short),
        ReverseUnit(UnitID.currency_huf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_huf,      R.string.unit_currency_huf_short),
        ReverseUnit(UnitID.currency_icp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_icp,      R.string.unit_currency_icp_short),
        ReverseUnit(UnitID.currency_idr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_idr,      R.string.unit_currency_idr_short),
        ReverseUnit(UnitID.currency_ils,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ils,      R.string.unit_currency_ils_short),
        ReverseUnit(UnitID.currency_imp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_imp,      R.string.unit_currency_imp_short),
        ReverseUnit(UnitID.currency_inj,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_inj,      R.string.unit_currency_inj_short),
        ReverseUnit(UnitID.currency_inr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_inr,      R.string.unit_currency_inr_short),
        ReverseUnit(UnitID.currency_iqd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_iqd,      R.string.unit_currency_iqd_short),
        ReverseUnit(UnitID.currency_irr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_irr,      R.string.unit_currency_irr_short),
        ReverseUnit(UnitID.currency_isk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_isk,      R.string.unit_currency_isk_short),
        ReverseUnit(UnitID.currency_jep,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_jep,      R.string.unit_currency_jep_short),
        ReverseUnit(UnitID.currency_jmd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_jmd,      R.string.unit_currency_jmd_short),
        ReverseUnit(UnitID.currency_jod,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_jod,      R.string.unit_currency_jod_short),
        ReverseUnit(UnitID.currency_jpy,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_jpy,      R.string.unit_currency_jpy_short),
        ReverseUnit(UnitID.currency_kes,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kes,      R.string.unit_currency_kes_short),
        ReverseUnit(UnitID.currency_kgs,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kgs,      R.string.unit_currency_kgs_short),
        ReverseUnit(UnitID.currency_khr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_khr,      R.string.unit_currency_khr_short),
        ReverseUnit(UnitID.currency_kmf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kmf,      R.string.unit_currency_kmf_short),
        ReverseUnit(UnitID.currency_kpw,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kpw,      R.string.unit_currency_kpw_short),
        ReverseUnit(UnitID.currency_krw,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_krw,      R.string.unit_currency_krw_short),
        ReverseUnit(UnitID.currency_ksm,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ksm,      R.string.unit_currency_ksm_short),
        ReverseUnit(UnitID.currency_kwd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kwd,      R.string.unit_currency_kwd_short),
        ReverseUnit(UnitID.currency_kyd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kyd,      R.string.unit_currency_kyd_short),
        ReverseUnit(UnitID.currency_kzt,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_kzt,      R.string.unit_currency_kzt_short),
        ReverseUnit(UnitID.currency_lak,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lak,      R.string.unit_currency_lak_short),
        ReverseUnit(UnitID.currency_lbp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lbp,      R.string.unit_currency_lbp_short),
        ReverseUnit(UnitID.currency_link,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_link,     R.string.unit_currency_link_short),
        ReverseUnit(UnitID.currency_lkr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lkr,      R.string.unit_currency_lkr_short),
        ReverseUnit(UnitID.currency_lrd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lrd,      R.string.unit_currency_lrd_short),
        ReverseUnit(UnitID.currency_lsl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lsl,      R.string.unit_currency_lsl_short),
        ReverseUnit(UnitID.currency_ltc,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ltc,      R.string.unit_currency_ltc_short),
        ReverseUnit(UnitID.currency_ltl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ltl,      R.string.unit_currency_ltl_short),
        ReverseUnit(UnitID.currency_luna,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_luna,     R.string.unit_currency_luna_short),
        ReverseUnit(UnitID.currency_lvl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lvl,      R.string.unit_currency_lvl_short),
        ReverseUnit(UnitID.currency_lyd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_lyd,      R.string.unit_currency_lyd_short),
        ReverseUnit(UnitID.currency_mad,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mad,      R.string.unit_currency_mad_short),
        ReverseUnit(UnitID.currency_matic,    BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_matic,    R.string.unit_currency_matic_short),
        ReverseUnit(UnitID.currency_mdl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mdl,      R.string.unit_currency_mdl_short),
        ReverseUnit(UnitID.currency_mga,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mga,      R.string.unit_currency_mga_short),
        ReverseUnit(UnitID.currency_mkd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mkd,      R.string.unit_currency_mkd_short),
        ReverseUnit(UnitID.currency_mmk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mmk,      R.string.unit_currency_mmk_short),
        ReverseUnit(UnitID.currency_mnt,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mnt,      R.string.unit_currency_mnt_short),
        ReverseUnit(UnitID.currency_mop,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mop,      R.string.unit_currency_mop_short),
        ReverseUnit(UnitID.currency_mro,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mro,      R.string.unit_currency_mro_short),
        ReverseUnit(UnitID.currency_mur,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mur,      R.string.unit_currency_mur_short),
        ReverseUnit(UnitID.currency_mvr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mvr,      R.string.unit_currency_mvr_short),
        ReverseUnit(UnitID.currency_mwk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mwk,      R.string.unit_currency_mwk_short),
        ReverseUnit(UnitID.currency_mxn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mxn,      R.string.unit_currency_mxn_short),
        ReverseUnit(UnitID.currency_myr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_myr,      R.string.unit_currency_myr_short),
        ReverseUnit(UnitID.currency_mzn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_mzn,      R.string.unit_currency_mzn_short),
        ReverseUnit(UnitID.currency_nad,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_nad,      R.string.unit_currency_nad_short),
        ReverseUnit(UnitID.currency_ngn,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ngn,      R.string.unit_currency_ngn_short),
        ReverseUnit(UnitID.currency_nio,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_nio,      R.string.unit_currency_nio_short),
        ReverseUnit(UnitID.currency_nok,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_nok,      R.string.unit_currency_nok_short),
        ReverseUnit(UnitID.currency_npr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_npr,      R.string.unit_currency_npr_short),
        ReverseUnit(UnitID.currency_nzd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_nzd,      R.string.unit_currency_nzd_short),
        ReverseUnit(UnitID.currency_omr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_omr,      R.string.unit_currency_omr_short),
        ReverseUnit(UnitID.currency_one,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_one,      R.string.unit_currency_one_short),
        ReverseUnit(UnitID.currency_pab,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_pab,      R.string.unit_currency_pab_short),
        ReverseUnit(UnitID.currency_pen,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_pen,      R.string.unit_currency_pen_short),
        ReverseUnit(UnitID.currency_pgk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_pgk,      R.string.unit_currency_pgk_short),
        ReverseUnit(UnitID.currency_php,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_php,      R.string.unit_currency_php_short),
        ReverseUnit(UnitID.currency_pkr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_pkr,      R.string.unit_currency_pkr_short),
        ReverseUnit(UnitID.currency_pln,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_pln,      R.string.unit_currency_pln_short),
        ReverseUnit(UnitID.currency_pyg,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_pyg,      R.string.unit_currency_pyg_short),
        ReverseUnit(UnitID.currency_qar,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_qar,      R.string.unit_currency_qar_short),
        ReverseUnit(UnitID.currency_ron,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ron,      R.string.unit_currency_ron_short),
        ReverseUnit(UnitID.currency_rsd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_rsd,      R.string.unit_currency_rsd_short),
        ReverseUnit(UnitID.currency_rub,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_rub,      R.string.unit_currency_rub_short),
        ReverseUnit(UnitID.currency_rwf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_rwf,      R.string.unit_currency_rwf_short),
        ReverseUnit(UnitID.currency_sar,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sar,      R.string.unit_currency_sar_short),
        ReverseUnit(UnitID.currency_sbd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sbd,      R.string.unit_currency_sbd_short),
        ReverseUnit(UnitID.currency_scr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_scr,      R.string.unit_currency_scr_short),
        ReverseUnit(UnitID.currency_sdg,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sdg,      R.string.unit_currency_sdg_short),
        ReverseUnit(UnitID.currency_sek,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sek,      R.string.unit_currency_sek_short),
        ReverseUnit(UnitID.currency_sgd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sgd,      R.string.unit_currency_sgd_short),
        ReverseUnit(UnitID.currency_shib,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_shib,     R.string.unit_currency_shib_short),
        ReverseUnit(UnitID.currency_shp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_shp,      R.string.unit_currency_shp_short),
        ReverseUnit(UnitID.currency_sll,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sll,      R.string.unit_currency_sll_short),
        ReverseUnit(UnitID.currency_sol,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sol,      R.string.unit_currency_sol_short),
        ReverseUnit(UnitID.currency_sos,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_sos,      R.string.unit_currency_sos_short),
        ReverseUnit(UnitID.currency_srd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_srd,      R.string.unit_currency_srd_short),
        ReverseUnit(UnitID.currency_std,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_std,      R.string.unit_currency_std_short),
        ReverseUnit(UnitID.currency_svc,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_svc,      R.string.unit_currency_svc_short),
        ReverseUnit(UnitID.currency_syp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_syp,      R.string.unit_currency_syp_short),
        ReverseUnit(UnitID.currency_szl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_szl,      R.string.unit_currency_szl_short),
        ReverseUnit(UnitID.currency_thb,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_thb,      R.string.unit_currency_thb_short),
        ReverseUnit(UnitID.currency_theta,    BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_theta,    R.string.unit_currency_theta_short),
        ReverseUnit(UnitID.currency_tjs,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_tjs,      R.string.unit_currency_tjs_short),
        ReverseUnit(UnitID.currency_tmt,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_tmt,      R.string.unit_currency_tmt_short),
        ReverseUnit(UnitID.currency_tnd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_tnd,      R.string.unit_currency_tnd_short),
        ReverseUnit(UnitID.currency_top,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_top,      R.string.unit_currency_top_short),
        ReverseUnit(UnitID.currency_trx,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_trx,      R.string.unit_currency_trx_short),
        ReverseUnit(UnitID.currency_try,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_try,      R.string.unit_currency_try_short),
        ReverseUnit(UnitID.currency_ttd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ttd,      R.string.unit_currency_ttd_short),
        ReverseUnit(UnitID.currency_twd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_twd,      R.string.unit_currency_twd_short),
        ReverseUnit(UnitID.currency_tzs,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_tzs,      R.string.unit_currency_tzs_short),
        ReverseUnit(UnitID.currency_uah,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_uah,      R.string.unit_currency_uah_short),
        ReverseUnit(UnitID.currency_ugx,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_ugx,      R.string.unit_currency_ugx_short),
        ReverseUnit(UnitID.currency_uni,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_uni,      R.string.unit_currency_uni_short),
        ReverseUnit(UnitID.currency_usd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_usd,      R.string.unit_currency_usd_short),
        ReverseUnit(UnitID.currency_usdc,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_usdc,     R.string.unit_currency_usdc_short),
        ReverseUnit(UnitID.currency_usdt,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_usdt,     R.string.unit_currency_usdt_short),
        ReverseUnit(UnitID.currency_uyu,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_uyu,      R.string.unit_currency_uyu_short),
        ReverseUnit(UnitID.currency_uzs,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_uzs,      R.string.unit_currency_uzs_short),
        ReverseUnit(UnitID.currency_vef,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_vef,      R.string.unit_currency_vef_short),
        ReverseUnit(UnitID.currency_vet,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_vet,      R.string.unit_currency_vet_short),
        ReverseUnit(UnitID.currency_vnd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_vnd,      R.string.unit_currency_vnd_short),
        ReverseUnit(UnitID.currency_vuv,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_vuv,      R.string.unit_currency_vuv_short),
        ReverseUnit(UnitID.currency_wbtc,     BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_wbtc,     R.string.unit_currency_wbtc_short),
        ReverseUnit(UnitID.currency_wst,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_wst,      R.string.unit_currency_wst_short),
        ReverseUnit(UnitID.currency_xaf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xaf,      R.string.unit_currency_xaf_short),
        ReverseUnit(UnitID.currency_xag,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xag,      R.string.unit_currency_xag_short),
        ReverseUnit(UnitID.currency_xau,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xau,      R.string.unit_currency_xau_short),
        ReverseUnit(UnitID.currency_xcd,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xcd,      R.string.unit_currency_xcd_short),
        ReverseUnit(UnitID.currency_xdr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xdr,      R.string.unit_currency_xdr_short),
        ReverseUnit(UnitID.currency_xlm,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xlm,      R.string.unit_currency_xlm_short),
        ReverseUnit(UnitID.currency_xmr,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xmr,      R.string.unit_currency_xmr_short),
        ReverseUnit(UnitID.currency_xof,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xof,      R.string.unit_currency_xof_short),
        ReverseUnit(UnitID.currency_xpf,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xpf,      R.string.unit_currency_xpf_short),
        ReverseUnit(UnitID.currency_xrp,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_xrp,      R.string.unit_currency_xrp_short),
        ReverseUnit(UnitID.currency_yer,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_yer,      R.string.unit_currency_yer_short),
        ReverseUnit(UnitID.currency_zar,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_zar,      R.string.unit_currency_zar_short),
        ReverseUnit(UnitID.currency_zmk,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_zmk,      R.string.unit_currency_zmk_short),
        ReverseUnit(UnitID.currency_zmw,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_zmw,      R.string.unit_currency_zmw_short),
        ReverseUnit(UnitID.currency_zwl,      BigDecimal.ZERO, UnitGroup.CURRENCY, R.string.unit_currency_zwl,      R.string.unit_currency_zwl_short),
    )
}
