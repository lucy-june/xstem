/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables;


import com.lucywu.xstem.jooq.domain.Keys;
import com.lucywu.xstem.jooq.domain.Ss1604c195Rd2;
import com.lucywu.xstem.jooq.domain.tables.records.SnsTimelineRecord;

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
public class SnsTimeline extends TableImpl<SnsTimelineRecord> {

	private static final long serialVersionUID = 1152251704;

	/**
	 * The reference instance of <code>ss1604c195_rd2.sns_timeline</code>
	 */
	public static final SnsTimeline SNS_TIMELINE = new SnsTimeline();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SnsTimelineRecord> getRecordType() {
		return SnsTimelineRecord.class;
	}

	/**
	 * The column <code>ss1604c195_rd2.sns_timeline.timelineid</code>.
	 */
	public final TableField<SnsTimelineRecord, Integer> TIMELINEID = createField("timelineid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ss1604c195_rd2.sns_timeline.refid</code>.
	 */
	public final TableField<SnsTimelineRecord, Integer> REFID = createField("refid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.sns_timeline.refrole</code>.
	 */
	public final TableField<SnsTimelineRecord, Integer> REFROLE = createField("refrole", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ss1604c195_rd2.sns_timeline.time</code>.
	 */
	public final TableField<SnsTimelineRecord, Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>ss1604c195_rd2.sns_timeline.content</code>.
	 */
	public final TableField<SnsTimelineRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>ss1604c195_rd2.sns_timeline.status</code>. 0-sending
1-displaying
2-deleted
	 */
	public final TableField<SnsTimelineRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "0-sending\r\n1-displaying\r\n2-deleted");

	/**
	 * Create a <code>ss1604c195_rd2.sns_timeline</code> table reference
	 */
	public SnsTimeline() {
		this("sns_timeline", null);
	}

	/**
	 * Create an aliased <code>ss1604c195_rd2.sns_timeline</code> table reference
	 */
	public SnsTimeline(String alias) {
		this(alias, SNS_TIMELINE);
	}

	private SnsTimeline(String alias, Table<SnsTimelineRecord> aliased) {
		this(alias, aliased, null);
	}

	private SnsTimeline(String alias, Table<SnsTimelineRecord> aliased, Field<?>[] parameters) {
		super(alias, Ss1604c195Rd2.SS1604C195_RD2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<SnsTimelineRecord, Integer> getIdentity() {
		return Keys.IDENTITY_SNS_TIMELINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SnsTimelineRecord> getPrimaryKey() {
		return Keys.SNS_TIMELINE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SnsTimelineRecord>> getKeys() {
		return Arrays.<UniqueKey<SnsTimelineRecord>>asList(Keys.SNS_TIMELINE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsTimeline as(String alias) {
		return new SnsTimeline(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SnsTimeline rename(String name) {
		return new SnsTimeline(name, null);
	}
}
