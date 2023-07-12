package api.Tests.WeatherData;

import org.testng.annotations.BeforeMethod;

import api.data.BaseClass;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class AbstractWeatherTest extends BaseClass{

	public static RequestSpecification requestSpecification;
	
	@BeforeMethod
	public void setup()
	{
		this.requestSpecification =  RestAssured.given();
		requestSpecification
		.queryParam("unitGroup", "us")
		.queryParam("key", apiKey)
		.queryParam("ContentType", "json");
	}
}
