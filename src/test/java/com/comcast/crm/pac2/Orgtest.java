package com.comcast.crm.pac2;

import org.testng.annotations.Test;

public class Orgtest {


	@Test
	public void createorgTest()
	
	{

		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("execute orgtest");
	}
 @Test
 public void modifyorgTest()
 {
	 System.out.println("execute modifyorg");
 }
 @Test
	public void deleteTest()
	{
		System.out.println("execute deletetest");
	}

}
