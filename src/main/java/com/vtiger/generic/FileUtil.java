package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil 
{
	private FileUtil()// restrcting the creating the object 
	{

	}
	public static FileUtil objectoffileutil()
	{
		FileUtil prop=new FileUtil();
	    return prop;
	}

	public String readdatafrompropfile(String key) throws IOException
	{
		FileInputStream fls= new FileInputStream(IAutoconstat.propfilepath);
		Properties prop=new Properties();
		prop.load(fls);
		return prop.getProperty(key);
	}

	public String readdatafrompropfile(String key,String path) throws IOException
	{
		FileInputStream fls= new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fls);
		return prop.getProperty(key);
	}
}
