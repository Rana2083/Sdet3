package com.sdet2.day1;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.parser.JSONParser;

public class Read_Data_JsonTest {

	public static void main(String[] args) throws FileNotFoundException {
		String dirpath=System.getProperty("user.dir");
	    String propfilepath = dirpath+"/empoly.Json";
		JSONParser jsonparser =new JSONParser();
		FileReader reader=new FileReader(propfilepath );
		

	}

}

