package Pages;

import org.openqa.selenium.By;

public class FileUploadedPage extends BasePage {

    public FileUploadedPage() {
        super(By.xpath("//div//h3[normalize-space() = 'File Uploaded!']"));
    }
}
