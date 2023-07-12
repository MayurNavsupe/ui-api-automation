package ui.WeatherData;

import org.testng.Assert;

import ui.MainSteps;
import static ui.MainSteps.logger;

public class WeatherDataAssertions extends MainSteps{

	public WeatherDataPage getPage()
	{
		return new WeatherDataPage();
	}
	
	public WeatherDataAssertions assertWeatherDetailsNumberIsCorrect()
	{
		logger.info("Assert city weather details have 6 fields");
		Assert.assertEquals(getPage().TempDetails(),6);
		return this;
	}
	
	public WeatherDataAssertions assertHistoricalDataMessage(String city)
	{
		logger.info("Assert city Historical Message is correct");
		Assert.assertEquals(getPage().getHistoricalDataText(), String.format("Historical weather data for %s", city));
		return this;
	}
}
