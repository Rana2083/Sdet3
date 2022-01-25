package com.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class ExecuteQueryTest 
{
	@Test
	public void executeQueryTest() throws SQLException
	{

		Driver dref=new Driver();		
		DriverManager.registerDriver(dref);

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

		Statement stm=con.createStatement();

		ResultSet	res=stm.executeQuery("select * from student_info");
		while(res.next())
		{
			//System.out.println(res.getString(1)+" "+res.getString(2));
			if(res.getString(2).equals("ram"))
			{
				System.out.println("it is present inside the Data Base");				
			}

			else if(res.getString(2).equals("shyam"))
			{
				System.out.println("it is present inside the Data Base");				
			}
			else if(res.getString(2).equals("kphb"))
			{
				System.out.println("it is present inside the Data Base");				
			}
		}
		con.close();
	}
}
