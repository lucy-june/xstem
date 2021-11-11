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
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lucywu.xstem.Application;
import com.lucywu.xstem.global.Constants;
import com.lucywu.xstem.util.EmailUtil;

/**
 * Created by lucy on 5/21/2019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class EmailUtilTests {
	
	@Test
	public void blank(){
	}
	
//	@Test
    public void sendEmail(){
		String title="WAP Interview Reminder";
		String msg="Hi @STE:\n\n"+
				   "You are set to interview with WAP! Please confirm that you received this message and that the schedule below works for you.\n"+
				   "Time:@TIME \n"+
				   "Location:@LOCATION \n"+
				   "Contact　Person:@PERSON \n"+
				   "Contact Number:@PHONE \n"+
				   "Replenish:@REPLENISH \n\n"+
				   "Regards \n\n"+
				   "WAP HR TEAM";

        EmailUtil.sendEmail("shuimuyanyuan@qq.com", title, msg);
    }

}
