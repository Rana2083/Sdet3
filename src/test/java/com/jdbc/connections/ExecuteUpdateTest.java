package com.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest
{

	public void executeUpdate() throws SQLException
	{
		Driver dref=new Driver();		
		DriverManager.registerDriver(dref);

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

		Statement stm=con.createStatement();

		int res=stm.executeUpdate("insert into student_info(regno,firstname,middlename) values('4','rana','prathap');");

		if(res==1)
		{
			System.out.println("update suceefull");

		}
		else
		{
			System.out.println("update failed");
		}
		con.close();



	}






}
