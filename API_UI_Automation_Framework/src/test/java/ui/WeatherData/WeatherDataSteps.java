package ui.WeatherData;

import ui.MainSteps;

public class WeatherDataSteps extends MainSteps{
	
	
	public WeatherDataPage getPage()
	{
		return new WeatherDataPage();
	}
	
	public WeatherDataWaits getWaits()
	{
		return new WeatherDataWaits();
	}
	
	public WeatherDataAssertions getAssertions() {
		return new WeatherDataAssertions();
	}

	
	public WeatherDataSteps searchCity(String city)
	{
		logger.info(String.format("Search city %s and click Search Button", city));
		getPage()
		.SearchCity(city)
		.EnterOnSearch();
		
		getWaits()
		.waitForCityDataLoaded();
		
		return this;
	}


}
