/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.routines;


import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FnRecruitPositionInsert extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 714971605;

	/**
	 * The parameter <code>ss1604c195_rd2.fn_recruit_position_insert.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"), false);

	/**
	 * Create a new routine call instance
	 */
	public FnRecruitPositionInsert() {
		super("fn_recruit_position_insert", Ss1604c195Rd2.SS1604C195_RD2, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

		setReturnParameter(RETURN_VALUE);
	}
}
