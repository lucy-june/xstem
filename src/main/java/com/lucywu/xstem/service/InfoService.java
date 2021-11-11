/*******************************************************************************
 * Copyright (c) 2018-2026 lucywu.com
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucy Wu - initial API and implementation
 *******************************************************************************/

package com.lucywu.xstem.service;

import static com.lucywu.xstem.jooq.domain.tables.InfoDepartment.INFO_DEPARTMENT;
import static com.lucywu.xstem.jooq.domain.tables.InfoFte.INFO_FTE;
import static com.lucywu.xstem.jooq.domain.tables.InfoSte.INFO_STE;
import static com.lucywu.xstem.jooq.domain.tables.RecruitApplyment.RECRUIT_APPLYMENT;
import static com.lucywu.xstem.jooq.domain.tables.RecruitPosition.RECRUIT_POSITION;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucywu.xstem.global.Role;

/**
 * @author lucy
 *
 */
@Service
@Transactional
public class InfoService
{
	@Autowired
	private DSLContext dsl;
	
	public Map<String,Object> getPersonalInfo(Integer steid){
		Record r=dsl.select(INFO_STE.fields())
				.select(INFO_DEPARTMENT.DEPARTMENTNAME)
				.select(RECRUIT_POSITION.POSITIONNAME)
				.from(INFO_STE)
				.leftJoin(INFO_DEPARTMENT)
				.on(INFO_STE.DEPARTMENTID.eq(INFO_DEPARTMENT.DEPARTMENTID))
				.leftJoin(RECRUIT_POSITION)
				.on(INFO_STE.POSITIONID.eq(RECRUIT_POSITION.POSITIONID))
				.where(INFO_STE.STEID.eq(steid))
				.fetchOne();
		return r.intoMap();
	}
	
	public List<Map<String,Object>> getInfoList(Integer departmentid){
		if(departmentid==null){
			return dsl.select(INFO_STE.fields())
					.select(INFO_DEPARTMENT.DEPARTMENTNAME)
					.select(RECRUIT_POSITION.POSITIONNAME)
					.from(INFO_STE)
					.leftJoin(INFO_DEPARTMENT)
					.on(INFO_STE.DEPARTMENTID.eq(INFO_DEPARTMENT.DEPARTMENTID))
					.leftJoin(RECRUIT_POSITION)
					.on(INFO_STE.POSITIONID.eq(RECRUIT_POSITION.POSITIONID))
					.fetchMaps();
		}
		else{
			return dsl.select(INFO_STE.fields())
					.select(INFO_DEPARTMENT.DEPARTMENTNAME)
					.select(RECRUIT_POSITION.POSITIONNAME)
					.from(INFO_STE)
					.leftJoin(INFO_DEPARTMENT)
					.on(INFO_STE.DEPARTMENTID.eq(INFO_DEPARTMENT.DEPARTMENTID))
					.leftJoin(RECRUIT_POSITION)
					.on(INFO_STE.POSITIONID.eq(RECRUIT_POSITION.POSITIONID))
					.where(INFO_STE.DEPARTMENTID.eq(departmentid))
					.fetchMaps();
		}
	}
	
	public Integer updatePersonalInfo(Integer steid,String name,Boolean gender,Date birthday, String location,String email,
			String email_self,String phone,String telephone,String experiences,String skills,String resume_url){
		return dsl.update(INFO_STE)
			.set(INFO_STE.NAME,name)
			.set(INFO_STE.BIRTHDAY,birthday)
			.set(INFO_STE.GENDER,gender)
			.set(INFO_STE.LOCATION,location)
			.set(INFO_STE.EMAIL,email)
			.set(INFO_STE.EMAIL_SELF,email_self)
			.set(INFO_STE.PHONE,phone)
			.set(INFO_STE.TELEPHONE,telephone)
			.set(INFO_STE.EXPERIENCES,experiences)
			.set(INFO_STE.SKILLS,skills)
			.set(INFO_STE.RESUME_URL,resume_url)
			.where(INFO_STE.STEID.eq(steid))
			.execute();
	}
	
	public Integer updateOnboardInfo(Integer steid,String email,String phone,String offer_url, String contract_url){
		return dsl.update(INFO_STE)
				.set(INFO_STE.EMAIL,email)
				.set(INFO_STE.PHONE,phone)
				.set(INFO_STE.OFFER_URL,offer_url)
				.set(INFO_STE.CONTRACT_URL,contract_url)
				.where(INFO_STE.STEID.eq(steid))
				.execute();
	}
	
	public Integer updateContractInfo(Integer steid,String contract_url ){
		Map<String,Object> map=dsl.select(RECRUIT_POSITION.POSITIONID,RECRUIT_POSITION.DEPARTMENTID)
					.from(INFO_STE)
					.join(RECRUIT_APPLYMENT)
					.on(INFO_STE.STEID.eq(RECRUIT_APPLYMENT.STEID))
					.join(RECRUIT_POSITION)
					.on(RECRUIT_APPLYMENT.POSITIONID.eq(RECRUIT_POSITION.POSITIONID))
					.where(RECRUIT_APPLYMENT.STATE.eq(10))
					.and(INFO_STE.STEID.eq(steid))
					.fetchOne().intoMap();
		
		Integer departmentid=(Integer) map.get("departmentid");
		Integer positionid=(Integer) map.get("positionid");
		
		//update info_ste
		dsl.update(INFO_STE)
			.set(INFO_STE.DEPARTMENTID,departmentid)
			.set(INFO_STE.POSITIONID,positionid)
			.where(INFO_STE.STEID.eq(steid))
			.execute();
		//update state
		dsl.update(RECRUIT_APPLYMENT)
			.set(RECRUIT_APPLYMENT.STATE,12)
			.where(RECRUIT_APPLYMENT.STATE.eq(10))
			.and(RECRUIT_APPLYMENT.STEID.eq(steid))
			.execute();
		
		return dsl.update(INFO_STE)
				.set(INFO_STE.CONTRACT_URL,contract_url)
				.where(INFO_STE.STEID.eq(steid))
				.execute();
	}
	
	public Integer updateOfferInfo(Integer steid,String offer_url){
		return dsl.update(INFO_STE)
				.set(INFO_STE.OFFER_URL,offer_url)
				.where(INFO_STE.STEID.eq(steid))
				.execute();
	}
	
	
	public List<Map<String,Object>> getMGbyDepartment(Integer departmentid){
		return dsl.select()
				.from(INFO_FTE)
				.where(INFO_FTE.DEPARTMENTID.eq(departmentid))
				.and(INFO_FTE.ROLE.eq(Integer.valueOf(Role.MG.i())))
				.fetchMaps();
	}
	
	public Map<String,Object> getFTE(Integer fteid){
		return dsl.selectFrom(INFO_FTE)
				.where(INFO_FTE.FTEID.eq(fteid))
				.fetchOne().intoMap();
	}
}
