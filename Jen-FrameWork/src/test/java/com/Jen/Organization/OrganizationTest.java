package com.Jen.Organization;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test
	public void createorgTest() {
		System.out.println("execute create org test");
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);

	}
}
