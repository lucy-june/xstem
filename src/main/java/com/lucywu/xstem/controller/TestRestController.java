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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.lucywu.xstem.util.HttpUtil;

@RestController
public class TestRestController {
	private final static Logger logger = LoggerFactory.getLogger(TestRestController.class);
	
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public TestRestController(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @RequestMapping("/xxx")
    public String index(){
		logger.info(HttpUtil.url(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest()));

        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/yyy")
    public List<String> yyyy(){
		logger.info(HttpUtil.url(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest()));

    	List<String> list=new ArrayList<String>();
    	list.add("sdfasfd");
    	list.add("三法师");
        return list;
    }
    
    @RequestMapping("/zzz")
    public List<Map<String,Object>> zzz(){
		logger.info(HttpUtil.url(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest()));

    	List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
    	Map<String,Object> map=new HashMap<String,Object>();
    	map.put("a", "aaaa");
    	map.put("b", "bbbbbbb");
    	Map<String,Object> map2=new HashMap<String,Object>();
    	map2.put("e", "23154324");
    	map2.put("g", "34667yt");
    	map2.put("u", new Date());
    	list.add(map);
    	list.add(map2);
        return list;
    }
    
    @RequestMapping("/ttt")
    public String asssd(){
		logger.info(HttpUtil.url(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest()));

    	String str= jdbcTemplate.queryForObject("select password from tbl_account where email=?",new Object[]{"w1@qq.com"}, String.class);
		System.out.println(str);	
    	return str;
    }
}
