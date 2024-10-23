package Pages;

import Hooks.BrowserHooks;
import Utility.JsonUtil;
import org.openqa.selenium.By;

public class BasePage
{
    private By locator;
    public BasePage(By locator)
    {
        this.locator = locator;
    }

    public void OpenUrl()
    {
        BrowserHooks.driver.get(JsonUtil.getConfigData("url"));
    }

    public boolean IsPageOpned()
    {
        return BrowserHooks.driver.findElements(locator).size()>0;

    }


}
