package api.Tests.WeatherData;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import api.data.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static api.Tests.WeatherData.AbstractWeatherTest.requestSpecification;


public class WeatherDataGetTests extends AbstractWeatherTest{
	


	@Test
	public void test_getPuneData_verifyStatusCode()
	{
		Response response = requestSpecification.when().get(baseUrl);
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test
	public void test_getPuneData_verifyLatitudeLongitude()
	{
		Response response = requestSpecification.when().get(baseUrl);
		Assert.assertEquals(response.jsonPath().getString("latitude"), "18.5042");
		Assert.assertEquals(response.jsonPath().getString("longitude"), "73.8529");
	}
	
	@Test
	public void test_getPuneData_verifyResolvedAddress()
	{
		Response response = requestSpecification.when().get(baseUrl);
		Assert.assertEquals(response.jsonPath().getString("resolvedAddress"), "Pune, MH, India");
	}
	
}
