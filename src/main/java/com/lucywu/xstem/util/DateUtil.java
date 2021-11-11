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

import java.sql.Date;
import java.sql.Timestamp;

public class DateUtil {
	public static Date currentDate(){
		return new Date(System.currentTimeMillis());
	}
	
	public static Timestamp currentTimestamp(){
		return new Timestamp(System.currentTimeMillis());
	}
	
	//yyyy-mm-dd
	public static Date parseDate(String dateStr){
		Date date=null;
		try{
			date=Date.valueOf(dateStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		return date;
	}
	
	//yyyy-mm-dd hh:mm:ss[.fffffffff]
	public static Timestamp parseTimestamp(String timestampStr){
		Timestamp ts=null;
		try{
			ts=Timestamp.valueOf(timestampStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ts;
	}
}
