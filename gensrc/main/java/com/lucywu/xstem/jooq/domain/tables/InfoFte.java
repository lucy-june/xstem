/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables;


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

import com.lucywu.xstem.jooq.domain.Keys;
import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;
import com.lucywu.xstem.jooq.domain.tables.records.InfoFteRecord;


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
public class InfoFte extends TableImpl<InfoFteRecord> {

	private static final long serialVersionUID = 435876058;

	/**
	 * The reference instance of <code>ss1604c195_rd2.info_fte</code>
	 */
	public static final InfoFte INFO_FTE = new InfoFte();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InfoFteRecord> getRecordType() {
		return InfoFteRecord.class;
	}

	/**
	 * The column <code>ss1604c195_rd2.info_fte.fteid</code>.
	 */
	public final TableField<InfoFteRecord, Integer> FTEID = createField("fteid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.name</code>.
	 */
	public final TableField<InfoFteRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.email</code>.
	 */
	public final TableField<InfoFteRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.gender</code>.
	 */
	public final TableField<InfoFteRecord, Boolean> GENDER = createField("gender", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.telephone</code>.
	 */
	public final TableField<InfoFteRecord, String> TELEPHONE = createField("telephone", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.departmentid</code>.
	 */
	public final TableField<InfoFteRecord, Integer> DEPARTMENTID = createField("departmentid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.birthday</code>.
	 */
	public final TableField<InfoFteRecord, Date> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.location</code>.
	 */
	public final TableField<InfoFteRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.role</code>. 0-admin
1-hrm
2-hr
3-mg
4-other
	 */
	public final TableField<InfoFteRecord, Integer> ROLE = createField("role", org.jooq.impl.SQLDataType.INTEGER, this, "0-admin\r\n1-hrm\r\n2-hr\r\n3-mg\r\n4-other");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.email_self</code>.
	 */
	public final TableField<InfoFteRecord, String> EMAIL_SELF = createField("email_self", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.info_fte.phone</code>.
	 */
	public final TableField<InfoFteRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>ss1604c195_rd2.info_fte</code> table reference
	 */
	public InfoFte() {
		this("info_fte", null);
	}

	/**
	 * Create an aliased <code>ss1604c195_rd2.info_fte</code> table reference
	 */
	public InfoFte(String alias) {
		this(alias, INFO_FTE);
	}

	private InfoFte(String alias, Table<InfoFteRecord> aliased) {
		this(alias, aliased, null);
	}

	private InfoFte(String alias, Table<InfoFteRecord> aliased, Field<?>[] parameters) {
		super(alias, Ss1604c195Rd2.SS1604C195_RD2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<InfoFteRecord, Integer> getIdentity() {
		return Keys.IDENTITY_INFO_FTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<InfoFteRecord> getPrimaryKey() {
		return Keys.INFO_FTE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<InfoFteRecord>> getKeys() {
		return Arrays.<UniqueKey<InfoFteRecord>>asList(Keys.INFO_FTE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InfoFte as(String alias) {
		return new InfoFte(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InfoFte rename(String name) {
		return new InfoFte(name, null);
	}
}
