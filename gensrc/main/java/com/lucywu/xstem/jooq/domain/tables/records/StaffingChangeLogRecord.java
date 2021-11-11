/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import com.lucywu.xstem.jooq.domain.tables.StaffingChangeLog;


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
public class StaffingChangeLogRecord extends UpdatableRecordImpl<StaffingChangeLogRecord> implements Record12<Integer, Integer, Integer, Date, Integer, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer> {

	private static final long serialVersionUID = 428688745;

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.steid</code>.
	 */
	public void setSteid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.steid</code>.
	 */
	public Integer getSteid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.from_positionid</code>. null if from candidate
	 */
	public void setFromPositionid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.from_positionid</code>. null if from candidate
	 */
	public Integer getFromPositionid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.to_positionid</code>. null if dismissed
0 if regularization
	 */
	public void setToPositionid(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.to_positionid</code>. null if dismissed
0 if regularization
	 */
	public Integer getToPositionid() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.date_req</code>.
	 */
	public void setDateReq(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.date_req</code>.
	 */
	public Date getDateReq() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.duration_req</code>. months
	 */
	public void setDurationReq(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.duration_req</code>. months
	 */
	public Integer getDurationReq() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.createdby</code>.
	 */
	public void setCreatedby(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.createdby</code>.
	 */
	public Integer getCreatedby() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.updatedby</code>.
	 */
	public void setUpdatedby(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.updatedby</code>.
	 */
	public Integer getUpdatedby() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.createdat</code>.
	 */
	public void setCreatedat(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.createdat</code>.
	 */
	public Timestamp getCreatedat() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.updatedat</code>.
	 */
	public void setUpdatedat(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.updatedat</code>.
	 */
	public Timestamp getUpdatedat() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.state</code>. 0-ste apply check fail
1-ste apply wait mg check
2-ste apply mg checked wait hr check
3-ste apply pass

10-hr apply check fail
11-hr apply wait mg check
12-hr apply pass
	 */
	public void setState(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.state</code>. 0-ste apply check fail
1-ste apply wait mg check
2-ste apply mg checked wait hr check
3-ste apply pass

10-hr apply check fail
11-hr apply wait mg check
12-hr apply pass
	 */
	public Integer getState() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.changeid</code>.
	 */
	public void setChangeid(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.changeid</code>.
	 */
	public Integer getChangeid() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.staffing_change_log.id</code>.
	 */
	public void setId(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.staffing_change_log.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, Integer, Integer, Date, Integer, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, Integer, Integer, Date, Integer, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.STEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.FROM_POSITIONID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.TO_POSITIONID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.DATE_REQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.DURATION_REQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.CREATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.UPDATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.CREATEDAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.UPDATEDAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.CHANGEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return StaffingChangeLog.STAFFING_CHANGE_LOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getSteid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getFromPositionid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getToPositionid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getDateReq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getDurationReq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCreatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getUpdatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getCreatedat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getUpdatedat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getChangeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value1(Integer value) {
		setSteid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value2(Integer value) {
		setFromPositionid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value3(Integer value) {
		setToPositionid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value4(Date value) {
		setDateReq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value5(Integer value) {
		setDurationReq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value6(Integer value) {
		setCreatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value7(Integer value) {
		setUpdatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value8(Timestamp value) {
		setCreatedat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value9(Timestamp value) {
		setUpdatedat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value10(Integer value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value11(Integer value) {
		setChangeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord value12(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffingChangeLogRecord values(Integer value1, Integer value2, Integer value3, Date value4, Integer value5, Integer value6, Integer value7, Timestamp value8, Timestamp value9, Integer value10, Integer value11, Integer value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StaffingChangeLogRecord
	 */
	public StaffingChangeLogRecord() {
		super(StaffingChangeLog.STAFFING_CHANGE_LOG);
	}

	/**
	 * Create a detached, initialised StaffingChangeLogRecord
	 */
	public StaffingChangeLogRecord(Integer steid, Integer fromPositionid, Integer toPositionid, Date dateReq, Integer durationReq, Integer createdby, Integer updatedby, Timestamp createdat, Timestamp updatedat, Integer state, Integer changeid, Integer id) {
		super(StaffingChangeLog.STAFFING_CHANGE_LOG);

		setValue(0, steid);
		setValue(1, fromPositionid);
		setValue(2, toPositionid);
		setValue(3, dateReq);
		setValue(4, durationReq);
		setValue(5, createdby);
		setValue(6, updatedby);
		setValue(7, createdat);
		setValue(8, updatedat);
		setValue(9, state);
		setValue(10, changeid);
		setValue(11, id);
	}
}