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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lucywu.xstem.service.DaemonService;


@Controller
public class DaemonController {
	private final static Logger logger = LoggerFactory.getLogger(DaemonController.class);
	
    private DaemonService ds;

    @Autowired
    public DaemonController(DaemonService ds) {
        this.ds=ds;
        logger.info("Start Interview Reminder Daemon");
//        ds.interviewReminder();
    }
}
