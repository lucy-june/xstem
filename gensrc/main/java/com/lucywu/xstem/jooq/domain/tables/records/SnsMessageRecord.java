/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import com.lucywu.xstem.jooq.domain.tables.SnsMessage;


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
public class SnsMessageRecord extends UpdatableRecordImpl<SnsMessageRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Integer> {

	private static final long serialVersionUID = 1643222947;

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.messageid</code>.
	 */
	public void setMessageid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.messageid</code>.
	 */
	public Integer getMessageid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.sendfrom</code>.
	 */
	public void setSendfrom(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.sendfrom</code>.
	 */
	public Integer getSendfrom() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.rolefrom</code>.
	 */
	public void setRolefrom(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.rolefrom</code>.
	 */
	public Integer getRolefrom() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.sendto</code>.
	 */
	public void setSendto(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.sendto</code>.
	 */
	public Integer getSendto() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.roleto</code>.
	 */
	public void setRoleto(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.roleto</code>.
	 */
	public Integer getRoleto() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.message</code>.
	 */
	public void setMessage(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.message</code>.
	 */
	public String getMessage() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.time</code>.
	 */
	public void setTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.time</code>.
	 */
	public Timestamp getTime() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>ss1604c195_rd2.sns_message.status</code>. 0-sending
1-sent
2-withdraw
	 */
	public void setStatus(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ss1604c195_rd2.sns_message.status</code>. 0-sending
1-sent
2-withdraw
	 */
	public Integer getStatus() {
		return (Integer) getValue(7);
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
	public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Integer> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Integer> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return SnsMessage.SNS_MESSAGE.MESSAGEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return SnsMessage.SNS_MESSAGE.SENDFROM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return SnsMessage.SNS_MESSAGE.ROLEFROM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return SnsMessage.SNS_MESSAGE.SENDTO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return SnsMessage.SNS_MESSAGE.ROLETO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return SnsMessage.SNS_MESSAGE.MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return SnsMessage.SNS_MESSAGE.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return SnsMessage.SNS_MESSAGE.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getMessageid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getSendfrom();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getRolefrom();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getSendto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getRoleto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value1(Integer value) {
		setMessageid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value2(Integer value) {
		setSendfrom(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value3(Integer value) {
		setRolefrom(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value4(Integer value) {
		setSendto(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value5(Integer value) {
		setRoleto(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value6(String value) {
		setMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value7(Timestamp value) {
		setTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord value8(Integer value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SnsMessageRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Timestamp value7, Integer value8) {
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
	 * Create a detached SnsMessageRecord
	 */
	public SnsMessageRecord() {
		super(SnsMessage.SNS_MESSAGE);
	}

	/**
	 * Create a detached, initialised SnsMessageRecord
	 */
	public SnsMessageRecord(Integer messageid, Integer sendfrom, Integer rolefrom, Integer sendto, Integer roleto, String message, Timestamp time, Integer status) {
		super(SnsMessage.SNS_MESSAGE);

		setValue(0, messageid);
		setValue(1, sendfrom);
		setValue(2, rolefrom);
		setValue(3, sendto);
		setValue(4, roleto);
		setValue(5, message);
		setValue(6, time);
		setValue(7, status);
	}
}