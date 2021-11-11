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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lucywu.xstem.Application;
import com.lucywu.xstem.service.AccountService;

/**
 * @author lucy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AccountServiceTests
{

	@Autowired
	private AccountService accountService;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountServiceTests.class);

	@Test
	public void blank(){
		
	}
	
//	@Test
	public void regist(){
		int r=accountService.regist("testemail"+new Random().nextInt(10000)+"@qq.com",
								"testname"+new Random().nextInt(10000), 
								"testpwd"+new Random().nextInt(10000));
		Assert.assertTrue(r>0);
	}
	
//	@Test
	public void steAccount(){
		Map r1=accountService.steAccount("w1@qq.com");
		Map r2=accountService.steAccount("z1@qq.com");
		
		assertNotNull(r1);
		assertNotNull(r2);
		logger.info(r1.toString());
		logger.info(r2.toString());
	}
	
//	@Test
	public void fteAccount(){
		Map r1=accountService.fteAccount("hr@qq.com");
		Map r2=accountService.fteAccount("mg1@qq.com");
		Map r3=accountService.fteAccount("mg2@qq.com");
		
		assertNotNull(r1);
		assertNotNull(r2);
		assertNotNull(r3);
		logger.info(r1.toString());
		logger.info(r2.toString());
		logger.info(r3.toString());
	}
}
