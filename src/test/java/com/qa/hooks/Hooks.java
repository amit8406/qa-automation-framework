package com.qa.hooks;
import com.qa.base.BaseTest;

public class Hooks extends BaseTest{
	
	public void launchBrowser()
	{
		setup();
	}
	
	public void closeBrowser()
	{
		tearDown();
	}

}
