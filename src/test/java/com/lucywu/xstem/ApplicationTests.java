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

package com.lucywu.xstem;

import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lucywu.xstem.Application;
import com.lucywu.xstem.global.Role;


/**
 * @author lucy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests
{

	@Autowired
	private Application application;
	
	@Test
	public void blank(){
		
	}
	
//	@Test
	public void check()  {
		assertNotNull(application);
	}
	
//	@Test
	public void test(){
		Date date=Date.valueOf("1993-02-02");
		System.out.println(date.toString());
		Date created=new Date(System.currentTimeMillis());
		System.out.println(created.toString());
		Timestamp ts=Timestamp.valueOf("2019-06-02 16:08:00");
		System.out.println(ts.toLocaleString());
		System.out.println(Role.ADMIN.toString());
		Timestamp updatedat=Timestamp.valueOf("2019-12-01 00:00:00");
		updatedat.setMonth(updatedat.getMonth()+1);
		System.out.println(updatedat.toString());
	}
}
