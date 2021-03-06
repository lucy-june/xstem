/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables;


import com.lucywu.xstem.jooq.domain.Keys;
import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPositionRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class RecruitPosition extends TableImpl<RecruitPositionRecord> {

	private static final long serialVersionUID = -1701661360;

	/**
	 * The reference instance of <code>ss1604c195_rd2.recruit_position</code>
	 */
	public static final RecruitPosition RECRUIT_POSITION = new RecruitPosition();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RecruitPositionRecord> getRecordType() {
		return RecruitPositionRecord.class;
	}

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.positionname</code>.
	 */
	public final TableField<RecruitPositionRecord, String> POSITIONNAME = createField("positionname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.number</code>.
	 */
	public final TableField<RecruitPositionRecord, Integer> NUMBER = createField("number", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.location_req</code>.
	 */
	public final TableField<RecruitPositionRecord, String> LOCATION_REQ = createField("location_req", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.date_req</code>.
	 */
	public final TableField<RecruitPositionRecord, Date> DATE_REQ = createField("date_req", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.duration_req</code>. months
	 */
	public final TableField<RecruitPositionRecord, Integer> DURATION_REQ = createField("duration_req", org.jooq.impl.SQLDataType.INTEGER, this, "months");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.skill_req1</code>.
	 */
	public final TableField<RecruitPositionRecord, String> SKILL_REQ1 = createField("skill_req1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.skill_req2</code>.
	 */
	public final TableField<RecruitPositionRecord, String> SKILL_REQ2 = createField("skill_req2", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.skill_req3</code>.
	 */
	public final TableField<RecruitPositionRecord, String> SKILL_REQ3 = createField("skill_req3", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.skill_req4</code>.
	 */
	public final TableField<RecruitPositionRecord, String> SKILL_REQ4 = createField("skill_req4", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.skill_req5</code>.
	 */
	public final TableField<RecruitPositionRecord, String> SKILL_REQ5 = createField("skill_req5", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.createdby</code>.
	 */
	public final TableField<RecruitPositionRecord, Integer> CREATEDBY = createField("createdby", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.updatedby</code>.
	 */
	public final TableField<RecruitPositionRecord, Integer> UPDATEDBY = createField("updatedby", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.createdat</code>.
	 */
	public final TableField<RecruitPositionRecord, Timestamp> CREATEDAT = createField("createdat", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.updatedat</code>.
	 */
	public final TableField<RecruitPositionRecord, Timestamp> UPDATEDAT = createField("updatedat", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.departmentid</code>.
	 */
	public final TableField<RecruitPositionRecord, Integer> DEPARTMENTID = createField("departmentid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.positionid</code>.
	 */
	public final TableField<RecruitPositionRecord, Integer> POSITIONID = createField("positionid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.description</code>.
	 */
	public final TableField<RecruitPositionRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_position.isvalid</code>.
	 */
	public final TableField<RecruitPositionRecord, Boolean> ISVALID = createField("isvalid", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>ss1604c195_rd2.recruit_position</code> table reference
	 */
	public RecruitPosition() {
		this("recruit_position", null);
	}

	/**
	 * Create an aliased <code>ss1604c195_rd2.recruit_position</code> table reference
	 */
	public RecruitPosition(String alias) {
		this(alias, RECRUIT_POSITION);
	}

	private RecruitPosition(String alias, Table<RecruitPositionRecord> aliased) {
		this(alias, aliased, null);
	}

	private RecruitPosition(String alias, Table<RecruitPositionRecord> aliased, Field<?>[] parameters) {
		super(alias, Ss1604c195Rd2.SS1604C195_RD2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<RecruitPositionRecord, Integer> getIdentity() {
		return Keys.IDENTITY_RECRUIT_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RecruitPositionRecord> getPrimaryKey() {
		return Keys.RECRUIT_POSITION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RecruitPositionRecord>> getKeys() {
		return Arrays.<UniqueKey<RecruitPositionRecord>>asList(Keys.RECRUIT_POSITION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitPosition as(String alias) {
		return new RecruitPosition(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RecruitPosition rename(String name) {
		return new RecruitPosition(name, null);
	}
}
