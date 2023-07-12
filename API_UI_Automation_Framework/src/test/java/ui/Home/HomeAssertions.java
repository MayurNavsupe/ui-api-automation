package ui.Home;

import java.util.List;

import org.testng.Assert;

import ui.MainSteps;

public class HomeAssertions extends MainSteps {
	
	
	public static HomePage getPage()
	{
		return new HomePage();
	}
	
	public HomeAssertions assertMenuBarValues(List<String> expectedValues)
	{
		logger.info(String.format("Assert Menu Bar have %s values", expectedValues));
		for(String menubarItem:expectedValues)
		{
			Assert.assertTrue(getPage().getMenuBarValues().contains(menubarItem));
		}
		return this;
	}

}
