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

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	public static List<Map<String,Object>> parseList(String jsonStr) throws JsonParseException, JsonMappingException, IOException{
		 List<Map<String,Object>> results=null;
		 results = new ObjectMapper().readValue(jsonStr, List.class);
		 return results;
	}
	
	public static Map<String,Object> parseMap(String jsonStr) throws JsonParseException, JsonMappingException, IOException{
		Map<String,Object> result=null;
		result=new ObjectMapper().readValue(jsonStr, Map.class);
		return result;
	}
}
