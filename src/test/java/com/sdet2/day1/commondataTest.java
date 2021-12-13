package com.sdet2.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class commondataTest {

	public static void main(String[] args) throws IOException 
	{
		String dirpath=System.getProperty("user.dir");
	    String propfilepath = dirpath+"/commmon.properties";
        FileInputStream fls=new FileInputStream(propfilepath);
        Properties prop=new Properties();
        prop.load(fls);
        String value=prop.getProperty("url");
        System.out.println(value);	
	}

}
