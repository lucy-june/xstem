/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables;


import com.lucywu.xstem.jooq.domain.Keys;
import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;
import com.lucywu.xstem.jooq.domain.tables.records.InfoSteRecord;

import java.sql.Date;
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
public class InfoSte extends TableImpl<InfoSteRecord> {

	private static final long serialVersionUID = 63447173;

	/**
	 * The reference instance of <code>ss1604c195_rd2.info_ste</code>
	 */
	public static final InfoSte INFO_STE = new InfoSte();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InfoSteRecord> getRecordType() {
		return InfoSteRecord.class;
	}

	/**
	 * The column <code>ss1604c195_rd2.info_ste.steid</code>.
	 */
	public final TableField<InfoSteRecord, Integer> STEID = createField("steid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.name</code>.
	 */
	public final TableField<InfoSteRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.gender</code>.
	 */
	public final TableField<InfoSteRecord, Boolean> GENDER = createField("gender", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.birthday</code>.
	 */
	public final TableField<InfoSteRecord, Date> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.location</code>.
	 */
	public final TableField<InfoSteRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.email</code>.
	 */
	public final TableField<InfoSteRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.email_self</code>.
	 */
	public final TableField<InfoSteRecord, String> EMAIL_SELF = createField("email_self", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.phone</code>.
	 */
	public final TableField<InfoSteRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.telephone</code>.
	 */
	public final TableField<InfoSteRecord, String> TELEPHONE = createField("telephone", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.departmentid</code>.
	 */
	public final TableField<InfoSteRecord, Integer> DEPARTMENTID = createField("departmentid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.role</code>. 10-candidate ste
11-ste
12-dismissed ste
	 */
	public final TableField<InfoSteRecord, Integer> ROLE = createField("role", org.jooq.impl.SQLDataType.INTEGER, this, "10-candidate ste\r\n11-ste\r\n12-dismissed ste");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.offer_url</code>.
	 */
	public final TableField<InfoSteRecord, String> OFFER_URL = createField("offer_url", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.contract_url</code>.
	 */
	public final TableField<InfoSteRecord, String> CONTRACT_URL = createField("contract_url", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.positionid</code>.
	 */
	public final TableField<InfoSteRecord, Integer> POSITIONID = createField("positionid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.skills</code>.
	 */
	public final TableField<InfoSteRecord, String> SKILLS = createField("skills", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.experiences</code>.
	 */
	public final TableField<InfoSteRecord, String> EXPERIENCES = createField("experiences", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_ste.resume_url</code>.
	 */
	public final TableField<InfoSteRecord, String> RESUME_URL = createField("resume_url", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>ss1604c195_rd2.info_ste</code> table reference
	 */
	public InfoSte() {
		this("info_ste", null);
	}

	/**
	 * Create an aliased <code>ss1604c195_rd2.info_ste</code> table reference
	 */
	public InfoSte(String alias) {
		this(alias, INFO_STE);
	}

	private InfoSte(String alias, Table<InfoSteRecord> aliased) {
		this(alias, aliased, null);
	}

	private InfoSte(String alias, Table<InfoSteRecord> aliased, Field<?>[] parameters) {
		super(alias, Ss1604c195Rd2.SS1604C195_RD2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<InfoSteRecord, Integer> getIdentity() {
		return Keys.IDENTITY_INFO_STE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<InfoSteRecord> getPrimaryKey() {
		return Keys.INFO_STE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<InfoSteRecord>> getKeys() {
		return Arrays.<UniqueKey<InfoSteRecord>>asList(Keys.INFO_STE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InfoSte as(String alias) {
		return new InfoSte(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InfoSte rename(String name) {
		return new InfoSte(name, null);
	}
}
