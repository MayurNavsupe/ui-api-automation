package ui.Home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ui.MainSteps;
import ui.WeatherData.WeatherDataPage;

public class HomePage extends MainSteps{

	@FindBy(xpath = "//div[@id='navbarNav']//a[contains(text(),'Weather Data')]")
	WebElement WeatherData;
	
	@FindBy(xpath = "//button[contains(text(),'Reject optional cookies')]")
	WebElement rejectCookies;
	
	@FindBy(xpath = "//div[@id='navbarNav']//li")
	List<WebElement> homeMenuItems;
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public List<String> getMenuBarValues()
	{
		List<String> menuBar = new ArrayList();
		for(WebElement e : homeMenuItems)
		{
			menuBar.add(e.getText());
		}
		return menuBar;
		
	}
	

}
