package tests.WeatherDataTests;

import java.util.Arrays;

import org.testng.annotations.Test;

import tests.AbstractTests;
import ui.Home.HomeSteps;
import ui.WeatherData.WeatherDataAssertions;
import ui.WeatherData.WeatherDataSteps;

public class WeatherDataSearchTest extends AbstractTests{

	
	@Test
	public void test_openWeatherDataTabSearchPuneCity_verifyCityWeatherDetailItemNumber()
	{
		HomeSteps homeSteps = 	init()
			.openHomePage();
		WeatherDataSteps weatherDataSteps = homeSteps
			.rejectCookies()
			.openWeatherData();
		weatherDataSteps
				.searchCity("Pune");
		WeatherDataAssertions weatherDataAssertions = weatherDataSteps
				.getAssertions();
		weatherDataAssertions
				.assertWeatherDetailsNumberIsCorrect();
	}
	
	@Test
	public void test_openWeatherDataTabSearchPuneCity_verifyHistoricalAndWeatherMessage()
	{
		HomeSteps homeSteps = 	init()
			.openHomePage();
		WeatherDataSteps weatherDataSteps = homeSteps
			.rejectCookies()
			.openWeatherData();
		weatherDataSteps
				.searchCity("Pune");
		WeatherDataAssertions weatherDataAssertions = weatherDataSteps
				.getAssertions();
		weatherDataAssertions
				.assertHistoricalDataMessage("Pune");
	}
}
