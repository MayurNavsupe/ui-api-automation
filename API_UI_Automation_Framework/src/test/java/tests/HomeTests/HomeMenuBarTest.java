package tests.HomeTests;

import java.util.Arrays;

import org.testng.annotations.Test;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;
import tests.AbstractTests;
import ui.Home.HomeSteps;

public class HomeMenuBarTest extends AbstractTests{

	
	@Test
	public void test_openHomePage_verifyMenuBarItems()
	{
		HomeSteps homeSteps = 	init()
			.openHomePage();
		homeSteps
			.rejectCookies();
		homeSteps
			.getAssertions()
			.assertMenuBarValues(Arrays.asList("Weather Data","Weather API","Query Builder","Pricing","API Docs", "More"));
	}
}
