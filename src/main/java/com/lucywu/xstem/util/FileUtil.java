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

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtil {
	public static byte[] toByteArray(String filepath) throws IOException{  

		File f = new File(filepath);  
		if(!f.exists()){  
			throw new FileNotFoundException(filepath);  
		}  

		ByteArrayOutputStream bos = new ByteArrayOutputStream((int)f.length());  
		BufferedInputStream in = null;  
		try{  
			in = new BufferedInputStream(new FileInputStream(f));  
			int buf_size = 1024;  
			byte[] buffer = new byte[buf_size];  
			int len = 0;  
			while(-1 != (len = in.read(buffer,0,buf_size))){  
				bos.write(buffer,0,len);  
			}  
			return bos.toByteArray();  
		}catch (IOException e) {  
			e.printStackTrace();  
			throw e;  
		}finally{  
			try{  
				in.close();  
			}catch (IOException e) {  
				e.printStackTrace();  
			}  
			bos.close();  
		}  
	}  
}
