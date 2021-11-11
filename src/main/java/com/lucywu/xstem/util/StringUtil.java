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

public class StringUtil {
	public static String regular(String str){
		str=str.trim();
		str=str.replaceAll("[\\r\\n\\v\\t\\f ]", "");
		str=str.toLowerCase();
		
		return str;
	}
}
