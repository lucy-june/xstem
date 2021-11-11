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

package com.lucywu.xstem.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.lucywu.xstem.global.Constants;
import com.lucywu.xstem.util.HttpUtil;

@RestController
public class OtherController {
	private final static Logger logger = LoggerFactory.getLogger(OtherController.class);
	
	//http://localhost/getSkills
	@RequestMapping("/getSkills")
	public List<String> getSkills(){
		logger.info(HttpUtil.url(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest()));

		Arrays.sort(Constants.skills);
		return Arrays.asList(Constants.skills);
	}

	//http://localhost/getSkills
	@RequestMapping("/getSites")
	public List<String> getSites(){
		logger.info(HttpUtil.url(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest()));

		return Arrays.asList(Constants.sites);
	}
	
	
}
