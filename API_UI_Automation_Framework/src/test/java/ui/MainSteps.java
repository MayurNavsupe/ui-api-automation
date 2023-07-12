package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.log4testng.Logger;

import common.driver.WebDriverHolder;
import common.waits.CommonWaitsUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import ui.Home.HomeSteps;

public abstract class MainSteps extends WebDriverHolder{
	public static CommonWaitsUtil wait;
	
	public static Logger logger ;  
	
	public MainSteps init()
	{
		this.logger = Logger.getLogger(MainSteps.class);
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver(chromeOptions));
		wait = new CommonWaitsUtil();
		return this;
		
	}
	
	
	public HomeSteps openHomePage()
	{
		this.logger.info("Open home page ");
		getDriver().get("https://www.visualcrossing.com/");
		return new HomeSteps();
	}

}
