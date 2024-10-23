Feature: FileUpload
  @tag1
  Scenario: Uploading a File
    Given I open the URL and the file uploader page is opened
    When I upload the file "teams.PNG"
      And I click on the Upload button
    Then The file should be uploaded successfully
