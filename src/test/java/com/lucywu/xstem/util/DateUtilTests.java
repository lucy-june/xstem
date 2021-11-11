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

package com.lucywu.xstem.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lucywu.xstem.Application;
import com.lucywu.xstem.util.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class DateUtilTests {
	
	private static final Logger logger = LoggerFactory.getLogger(DateUtilTests.class);

	@Test
	public void blank(){
		
	}
	
//	@Test
	public void currentDate(){
		 logger.info(DateUtil.currentDate().toString());
	}
	
//	@Test
	public void currentTimestamp(){
		logger.info(DateUtil.currentTimestamp().toString());
	}
	
//	@Test
	public void parseDate(){
		logger.info(DateUtil.parseDate("2019-06-02").toString());
	}
	
//	@Test
	public void parseTimestamp(){
		logger.info(DateUtil.parseTimestamp("2019-06-02 09:55:00").toString());
		logger.info(DateUtil.parseTimestamp("2019-06-02 09:55").toString());
	}
}
