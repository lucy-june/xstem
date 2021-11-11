/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;

import com.lucywu.xstem.jooq.domain.routines.FnRecruitApplymentInsert;
import com.lucywu.xstem.jooq.domain.routines.FnRecruitApplymentUpdate;
import com.lucywu.xstem.jooq.domain.routines.FnRecruitPoolInsert;
import com.lucywu.xstem.jooq.domain.routines.FnRecruitPoolUpdate;
import com.lucywu.xstem.jooq.domain.routines.FnRecruitPositionInsert;
import com.lucywu.xstem.jooq.domain.routines.FnRecruitPositionUpdate;
import com.lucywu.xstem.jooq.domain.routines.FnStaffingChangeInsert;
import com.lucywu.xstem.jooq.domain.routines.FnStaffingChangeUpdate;


/**
 * Convenience access to all stored procedures and functions in ss1604c195_rd2
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>ss1604c195_rd2.fn_recruit_applyment_insert</code>
	 */
	public static Object fnRecruitApplymentInsert(Configuration configuration) {
		FnRecruitApplymentInsert f = new FnRecruitApplymentInsert();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_recruit_applyment_insert</code> as a field.
	 */
	public static Field<Object> fnRecruitApplymentInsert() {
		FnRecruitApplymentInsert f = new FnRecruitApplymentInsert();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_recruit_applyment_update</code>
	 */
	public static Object fnRecruitApplymentUpdate(Configuration configuration) {
		FnRecruitApplymentUpdate f = new FnRecruitApplymentUpdate();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_recruit_applyment_update</code> as a field.
	 */
	public static Field<Object> fnRecruitApplymentUpdate() {
		FnRecruitApplymentUpdate f = new FnRecruitApplymentUpdate();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_recruit_pool_insert</code>
	 */
	public static Object fnRecruitPoolInsert(Configuration configuration) {
		FnRecruitPoolInsert f = new FnRecruitPoolInsert();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_recruit_pool_insert</code> as a field.
	 */
	public static Field<Object> fnRecruitPoolInsert() {
		FnRecruitPoolInsert f = new FnRecruitPoolInsert();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_recruit_pool_update</code>
	 */
	public static Object fnRecruitPoolUpdate(Configuration configuration) {
		FnRecruitPoolUpdate f = new FnRecruitPoolUpdate();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_recruit_pool_update</code> as a field.
	 */
	public static Field<Object> fnRecruitPoolUpdate() {
		FnRecruitPoolUpdate f = new FnRecruitPoolUpdate();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_recruit_position_insert</code>
	 */
	public static Object fnRecruitPositionInsert(Configuration configuration) {
		FnRecruitPositionInsert f = new FnRecruitPositionInsert();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_recruit_position_insert</code> as a field.
	 */
	public static Field<Object> fnRecruitPositionInsert() {
		FnRecruitPositionInsert f = new FnRecruitPositionInsert();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_recruit_position_update</code>
	 */
	public static Object fnRecruitPositionUpdate(Configuration configuration) {
		FnRecruitPositionUpdate f = new FnRecruitPositionUpdate();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_recruit_position_update</code> as a field.
	 */
	public static Field<Object> fnRecruitPositionUpdate() {
		FnRecruitPositionUpdate f = new FnRecruitPositionUpdate();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_staffing_change_insert</code>
	 */
	public static Object fnStaffingChangeInsert(Configuration configuration) {
		FnStaffingChangeInsert f = new FnStaffingChangeInsert();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_staffing_change_insert</code> as a field.
	 */
	public static Field<Object> fnStaffingChangeInsert() {
		FnStaffingChangeInsert f = new FnStaffingChangeInsert();

		return f.asField();
	}

	/**
	 * Call <code>ss1604c195_rd2.fn_staffing_change_update</code>
	 */
	public static Object fnStaffingChangeUpdate(Configuration configuration) {
		FnStaffingChangeUpdate f = new FnStaffingChangeUpdate();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>ss1604c195_rd2.fn_staffing_change_update</code> as a field.
	 */
	public static Field<Object> fnStaffingChangeUpdate() {
		FnStaffingChangeUpdate f = new FnStaffingChangeUpdate();

		return f.asField();
	}
}
