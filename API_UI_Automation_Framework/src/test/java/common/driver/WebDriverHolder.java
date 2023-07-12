package common.driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebDriverHolder {
	
	private static WebDriver driver;
	

	public static WebDriver getDriver() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		WebDriverHolder.driver = driver;	}
	
}
