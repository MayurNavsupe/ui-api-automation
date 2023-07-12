package ui.WeatherData;

import org.openqa.selenium.support.ui.WebDriverWait;

import ui.MainSteps;

public class WeatherDataWaits extends MainSteps{
	
	public WeatherDataPage getPage()
	{
		return new WeatherDataPage();
	}
	public void waitForCityDataLoaded()
	{
		MainSteps.logger.info("Wait for data to be loaded for weather");
		getPage().waitForCityDetailsToLoad();
	}

}
