package StepDefinitions;

import Pages.FileUploaderPage;
import Pages.FileUploadedPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FileUploadSteps {

    private FileUploaderPage fileUploaderPage;
    private FileUploadedPage fileUploadedPage;



    @Given("I open the URL and the file uploader page is opened")
    public void OpenTheUrlAndFileUploaderPageIsOpened() {
        fileUploaderPage = new FileUploaderPage();
        fileUploaderPage.OpenUrl();
        Assert.assertTrue(fileUploaderPage.IsPageOpned(), "Page is not opened");
    }

    @When("I upload the file {string}")
    public void UploadTheFile(String filename) {
        fileUploaderPage.uploadFile(filename);
    }

    @When("I click on the Upload button")
    public void ClickOnTheUploadButton() {
        fileUploaderPage.clickOnUpload();
    }

    @Then("The file should be uploaded successfully")
    public void FileIsUploaded() {
        fileUploadedPage = new FileUploadedPage();
        Assert.assertTrue(fileUploadedPage.IsPageOpned(), "File is not uploaded");
    }
}