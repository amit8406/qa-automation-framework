package com.qa.hooks;
import com.qa.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{
	
	@Before
	public void launchBrowser()
	{
		setup();
	}
	
	@After
	public void closeBrowser()
	{
		tearDown();
	}

}
