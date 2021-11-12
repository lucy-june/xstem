/**
 * This class is generated by jOOQ
 */
package com.lucywu.xstem.jooq.domain;


import com.lucywu.xstem.jooq.domain.tables.CheckAttendance;
import com.lucywu.xstem.jooq.domain.tables.CheckPerformance;
import com.lucywu.xstem.jooq.domain.tables.CheckSkill;
import com.lucywu.xstem.jooq.domain.tables.InfoAccount;
import com.lucywu.xstem.jooq.domain.tables.InfoDepartment;
import com.lucywu.xstem.jooq.domain.tables.InfoFte;
import com.lucywu.xstem.jooq.domain.tables.InfoSte;
import com.lucywu.xstem.jooq.domain.tables.NotifyPointer;
import com.lucywu.xstem.jooq.domain.tables.RecruitAgency;
import com.lucywu.xstem.jooq.domain.tables.RecruitApplyment;
import com.lucywu.xstem.jooq.domain.tables.RecruitApplymentLog;
import com.lucywu.xstem.jooq.domain.tables.RecruitInterview;
import com.lucywu.xstem.jooq.domain.tables.RecruitPool;
import com.lucywu.xstem.jooq.domain.tables.RecruitPoolLog;
import com.lucywu.xstem.jooq.domain.tables.RecruitPosition;
import com.lucywu.xstem.jooq.domain.tables.RecruitPositionLog;
import com.lucywu.xstem.jooq.domain.tables.RecruitPublished;
import com.lucywu.xstem.jooq.domain.tables.SnsMessage;
import com.lucywu.xstem.jooq.domain.tables.SnsTimeline;
import com.lucywu.xstem.jooq.domain.tables.StaffingChange;
import com.lucywu.xstem.jooq.domain.tables.StaffingChangeLog;
import com.lucywu.xstem.jooq.domain.tables.TestComments;
import com.lucywu.xstem.jooq.domain.tables.TestPosts;
import com.lucywu.xstem.jooq.domain.tables.records.CheckAttendanceRecord;
import com.lucywu.xstem.jooq.domain.tables.records.CheckPerformanceRecord;
import com.lucywu.xstem.jooq.domain.tables.records.CheckSkillRecord;
import com.lucywu.xstem.jooq.domain.tables.records.InfoAccountRecord;
import com.lucywu.xstem.jooq.domain.tables.records.InfoDepartmentRecord;
import com.lucywu.xstem.jooq.domain.tables.records.InfoFteRecord;
import com.lucywu.xstem.jooq.domain.tables.records.InfoSteRecord;
import com.lucywu.xstem.jooq.domain.tables.records.NotifyPointerRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitAgencyRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitApplymentLogRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitApplymentRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitInterviewRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPoolLogRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPoolRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPositionLogRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPositionRecord;
import com.lucywu.xstem.jooq.domain.tables.records.RecruitPublishedRecord;
import com.lucywu.xstem.jooq.domain.tables.records.SnsMessageRecord;
import com.lucywu.xstem.jooq.domain.tables.records.SnsTimelineRecord;
import com.lucywu.xstem.jooq.domain.tables.records.StaffingChangeLogRecord;
import com.lucywu.xstem.jooq.domain.tables.records.StaffingChangeRecord;
import com.lucywu.xstem.jooq.domain.tables.records.TestCommentsRecord;
import com.lucywu.xstem.jooq.domain.tables.records.TestPostsRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>ss1604c195_rd2</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<CheckAttendanceRecord, Integer> IDENTITY_CHECK_ATTENDANCE = Identities0.IDENTITY_CHECK_ATTENDANCE;
	public static final Identity<CheckPerformanceRecord, Integer> IDENTITY_CHECK_PERFORMANCE = Identities0.IDENTITY_CHECK_PERFORMANCE;
	public static final Identity<CheckSkillRecord, Integer> IDENTITY_CHECK_SKILL = Identities0.IDENTITY_CHECK_SKILL;
	public static final Identity<InfoAccountRecord, Integer> IDENTITY_INFO_ACCOUNT = Identities0.IDENTITY_INFO_ACCOUNT;
	public static final Identity<InfoDepartmentRecord, Integer> IDENTITY_INFO_DEPARTMENT = Identities0.IDENTITY_INFO_DEPARTMENT;
	public static final Identity<InfoFteRecord, Integer> IDENTITY_INFO_FTE = Identities0.IDENTITY_INFO_FTE;
	public static final Identity<InfoSteRecord, Integer> IDENTITY_INFO_STE = Identities0.IDENTITY_INFO_STE;
	public static final Identity<NotifyPointerRecord, Integer> IDENTITY_NOTIFY_POINTER = Identities0.IDENTITY_NOTIFY_POINTER;
	public static final Identity<RecruitAgencyRecord, Integer> IDENTITY_RECRUIT_AGENCY = Identities0.IDENTITY_RECRUIT_AGENCY;
	public static final Identity<RecruitApplymentRecord, Integer> IDENTITY_RECRUIT_APPLYMENT = Identities0.IDENTITY_RECRUIT_APPLYMENT;
	public static final Identity<RecruitApplymentLogRecord, Integer> IDENTITY_RECRUIT_APPLYMENT_LOG = Identities0.IDENTITY_RECRUIT_APPLYMENT_LOG;
	public static final Identity<RecruitInterviewRecord, Integer> IDENTITY_RECRUIT_INTERVIEW = Identities0.IDENTITY_RECRUIT_INTERVIEW;
	public static final Identity<RecruitPoolRecord, Integer> IDENTITY_RECRUIT_POOL = Identities0.IDENTITY_RECRUIT_POOL;
	public static final Identity<RecruitPoolLogRecord, Integer> IDENTITY_RECRUIT_POOL_LOG = Identities0.IDENTITY_RECRUIT_POOL_LOG;
	public static final Identity<RecruitPositionRecord, Integer> IDENTITY_RECRUIT_POSITION = Identities0.IDENTITY_RECRUIT_POSITION;
	public static final Identity<RecruitPositionLogRecord, Integer> IDENTITY_RECRUIT_POSITION_LOG = Identities0.IDENTITY_RECRUIT_POSITION_LOG;
	public static final Identity<RecruitPublishedRecord, Integer> IDENTITY_RECRUIT_PUBLISHED = Identities0.IDENTITY_RECRUIT_PUBLISHED;
	public static final Identity<SnsMessageRecord, Integer> IDENTITY_SNS_MESSAGE = Identities0.IDENTITY_SNS_MESSAGE;
	public static final Identity<SnsTimelineRecord, Integer> IDENTITY_SNS_TIMELINE = Identities0.IDENTITY_SNS_TIMELINE;
	public static final Identity<StaffingChangeRecord, Integer> IDENTITY_STAFFING_CHANGE = Identities0.IDENTITY_STAFFING_CHANGE;
	public static final Identity<StaffingChangeLogRecord, Integer> IDENTITY_STAFFING_CHANGE_LOG = Identities0.IDENTITY_STAFFING_CHANGE_LOG;
	public static final Identity<TestCommentsRecord, Integer> IDENTITY_TEST_COMMENTS = Identities0.IDENTITY_TEST_COMMENTS;
	public static final Identity<TestPostsRecord, Integer> IDENTITY_TEST_POSTS = Identities0.IDENTITY_TEST_POSTS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<CheckAttendanceRecord> CHECK_ATTENDANCE_PKEY = UniqueKeys0.CHECK_ATTENDANCE_PKEY;
	public static final UniqueKey<CheckPerformanceRecord> CHECK_PERFORMANCE_PKEY = UniqueKeys0.CHECK_PERFORMANCE_PKEY;
	public static final UniqueKey<CheckSkillRecord> CHECK_SKILL_PKEY = UniqueKeys0.CHECK_SKILL_PKEY;
	public static final UniqueKey<InfoAccountRecord> INFO_ACCOUNT_PKEY = UniqueKeys0.INFO_ACCOUNT_PKEY;
	public static final UniqueKey<InfoAccountRecord> INFO_ACCOUNT_EMAIL_KEY = UniqueKeys0.INFO_ACCOUNT_EMAIL_KEY;
	public static final UniqueKey<InfoDepartmentRecord> INFO_DEPARTMENT_PKEY = UniqueKeys0.INFO_DEPARTMENT_PKEY;
	public static final UniqueKey<InfoFteRecord> INFO_FTE_PKEY = UniqueKeys0.INFO_FTE_PKEY;
	public static final UniqueKey<InfoSteRecord> INFO_STE_PKEY = UniqueKeys0.INFO_STE_PKEY;
	public static final UniqueKey<NotifyPointerRecord> NOTIFY_POINTER_PKEY = UniqueKeys0.NOTIFY_POINTER_PKEY;
	public static final UniqueKey<RecruitAgencyRecord> RECRUIT_AGENCY_PKEY = UniqueKeys0.RECRUIT_AGENCY_PKEY;
	public static final UniqueKey<RecruitApplymentRecord> RECRUIT_APPLYMENT_PKEY = UniqueKeys0.RECRUIT_APPLYMENT_PKEY;
	public static final UniqueKey<RecruitApplymentLogRecord> RECRUIT_APPLYMENT_LOG_PKEY = UniqueKeys0.RECRUIT_APPLYMENT_LOG_PKEY;
	public static final UniqueKey<RecruitInterviewRecord> RECRUIT_INTERVIEW_PKEY = UniqueKeys0.RECRUIT_INTERVIEW_PKEY;
	public static final UniqueKey<RecruitPoolRecord> RECRUIT_POOL_PKEY = UniqueKeys0.RECRUIT_POOL_PKEY;
	public static final UniqueKey<RecruitPoolLogRecord> RECRUIT_POOL_LOG_PKEY = UniqueKeys0.RECRUIT_POOL_LOG_PKEY;
	public static final UniqueKey<RecruitPositionRecord> RECRUIT_POSITION_PKEY = UniqueKeys0.RECRUIT_POSITION_PKEY;
	public static final UniqueKey<RecruitPositionLogRecord> RECRUIT_POSITION_LOG_PKEY = UniqueKeys0.RECRUIT_POSITION_LOG_PKEY;
	public static final UniqueKey<RecruitPublishedRecord> RECRUIT_PUBLISHED_PKEY = UniqueKeys0.RECRUIT_PUBLISHED_PKEY;
	public static final UniqueKey<SnsMessageRecord> SNS_MESSAGE_PKEY = UniqueKeys0.SNS_MESSAGE_PKEY;
	public static final UniqueKey<SnsTimelineRecord> SNS_TIMELINE_PKEY = UniqueKeys0.SNS_TIMELINE_PKEY;
	public static final UniqueKey<StaffingChangeRecord> STAFFING_CHANGE_PKEY = UniqueKeys0.STAFFING_CHANGE_PKEY;
	public static final UniqueKey<StaffingChangeLogRecord> STAFFING_CHANGE_LOG_PKEY = UniqueKeys0.STAFFING_CHANGE_LOG_PKEY;
	public static final UniqueKey<TestCommentsRecord> TEST_COMMENTS_PKEY = UniqueKeys0.TEST_COMMENTS_PKEY;
	public static final UniqueKey<TestPostsRecord> TEST_POSTS_PKEY = UniqueKeys0.TEST_POSTS_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<TestCommentsRecord, TestPostsRecord> TEST_COMMENTS__TEST_COMMENTS_POST_ID_FKEY = ForeignKeys0.TEST_COMMENTS__TEST_COMMENTS_POST_ID_FKEY;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<CheckAttendanceRecord, Integer> IDENTITY_CHECK_ATTENDANCE = createIdentity(CheckAttendance.CHECK_ATTENDANCE, CheckAttendance.CHECK_ATTENDANCE.ATTENDANCEID);
		public static Identity<CheckPerformanceRecord, Integer> IDENTITY_CHECK_PERFORMANCE = createIdentity(CheckPerformance.CHECK_PERFORMANCE, CheckPerformance.CHECK_PERFORMANCE.PERFORMANCEID);
		public static Identity<CheckSkillRecord, Integer> IDENTITY_CHECK_SKILL = createIdentity(CheckSkill.CHECK_SKILL, CheckSkill.CHECK_SKILL.SKILLID);
		public static Identity<InfoAccountRecord, Integer> IDENTITY_INFO_ACCOUNT = createIdentity(InfoAccount.INFO_ACCOUNT, InfoAccount.INFO_ACCOUNT.ACCOUNTID);
		public static Identity<InfoDepartmentRecord, Integer> IDENTITY_INFO_DEPARTMENT = createIdentity(InfoDepartment.INFO_DEPARTMENT, InfoDepartment.INFO_DEPARTMENT.DEPARTMENTID);
		public static Identity<InfoFteRecord, Integer> IDENTITY_INFO_FTE = createIdentity(InfoFte.INFO_FTE, InfoFte.INFO_FTE.FTEID);
		public static Identity<InfoSteRecord, Integer> IDENTITY_INFO_STE = createIdentity(InfoSte.INFO_STE, InfoSte.INFO_STE.STEID);
		public static Identity<NotifyPointerRecord, Integer> IDENTITY_NOTIFY_POINTER = createIdentity(NotifyPointer.NOTIFY_POINTER, NotifyPointer.NOTIFY_POINTER.ID);
		public static Identity<RecruitAgencyRecord, Integer> IDENTITY_RECRUIT_AGENCY = createIdentity(RecruitAgency.RECRUIT_AGENCY, RecruitAgency.RECRUIT_AGENCY.AGENCYID);
		public static Identity<RecruitApplymentRecord, Integer> IDENTITY_RECRUIT_APPLYMENT = createIdentity(RecruitApplyment.RECRUIT_APPLYMENT, RecruitApplyment.RECRUIT_APPLYMENT.APPLYMENTID);
		public static Identity<RecruitApplymentLogRecord, Integer> IDENTITY_RECRUIT_APPLYMENT_LOG = createIdentity(RecruitApplymentLog.RECRUIT_APPLYMENT_LOG, RecruitApplymentLog.RECRUIT_APPLYMENT_LOG.ID);
		public static Identity<RecruitInterviewRecord, Integer> IDENTITY_RECRUIT_INTERVIEW = createIdentity(RecruitInterview.RECRUIT_INTERVIEW, RecruitInterview.RECRUIT_INTERVIEW.INTERVIEWID);
		public static Identity<RecruitPoolRecord, Integer> IDENTITY_RECRUIT_POOL = createIdentity(RecruitPool.RECRUIT_POOL, RecruitPool.RECRUIT_POOL.POOLID);
		public static Identity<RecruitPoolLogRecord, Integer> IDENTITY_RECRUIT_POOL_LOG = createIdentity(RecruitPoolLog.RECRUIT_POOL_LOG, RecruitPoolLog.RECRUIT_POOL_LOG.ID);
		public static Identity<RecruitPositionRecord, Integer> IDENTITY_RECRUIT_POSITION = createIdentity(RecruitPosition.RECRUIT_POSITION, RecruitPosition.RECRUIT_POSITION.POSITIONID);
		public static Identity<RecruitPositionLogRecord, Integer> IDENTITY_RECRUIT_POSITION_LOG = createIdentity(RecruitPositionLog.RECRUIT_POSITION_LOG, RecruitPositionLog.RECRUIT_POSITION_LOG.ID);
		public static Identity<RecruitPublishedRecord, Integer> IDENTITY_RECRUIT_PUBLISHED = createIdentity(RecruitPublished.RECRUIT_PUBLISHED, RecruitPublished.RECRUIT_PUBLISHED.PUBLISHEDID);
		public static Identity<SnsMessageRecord, Integer> IDENTITY_SNS_MESSAGE = createIdentity(SnsMessage.SNS_MESSAGE, SnsMessage.SNS_MESSAGE.MESSAGEID);
		public static Identity<SnsTimelineRecord, Integer> IDENTITY_SNS_TIMELINE = createIdentity(SnsTimeline.SNS_TIMELINE, SnsTimeline.SNS_TIMELINE.TIMELINEID);
		public static Identity<StaffingChangeRecord, Integer> IDENTITY_STAFFING_CHANGE = createIdentity(StaffingChange.STAFFING_CHANGE, StaffingChange.STAFFING_CHANGE.CHANGEID);
		public static Identity<StaffingChangeLogRecord, Integer> IDENTITY_STAFFING_CHANGE_LOG = createIdentity(StaffingChangeLog.STAFFING_CHANGE_LOG, StaffingChangeLog.STAFFING_CHANGE_LOG.ID);
		public static Identity<TestCommentsRecord, Integer> IDENTITY_TEST_COMMENTS = createIdentity(TestComments.TEST_COMMENTS, TestComments.TEST_COMMENTS.ID);
		public static Identity<TestPostsRecord, Integer> IDENTITY_TEST_POSTS = createIdentity(TestPosts.TEST_POSTS, TestPosts.TEST_POSTS.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<CheckAttendanceRecord> CHECK_ATTENDANCE_PKEY = createUniqueKey(CheckAttendance.CHECK_ATTENDANCE, CheckAttendance.CHECK_ATTENDANCE.ATTENDANCEID);
		public static final UniqueKey<CheckPerformanceRecord> CHECK_PERFORMANCE_PKEY = createUniqueKey(CheckPerformance.CHECK_PERFORMANCE, CheckPerformance.CHECK_PERFORMANCE.PERFORMANCEID);
		public static final UniqueKey<CheckSkillRecord> CHECK_SKILL_PKEY = createUniqueKey(CheckSkill.CHECK_SKILL, CheckSkill.CHECK_SKILL.SKILLID);
		public static final UniqueKey<InfoAccountRecord> INFO_ACCOUNT_PKEY = createUniqueKey(InfoAccount.INFO_ACCOUNT, InfoAccount.INFO_ACCOUNT.ACCOUNTID);
		public static final UniqueKey<InfoAccountRecord> INFO_ACCOUNT_EMAIL_KEY = createUniqueKey(InfoAccount.INFO_ACCOUNT, InfoAccount.INFO_ACCOUNT.EMAIL);
		public static final UniqueKey<InfoDepartmentRecord> INFO_DEPARTMENT_PKEY = createUniqueKey(InfoDepartment.INFO_DEPARTMENT, InfoDepartment.INFO_DEPARTMENT.DEPARTMENTID);
		public static final UniqueKey<InfoFteRecord> INFO_FTE_PKEY = createUniqueKey(InfoFte.INFO_FTE, InfoFte.INFO_FTE.FTEID);
		public static final UniqueKey<InfoSteRecord> INFO_STE_PKEY = createUniqueKey(InfoSte.INFO_STE, InfoSte.INFO_STE.STEID);
		public static final UniqueKey<NotifyPointerRecord> NOTIFY_POINTER_PKEY = createUniqueKey(NotifyPointer.NOTIFY_POINTER, NotifyPointer.NOTIFY_POINTER.ID);
		public static final UniqueKey<RecruitAgencyRecord> RECRUIT_AGENCY_PKEY = createUniqueKey(RecruitAgency.RECRUIT_AGENCY, RecruitAgency.RECRUIT_AGENCY.AGENCYID);
		public static final UniqueKey<RecruitApplymentRecord> RECRUIT_APPLYMENT_PKEY = createUniqueKey(RecruitApplyment.RECRUIT_APPLYMENT, RecruitApplyment.RECRUIT_APPLYMENT.APPLYMENTID);
		public static final UniqueKey<RecruitApplymentLogRecord> RECRUIT_APPLYMENT_LOG_PKEY = createUniqueKey(RecruitApplymentLog.RECRUIT_APPLYMENT_LOG, RecruitApplymentLog.RECRUIT_APPLYMENT_LOG.ID);
		public static final UniqueKey<RecruitInterviewRecord> RECRUIT_INTERVIEW_PKEY = createUniqueKey(RecruitInterview.RECRUIT_INTERVIEW, RecruitInterview.RECRUIT_INTERVIEW.INTERVIEWID);
		public static final UniqueKey<RecruitPoolRecord> RECRUIT_POOL_PKEY = createUniqueKey(RecruitPool.RECRUIT_POOL, RecruitPool.RECRUIT_POOL.POOLID);
		public static final UniqueKey<RecruitPoolLogRecord> RECRUIT_POOL_LOG_PKEY = createUniqueKey(RecruitPoolLog.RECRUIT_POOL_LOG, RecruitPoolLog.RECRUIT_POOL_LOG.ID);
		public static final UniqueKey<RecruitPositionRecord> RECRUIT_POSITION_PKEY = createUniqueKey(RecruitPosition.RECRUIT_POSITION, RecruitPosition.RECRUIT_POSITION.POSITIONID);
		public static final UniqueKey<RecruitPositionLogRecord> RECRUIT_POSITION_LOG_PKEY = createUniqueKey(RecruitPositionLog.RECRUIT_POSITION_LOG, RecruitPositionLog.RECRUIT_POSITION_LOG.ID);
		public static final UniqueKey<RecruitPublishedRecord> RECRUIT_PUBLISHED_PKEY = createUniqueKey(RecruitPublished.RECRUIT_PUBLISHED, RecruitPublished.RECRUIT_PUBLISHED.PUBLISHEDID);
		public static final UniqueKey<SnsMessageRecord> SNS_MESSAGE_PKEY = createUniqueKey(SnsMessage.SNS_MESSAGE, SnsMessage.SNS_MESSAGE.MESSAGEID);
		public static final UniqueKey<SnsTimelineRecord> SNS_TIMELINE_PKEY = createUniqueKey(SnsTimeline.SNS_TIMELINE, SnsTimeline.SNS_TIMELINE.TIMELINEID);
		public static final UniqueKey<StaffingChangeRecord> STAFFING_CHANGE_PKEY = createUniqueKey(StaffingChange.STAFFING_CHANGE, StaffingChange.STAFFING_CHANGE.CHANGEID);
		public static final UniqueKey<StaffingChangeLogRecord> STAFFING_CHANGE_LOG_PKEY = createUniqueKey(StaffingChangeLog.STAFFING_CHANGE_LOG, StaffingChangeLog.STAFFING_CHANGE_LOG.ID);
		public static final UniqueKey<TestCommentsRecord> TEST_COMMENTS_PKEY = createUniqueKey(TestComments.TEST_COMMENTS, TestComments.TEST_COMMENTS.ID);
		public static final UniqueKey<TestPostsRecord> TEST_POSTS_PKEY = createUniqueKey(TestPosts.TEST_POSTS, TestPosts.TEST_POSTS.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<TestCommentsRecord, TestPostsRecord> TEST_COMMENTS__TEST_COMMENTS_POST_ID_FKEY = createForeignKey(com.lucywu.xstem.jooq.domain.Keys.TEST_POSTS_PKEY, TestComments.TEST_COMMENTS, TestComments.TEST_COMMENTS.POST_ID);
	}
}
