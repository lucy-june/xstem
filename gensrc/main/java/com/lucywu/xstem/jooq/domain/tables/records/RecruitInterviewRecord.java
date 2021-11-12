/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables.records;


import com.lucywu.xstem.jooq.domain.tables.RecruitInterview;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class RecruitInterviewRecord extends UpdatableRecordImpl<RecruitInterviewRecord> implements Record8<Integer, Timestamp, String, String, String, String, Integer, Timestamp> {

	private static final long serialVersionUID = 2010909248;

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.interviewid</code>.
	 */
	public void setInterviewid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.interviewid</code>.
	 */
	public Integer getInterviewid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.endtime</code>.
	 */
	public void setEndtime(Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.endtime</code>.
	 */
	public Timestamp getEndtime() {
		return (Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.location</code>.
	 */
	public void setLocation(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.location</code>.
	 */
	public String getLocation() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.contact_person</code>.
	 */
	public void setContactPerson(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.contact_person</code>.
	 */
	public String getContactPerson() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.contact_phone</code>.
	 */
	public void setContactPhone(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.contact_phone</code>.
	 */
	public String getContactPhone() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.replenish</code>.
	 */
	public void setReplenish(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.replenish</code>.
	 */
	public String getReplenish() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.applymentid</code>.
	 */
	public void setApplymentid(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.applymentid</code>.
	 */
	public Integer getApplymentid() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.recruit_interview.starttime</code>.
	 */
	public void setStarttime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.recruit_interview.starttime</code>.
	 */
	public Timestamp getStarttime() {
		return (Timestamp) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Timestamp, String, String, String, String, Integer, Timestamp> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Timestamp, String, String, String, String, Integer, Timestamp> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return RecruitInterview.RECRUIT_INTERVIEW.INTERVIEWID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field2() {
		return RecruitInterview.RECRUIT_INTERVIEW.ENDTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return RecruitInterview.RECRUIT_INTERVIEW.LOCATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return RecruitInterview.RECRUIT_INTERVIEW.CONTACT_PERSON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return RecruitInterview.RECRUIT_INTERVIEW.CONTACT_PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return RecruitInterview.RECRUIT_INTERVIEW.REPLENISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return RecruitInterview.RECRUIT_INTERVIEW.APPLYMENTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return RecruitInterview.RECRUIT_INTERVIEW.STARTTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getInterviewid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value2() {
		return getEndtime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getContactPerson();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getContactPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getReplenish();
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
	public Timestamp value8() {
		return getStarttime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value1(Integer value) {
		setInterviewid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value2(Timestamp value) {
		setEndtime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value3(String value) {
		setLocation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value4(String value) {
		setContactPerson(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value5(String value) {
		setContactPhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value6(String value) {
		setReplenish(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value7(Integer value) {
		setApplymentid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord value8(Timestamp value) {
		setStarttime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RecruitInterviewRecord values(Integer value1, Timestamp value2, String value3, String value4, String value5, String value6, Integer value7, Timestamp value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RecruitInterviewRecord
	 */
	public RecruitInterviewRecord() {
		super(RecruitInterview.RECRUIT_INTERVIEW);
	}

	/**
	 * Create a detached, initialised RecruitInterviewRecord
	 */
	public RecruitInterviewRecord(Integer interviewid, Timestamp endtime, String location, String contactPerson, String contactPhone, String replenish, Integer applymentid, Timestamp starttime) {
		super(RecruitInterview.RECRUIT_INTERVIEW);

		setValue(0, interviewid);
		setValue(1, endtime);
		setValue(2, location);
		setValue(3, contactPerson);
		setValue(4, contactPhone);
		setValue(5, replenish);
		setValue(6, applymentid);
		setValue(7, starttime);
	}
}
