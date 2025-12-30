package com.practice.Homepage;

import org.testng.annotations.Test;

public class HomePageTest {
	
	
	@Test
	public void createOrg() {
		System.out.println("Create Org Test from Homepage.");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String userName = System.getProperty("userName");
		String password = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(userName);
		System.out.println(password);
	}
	
	
	@Test
	public void createContact() {
		System.out.println("Create Contact Test from Homepage");
	}

}
