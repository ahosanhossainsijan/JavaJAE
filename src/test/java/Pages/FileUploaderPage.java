package Pages;

import Hooks.BrowserHooks;
import Utility.JsonUtil;
import org.openqa.selenium.By;

import java.nio.file.Paths;

public class FileUploaderPage extends BasePage {

    public FileUploaderPage() {
        super(By.xpath("//div//h3[normalize-space() = 'File Uploader']"));
    }


    By fileInput = By.xpath("//form//input[@id='file-upload']");
    By uploadButton = By.xpath("//form//input[@id='file-submit']");

    public void uploadFile(String fileName) {
        String fullPath = Paths.get(JsonUtil.getConfigData("path"), fileName).toAbsolutePath().toString();
        BrowserHooks.driver.findElement(fileInput).sendKeys(fullPath);
    }


    public void clickOnUpload()
    {
        BrowserHooks.driver.findElement(uploadButton).click();
    }
}
