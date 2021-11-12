/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables;


import com.lucywu.xstem.jooq.domain.Keys;
import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPoolRecord;

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
public class RecruitPool extends TableImpl<RecruitPoolRecord> {

	private static final long serialVersionUID = 247379047;

	/**
	 * The reference instance of <code>ss1604c195_rd2.recruit_pool</code>
	 */
	public static final RecruitPool RECRUIT_POOL = new RecruitPool();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RecruitPoolRecord> getRecordType() {
		return RecruitPoolRecord.class;
	}

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.poolid</code>.
	 */
	public final TableField<RecruitPoolRecord, Integer> POOLID = createField("poolid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.positionid</code>.
	 */
	public final TableField<RecruitPoolRecord, Integer> POSITIONID = createField("positionid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.realnumber</code>.
	 */
	public final TableField<RecruitPoolRecord, Integer> REALNUMBER = createField("realnumber", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.apply_due</code>.
	 */
	public final TableField<RecruitPoolRecord, Date> APPLY_DUE = createField("apply_due", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.apply_start</code>.
	 */
	public final TableField<RecruitPoolRecord, Date> APPLY_START = createField("apply_start", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.poster_url</code>.
	 */
	public final TableField<RecruitPoolRecord, String> POSTER_URL = createField("poster_url", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.createdby</code>.
	 */
	public final TableField<RecruitPoolRecord, Integer> CREATEDBY = createField("createdby", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.updatedby</code>.
	 */
	public final TableField<RecruitPoolRecord, Integer> UPDATEDBY = createField("updatedby", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.createdat</code>.
	 */
	public final TableField<RecruitPoolRecord, Timestamp> CREATEDAT = createField("createdat", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.updatedat</code>.
	 */
	public final TableField<RecruitPoolRecord, Timestamp> UPDATEDAT = createField("updatedat", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>ss1604c195_rd2.recruit_pool.isvalid</code>.
	 */
	public final TableField<RecruitPoolRecord, Boolean> ISVALID = createField("isvalid", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>ss1604c195_rd2.recruit_pool</code> table reference
	 */
	public RecruitPool() {
		this("recruit_pool", null);
	}

	/**
	 * Create an aliased <code>ss1604c195_rd2.recruit_pool</code> table reference
	 */
	public RecruitPool(String alias) {
		this(alias, RECRUIT_POOL);
	}

	private RecruitPool(String alias, Table<RecruitPoolRecord> aliased) {
		this(alias, aliased, null);
	}

	private RecruitPool(String alias, Table<RecruitPoolRecord> aliased, Field<?>[] parameters) {
		super(alias, Ss1604c195Rd2.SS1604C195_RD2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<RecruitPoolRecord, Integer> getIdentity() {
		return Keys.IDENTITY_RECRUIT_POOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RecruitPoolRecord> getPrimaryKey() {
		return Keys.RECRUIT_POOL_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RecruitPoolRecord>> getKeys() {
		return Arrays.<UniqueKey<RecruitPoolRecord>>asList(Keys.RECRUIT_POOL_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitPool as(String alias) {
		return new RecruitPool(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RecruitPool rename(String name) {
		return new RecruitPool(name, null);
	}
}
