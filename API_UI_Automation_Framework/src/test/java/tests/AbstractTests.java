package tests;

import org.testng.annotations.AfterMethod;

import ui.MainSteps;

public abstract class AbstractTests extends MainSteps {
	
	@AfterMethod
	public void tearDown()
	{
		getDriver().close();
	}

}
