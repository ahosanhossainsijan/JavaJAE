package Pages;

import Utility.JsonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage
{
    private By locator;
    private WebDriver driver;
    public BasePage(By locator, WebDriver driver)
    {
        this.locator = locator;
        this.driver = driver;
    }

    public void OpenUrl()
    {
        driver.get(JsonUtil.getConfigData("url"));
    }

    public boolean IsPageOpned()
    {
        return driver.findElements(locator).size()>0;

    }


}
