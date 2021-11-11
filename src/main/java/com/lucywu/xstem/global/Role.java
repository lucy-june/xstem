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

package com.lucywu.xstem.global;

public enum Role {
	ADMIN("0"),
	HRM("1"),
	HR("2"),
	MG("3"),
	OTHER("4"),
	CANDIDATE("10"),
	STE("11"),
	DISMISSED("12");
	
	private String value; 
	
	private Role (String value) { this.value = value; }
	
	public String v(){
		return this.value;
	}
	
	public Integer i(){
		return Integer.valueOf(this.value);
	}
}