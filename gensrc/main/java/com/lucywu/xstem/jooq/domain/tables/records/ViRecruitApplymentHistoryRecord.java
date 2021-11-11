/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;

import com.lucywu.xstem.jooq.domain.tables.ViRecruitApplymentHistory;


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
public class ViRecruitApplymentHistoryRecord extends TableRecordImpl<ViRecruitApplymentHistoryRecord> {

	private static final long serialVersionUID = 1601038990;

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.steid</code>.
	 */
	public void setSteid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.steid</code>.
	 */
	public Integer getSteid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.positionid</code>.
	 */
	public void setPositionid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.positionid</code>.
	 */
	public Integer getPositionid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.state</code>.
	 */
	public void setState(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.state</code>.
	 */
	public Integer getState() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.updatedby</code>.
	 */
	public void setUpdatedby(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.updatedby</code>.
	 */
	public Integer getUpdatedby() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.createdat</code>.
	 */
	public void setCreatedat(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.createdat</code>.
	 */
	public Timestamp getCreatedat() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.updatedat</code>.
	 */
	public void setUpdatedat(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.updatedat</code>.
	 */
	public Timestamp getUpdatedat() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.applymentid</code>.
	 */
	public void setApplymentid(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.applymentid</code>.
	 */
	public Integer getApplymentid() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.id</code>.
	 */
	public void setId(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.positionname</code>.
	 */
	public void setPositionname(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.positionname</code>.
	 */
	public String getPositionname() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.date_req</code>.
	 */
	public void setDateReq(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.date_req</code>.
	 */
	public Date getDateReq() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.duration_req</code>.
	 */
	public void setDurationReq(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.duration_req</code>.
	 */
	public Integer getDurationReq() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.location_req</code>.
	 */
	public void setLocationReq(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.location_req</code>.
	 */
	public String getLocationReq() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.number</code>.
	 */
	public void setNumber(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.number</code>.
	 */
	public Integer getNumber() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req1</code>.
	 */
	public void setSkillReq1(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req1</code>.
	 */
	public String getSkillReq1() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req2</code>.
	 */
	public void setSkillReq2(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req2</code>.
	 */
	public String getSkillReq2() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req3</code>.
	 */
	public void setSkillReq3(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req3</code>.
	 */
	public String getSkillReq3() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req4</code>.
	 */
	public void setSkillReq4(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req4</code>.
	 */
	public String getSkillReq4() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req5</code>.
	 */
	public void setSkillReq5(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.skill_req5</code>.
	 */
	public String getSkillReq5() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.description</code>.
	 */
	public void setDescription(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.departmentname</code>.
	 */
	public void setDepartmentname(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.departmentname</code>.
	 */
	public String getDepartmentname() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_name</code>.
	 */
	public void setFteName(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_name</code>.
	 */
	public String getFteName() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_email</code>.
	 */
	public void setFteEmail(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_email</code>.
	 */
	public String getFteEmail() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_email_self</code>.
	 */
	public void setFteEmailSelf(String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_email_self</code>.
	 */
	public String getFteEmailSelf() {
		return (String) getValue(22);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_phone</code>.
	 */
	public void setFtePhone(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_phone</code>.
	 */
	public String getFtePhone() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_telephone</code>.
	 */
	public void setFteTelephone(String value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_telephone</code>.
	 */
	public String getFteTelephone() {
		return (String) getValue(24);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_departmentname</code>.
	 */
	public void setFteDepartmentname(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.fte_departmentname</code>.
	 */
	public String getFteDepartmentname() {
		return (String) getValue(25);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.interviewid</code>.
	 */
	public void setInterviewid(Integer value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.interviewid</code>.
	 */
	public Integer getInterviewid() {
		return (Integer) getValue(26);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_contact_person</code>.
	 */
	public void setInvContactPerson(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_contact_person</code>.
	 */
	public String getInvContactPerson() {
		return (String) getValue(27);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_contact_phone</code>.
	 */
	public void setInvContactPhone(String value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_contact_phone</code>.
	 */
	public String getInvContactPhone() {
		return (String) getValue(28);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_starttime</code>.
	 */
	public void setInvStarttime(Timestamp value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_starttime</code>.
	 */
	public Timestamp getInvStarttime() {
		return (Timestamp) getValue(29);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_endtime</code>.
	 */
	public void setInvEndtime(Timestamp value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_endtime</code>.
	 */
	public Timestamp getInvEndtime() {
		return (Timestamp) getValue(30);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_location</code>.
	 */
	public void setInvLocation(String value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_location</code>.
	 */
	public String getInvLocation() {
		return (String) getValue(31);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_replenish</code>.
	 */
	public void setInvReplenish(String value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.vi_recruit_applyment_history.inv_replenish</code>.
	 */
	public String getInvReplenish() {
		return (String) getValue(32);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ViRecruitApplymentHistoryRecord
	 */
	public ViRecruitApplymentHistoryRecord() {
		super(ViRecruitApplymentHistory.VI_RECRUIT_APPLYMENT_HISTORY);
	}

	/**
	 * Create a detached, initialised ViRecruitApplymentHistoryRecord
	 */
	public ViRecruitApplymentHistoryRecord(Integer steid, Integer positionid, Integer state, Integer updatedby, Timestamp createdat, Timestamp updatedat, Integer applymentid, Integer id, String positionname, Date dateReq, Integer durationReq, String locationReq, Integer number, String skillReq1, String skillReq2, String skillReq3, String skillReq4, String skillReq5, String description, String departmentname, String fteName, String fteEmail, String fteEmailSelf, String ftePhone, String fteTelephone, String fteDepartmentname, Integer interviewid, String invContactPerson, String invContactPhone, Timestamp invStarttime, Timestamp invEndtime, String invLocation, String invReplenish) {
		super(ViRecruitApplymentHistory.VI_RECRUIT_APPLYMENT_HISTORY);

		setValue(0, steid);
		setValue(1, positionid);
		setValue(2, state);
		setValue(3, updatedby);
		setValue(4, createdat);
		setValue(5, updatedat);
		setValue(6, applymentid);
		setValue(7, id);
		setValue(8, positionname);
		setValue(9, dateReq);
		setValue(10, durationReq);
		setValue(11, locationReq);
		setValue(12, number);
		setValue(13, skillReq1);
		setValue(14, skillReq2);
		setValue(15, skillReq3);
		setValue(16, skillReq4);
		setValue(17, skillReq5);
		setValue(18, description);
		setValue(19, departmentname);
		setValue(20, fteName);
		setValue(21, fteEmail);
		setValue(22, fteEmailSelf);
		setValue(23, ftePhone);
		setValue(24, fteTelephone);
		setValue(25, fteDepartmentname);
		setValue(26, interviewid);
		setValue(27, invContactPerson);
		setValue(28, invContactPhone);
		setValue(29, invStarttime);
		setValue(30, invEndtime);
		setValue(31, invLocation);
		setValue(32, invReplenish);
	}
}
