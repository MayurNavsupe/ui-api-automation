package ui.WeatherData;

import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.waits.CommonWaitsUtil;
import ui.MainSteps;
import static ui.MainSteps.logger;

public class WeatherDataPage extends MainSteps{
	
	@FindBy(id = "wxlocation")
	private WebElement EnterLocation;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement SearchButton;
	
	@FindBy(css = "div.justify-content-center div.text-muted")
	private List<WebElement> weatherDetails;
	
	@FindBy(xpath = "//div[contains(text(),'Max temp')]")
	private WebElement MaxTemp;
	
	@FindBy(css = ".align-items-end")
	private WebElement HistoricalElement;
	
	public WeatherDataPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public WeatherDataPage SearchCity(String cityName)
	{
		logger.info(String.format("Search %s city", cityName));
		wait.waitForElementVisible(this.EnterLocation).sendKeys(cityName);
		return this;
	}
	
	public WeatherDataPage EnterOnSearch()
	{
		logger.info("Enter on Search Button");
		wait.waitForElementVisible(this.SearchButton).click();
		return this;
	}
	
	public int TempDetails()
	{
		wait.waitForElementVisible(this.MaxTemp);
		return weatherDetails.size();
	}
	
	public String getHistoricalDataText()
	{
		wait.waitForElementVisible(this.MaxTemp);
		wait.waitForElementVisible(this.HistoricalElement);
		return this.HistoricalElement.getText();
	}
	
	public void waitForCityDetailsToLoad()
	{
		this.weatherDetails.forEach(e -> e.isDisplayed());
	}
}
