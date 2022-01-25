package com.sdet2.day1;

public class count 
{
	public static void main(String[] args) 
	{
      String s="pravalika";
      int strindex=0;
      int count=0;
      for(int i=0;i<s.length();i++)
      {
    	  int index = s.indexOf('a', strindex);
    	  if(index>=0)
    	  {
    		  count++;
    		  strindex=index+1;
    	  }
    	  else 
    	  {
    		  break;
    	  }
    	  
      }
         System.out.println("A caharacter repaeted:"+count+"times"); 
	}
}
