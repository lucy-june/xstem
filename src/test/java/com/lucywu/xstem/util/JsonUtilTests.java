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

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.lucywu.xstem.Application;
import com.lucywu.xstem.util.JsonUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class JsonUtilTests {

	@Test
	public void blank(){
		
	}
	
//	@Test
	public void parseList(){
		 String jsonStr="[{\"a\":1,\"b\":2,\"c\":[{\"x\":3,\"y\":4},{\"z\":5}]},{\"p\":\"@\",\"q\":{\"u\":\"#\"}}]";
		 try {
			List<Map<String,Object>> results=JsonUtil.parseList(jsonStr);
			assertEquals(results.size(),2);
			assertEquals((int)results.get(0).get("a"),1);
			assertEquals(((List<Map<String,Object>>)results.get(0).get("c")).size(),2);
			assertEquals((int)((List<Map<String,Object>>)results.get(0).get("c")).get(1).get("z"),5);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test
	public void parseMap(){
		String jsonStr="{\"m\":123,\"n\":[{\"a\":1,\"b\":2,\"c\":[{\"x\":3,\"y\":4},{\"z\":5}]},{\"p\":\"@\",\"q\":{\"u\":\"#\"}}]}";
		 try {
			Map<String,Object> result=JsonUtil.parseMap(jsonStr);
			List<Map<String,Object>> results=(List<Map<String,Object>>)result.get("n");
			assertEquals(results.size(),2);
			assertEquals((int)results.get(0).get("a"),1);
			assertEquals(((List<Map<String,Object>>)results.get(0).get("c")).size(),2);
			assertEquals((int)((List<Map<String,Object>>)results.get(0).get("c")).get(1).get("z"),5);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
