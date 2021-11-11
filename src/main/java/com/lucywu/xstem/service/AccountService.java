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

import static com.lucywu.xstem.jooq.domain.tables.InfoAccount.INFO_ACCOUNT;
import static com.lucywu.xstem.jooq.domain.tables.InfoDepartment.INFO_DEPARTMENT;
import static com.lucywu.xstem.jooq.domain.tables.InfoFte.INFO_FTE;
import static com.lucywu.xstem.jooq.domain.tables.InfoSte.INFO_STE;
import static com.lucywu.xstem.jooq.domain.tables.RecruitPosition.RECRUIT_POSITION;

import java.util.Map;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lucy
 *
 */
@Service
@Transactional
public class AccountService
{
	@Autowired
	private DSLContext dsl;
	
	public int regist(String email,String name, String password){
		int refid=dsl.insertInto(INFO_STE)
					.set(INFO_STE.EMAIL,email)
					.set(INFO_STE.EMAIL_SELF,email)
					.set(INFO_STE.NAME,name)
					.set(INFO_STE.ROLE,10)
					.returning(INFO_STE.STEID)
					.fetchOne()
					.getSteid();
		
		dsl.insertInto(INFO_ACCOUNT)
			.set(INFO_ACCOUNT.EMAIL,email)
			.set(INFO_ACCOUNT.PASSWORD,password)
			.set(INFO_ACCOUNT.REFID,refid)
			.set(INFO_ACCOUNT.ROLE,10)
			.execute();
		
		return refid;
	}
	
	public Map<String,Object> steAccount(String email){
		return 	dsl.select(INFO_STE.fields())
					.select(INFO_ACCOUNT.ACCOUNTID,INFO_ACCOUNT.PASSWORD)
					.select(INFO_DEPARTMENT.DEPARTMENTNAME)
					.select(RECRUIT_POSITION.POSITIONNAME)
					.from(INFO_ACCOUNT)
					.join(INFO_STE)
					.on(INFO_ACCOUNT.EMAIL.eq(INFO_STE.EMAIL))
					.or(INFO_ACCOUNT.EMAIL.eq(INFO_STE.EMAIL_SELF))
					.leftJoin(INFO_DEPARTMENT)
					.on(INFO_STE.DEPARTMENTID.eq(INFO_DEPARTMENT.DEPARTMENTID))
					.leftJoin(RECRUIT_POSITION)
					.on(INFO_STE.POSITIONID.eq(RECRUIT_POSITION.POSITIONID))
					.where(INFO_STE.EMAIL.eq(email))
					.or(INFO_STE.EMAIL_SELF.eq(email))
					.fetchOne()
					.intoMap();
	}
	
	public Map<String,Object> fteAccount(String email){
		return 	dsl.select(INFO_FTE.fields())
					.select(INFO_ACCOUNT.ACCOUNTID,INFO_ACCOUNT.PASSWORD)
					.select(INFO_DEPARTMENT.DEPARTMENTNAME)
					.select(DSL.val("FTE").as("positionname"))
					.from(INFO_ACCOUNT)
					.join(INFO_FTE)
					.on(INFO_ACCOUNT.EMAIL.eq(INFO_FTE.EMAIL))
					.or(INFO_ACCOUNT.EMAIL.eq(INFO_FTE.EMAIL_SELF))
					.leftJoin(INFO_DEPARTMENT)
					.on(INFO_FTE.DEPARTMENTID.eq(INFO_DEPARTMENT.DEPARTMENTID))
					.where(INFO_FTE.EMAIL.eq(email))
					.or(INFO_FTE.EMAIL_SELF.eq(email))
					.fetchOne()
					.intoMap();
	}
}
