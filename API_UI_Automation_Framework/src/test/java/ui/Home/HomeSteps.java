package ui.Home;

import ui.MainSteps;
import ui.WeatherData.WeatherDataPage;
import ui.WeatherData.WeatherDataSteps;

public class HomeSteps extends MainSteps{
	
	HomePage getPage()
	{
		return new HomePage();
	}
	
	public HomeSteps rejectCookies()
	{
		logger.info("Click Reject on cookies message box");
		getPage().rejectCookies.click();
		return this;
	}

	public HomeAssertions getAssertions() {
		return new HomeAssertions();
	}
	
	public WeatherDataSteps openWeatherData()
	{
		logger.info("Click on Weather Data Tab");
		getPage().WeatherData.click();
		return new WeatherDataSteps();
	}
	
	
}
