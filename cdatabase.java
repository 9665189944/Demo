
import java.sql.*;

import java.io.*;



class cdatabase

{

	public static void main(String arg[])

	{

	       Connection con;

		Statement stmt;





		try

		{

			 Class.forName("com.mysql.jdbc.Driver");

    con = DriverManager.getConnection("jdbc:mysql://localhost/criminal","root","");

			System.out.println("connection successful");

			stmt=con.createStatement();

			
 stmt.executeUpdate("create table logins(UserName varchar(255),Password varchar(255))");
                  System.out.println("Table logins created");


 stmt.executeUpdate("create table register(ename varchar(255),eaddr varchar(255),contno varchar(255),emailid varchar(20),dob varchar(255))");
                  System.out.println("Table Registration created");


 stmt.executeUpdate("create table criminaldetails(cid int primary key,cname varchar(255),caddr varchar(255),dob varchar(255),age int,date_of_arrest varchar(255),cinv_in varchar(20),imgid int,imgname varchar(20))");
                  System.out.println("Table criminal details created");


stmt.executeUpdate("create table eyewitnessinfo(eid int primary key,ename varchar(255),eaddr varchar(255),dob varchar(255),age int,cmplntid int)");
         System.out.println("Table eyewitness information created");



stmt.executeUpdate("create table retrieve(crid int primary key,imgid int,imgename varchar(20))");
                  System.out.println("Table retrieving of images created");

stmt.executeUpdate("create table report(criname varchar(20),criid int primary key,otp varchar(20))");
                  System.out.println("Table report is created");




 stmt.close();
		con.close();

		}

		catch(Exception e){}

	}

}

