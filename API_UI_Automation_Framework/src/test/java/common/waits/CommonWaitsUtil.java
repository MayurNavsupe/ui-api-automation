package common.waits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.driver.WebDriverHolder;

public class CommonWaitsUtil extends WebDriverHolder{

    private static WebDriverWait wait;

    public CommonWaitsUtil() {
        wait = new WebDriverWait(getDriver(), 10);
    }

    public WebElement waitForElementVisible(WebElement locator) {
        return wait.until(ExpectedConditions.visibilityOf(locator));
    }

}
