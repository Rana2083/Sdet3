package com.vtiger.generic;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil 
{
	
	private JavaUtil()
	{
		
	}
    public static JavaUtil ObjForJavaUtil()
    {
    	JavaUtil jv=new JavaUtil();
    	return jv;
    }
  /**
   * author=tiger
   * Description:This method used to generate Random Number
   *    @return random number
   */
    public int generaterandomnumber()
    {
    	Random re=new Random();
    	return re.nextInt(1000);
    }
    
    public int generaterandomphonenumber()
    {
    	Random rp=new Random();
    	return rp.nextInt(1000000000);
    	
    }
    /**
     * 
     * @author RANA PRATHAP
     * Description this method used to generate random name
     */
	public String getfullname()
	{
		Faker faker=new Faker();
		return faker.name().fullName();
	}
	/**
	 * description: get the first name
	 * @return
	 */
	public String getfirstname()
	{
		Faker faker=new Faker();
		return faker.name().firstName();
	}
	/**
	 * description: get the Last name
	 * @return
	 */
	public String getlastname()
	{
		Faker faker=new Faker();
		return faker.name().lastName();
	}
	
	
	
	

}
