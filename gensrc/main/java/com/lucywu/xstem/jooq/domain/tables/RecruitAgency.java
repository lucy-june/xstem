/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables;


import com.lucywu.xstem.jooq.domain.Keys;
import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitAgencyRecord;

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
public class RecruitAgency extends TableImpl<RecruitAgencyRecord> {

	private static final long serialVersionUID = -1159366870;

	/**
	 * The reference instance of <code>ss1604c195_rd2.recruit_agency</code>
	 */
	public static final RecruitAgency RECRUIT_AGENCY = new RecruitAgency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RecruitAgencyRecord> getRecordType() {
		return RecruitAgencyRecord.class;
	}

	/**
	 * The column <code>ss1604c195_rd2.recruit_agency.agencyid</code>.
	 */
	public final TableField<RecruitAgencyRecord, Integer> AGENCYID = createField("agencyid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_agency.agency_url</code>.
	 */
	public final TableField<RecruitAgencyRecord, String> AGENCY_URL = createField("agency_url", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_agency.agency_tpl</code>. template
	 */
	public final TableField<RecruitAgencyRecord, String> AGENCY_TPL = createField("agency_tpl", org.jooq.impl.SQLDataType.CHAR.length(1), this, "template");

	/**
	 * The column <code>ss1604c195_rd2.recruit_agency.agency_auth</code>. auth string
	 */
	public final TableField<RecruitAgencyRecord, String> AGENCY_AUTH = createField("agency_auth", org.jooq.impl.SQLDataType.VARCHAR, this, "auth string");

	/**
	 * The column <code>ss1604c195_rd2.recruit_agency.agencyname</code>.
	 */
	public final TableField<RecruitAgencyRecord, String> AGENCYNAME = createField("agencyname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>ss1604c195_rd2.recruit_agency</code> table reference
	 */
	public RecruitAgency() {
		this("recruit_agency", null);
	}

	/**
	 * Create an aliased <code>ss1604c195_rd2.recruit_agency</code> table reference
	 */
	public RecruitAgency(String alias) {
		this(alias, RECRUIT_AGENCY);
	}

	private RecruitAgency(String alias, Table<RecruitAgencyRecord> aliased) {
		this(alias, aliased, null);
	}

	private RecruitAgency(String alias, Table<RecruitAgencyRecord> aliased, Field<?>[] parameters) {
		super(alias, Ss1604c195Rd2.SS1604C195_RD2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<RecruitAgencyRecord, Integer> getIdentity() {
		return Keys.IDENTITY_RECRUIT_AGENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RecruitAgencyRecord> getPrimaryKey() {
		return Keys.RECRUIT_AGENCY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RecruitAgencyRecord>> getKeys() {
		return Arrays.<UniqueKey<RecruitAgencyRecord>>asList(Keys.RECRUIT_AGENCY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitAgency as(String alias) {
		return new RecruitAgency(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RecruitAgency rename(String name) {
		return new RecruitAgency(name, null);
	}
}
