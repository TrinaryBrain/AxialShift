/*
 * Copyright 2014 Semion Nadezhdin
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.axialshift.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShaderData {

	private String path;
	
	private String shaderSource;
	
	public ShaderData(String path){
		this.path=path;
		
		String line;
		
		StringBuilder shaderSourceBuilder = new StringBuilder();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));

			while ((line = reader.readLine()) != null) {
				shaderSourceBuilder.append(line).append("\n");
			}
			shaderSource=shaderSourceBuilder.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public String getShaderSource(){
		return shaderSource;
	}
	
}
