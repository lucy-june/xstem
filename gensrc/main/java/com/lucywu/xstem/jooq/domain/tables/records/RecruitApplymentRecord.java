/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables.records;


import com.lucywu.xstem.jooq.domain.tables.RecruitApplyment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class RecruitApplymentRecord extends UpdatableRecordImpl<RecruitApplymentRecord> implements Record7<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Integer> {

	private static final long serialVersionUID = -622258583;

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.steid</code>.
	 */
	public void setSteid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.steid</code>.
	 */
	public Integer getSteid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.positionid</code>.
	 */
	public void setPositionid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.positionid</code>.
	 */
	public Integer getPositionid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.state</code>. 0-self cancelled
1- wait hr check
2- wait mg check
3- wait arrange interview
4- interview
5- pass
6- fail

	 */
	public void setState(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.state</code>. 0-self cancelled
1- wait hr check
2- wait mg check
3- wait arrange interview
4- interview
5- pass
6- fail

	 */
	public Integer getState() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.updatedby</code>.
	 */
	public void setUpdatedby(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.updatedby</code>.
	 */
	public Integer getUpdatedby() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.createdat</code>.
	 */
	public void setCreatedat(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.createdat</code>.
	 */
	public Timestamp getCreatedat() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.updatedat</code>.
	 */
	public void setUpdatedat(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.updatedat</code>.
	 */
	public Timestamp getUpdatedat() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_applyment.applymentid</code>.
	 */
	public void setApplymentid(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_applyment.applymentid</code>.
	 */
	public Integer getApplymentid() {
		return (Integer) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return RecruitApplyment.RECRUIT_APPLYMENT.STEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return RecruitApplyment.RECRUIT_APPLYMENT.POSITIONID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return RecruitApplyment.RECRUIT_APPLYMENT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return RecruitApplyment.RECRUIT_APPLYMENT.UPDATEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return RecruitApplyment.RECRUIT_APPLYMENT.CREATEDAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return RecruitApplyment.RECRUIT_APPLYMENT.UPDATEDAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return RecruitApplyment.RECRUIT_APPLYMENT.APPLYMENTID;
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
		return getPositionid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getUpdatedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getCreatedat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getUpdatedat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getApplymentid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value1(Integer value) {
		setSteid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value2(Integer value) {
		setPositionid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value3(Integer value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value4(Integer value) {
		setUpdatedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value5(Timestamp value) {
		setCreatedat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value6(Timestamp value) {
		setUpdatedat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord value7(Integer value) {
		setApplymentid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitApplymentRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6, Integer value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RecruitApplymentRecord
	 */
	public RecruitApplymentRecord() {
		super(RecruitApplyment.RECRUIT_APPLYMENT);
	}

	/**
	 * Create a detached, initialised RecruitApplymentRecord
	 */
	public RecruitApplymentRecord(Integer steid, Integer positionid, Integer state, Integer updatedby, Timestamp createdat, Timestamp updatedat, Integer applymentid) {
		super(RecruitApplyment.RECRUIT_APPLYMENT);

		setValue(0, steid);
		setValue(1, positionid);
		setValue(2, state);
		setValue(3, updatedby);
		setValue(4, createdat);
		setValue(5, updatedat);
		setValue(6, applymentid);
	}
}
