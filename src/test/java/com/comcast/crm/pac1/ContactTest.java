package com.comcast.crm.pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontactTest()
	{
			
					String URL=System.getProperty("url");
					String BROWSER=System.getProperty("browser","chrome");
					String USERNAME=System.getProperty("username");
					String PASSWORD=System.getProperty("password");
					
					System.out.println(URL);
					System.out.println(BROWSER);
					System.out.println(USERNAME);
					System.out.println(PASSWORD);

		System.out.println("execute createcontact");
	}
		@Test
		public void modifycontactTest()
		{
			System.out.println("execute modifycontact");
		}
		@Test
		public void deletecontactTest()
		{
			System.out.println("execute deletecontact");
		}

		@Test
		public void delcontactTest()
		{
			System.out.println("execute deletecontact");
		}
}
