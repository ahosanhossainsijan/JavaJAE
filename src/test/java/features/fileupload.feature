Feature: FileUpload
  Upload a File
  @tag1
  Scenario: Uploading a File
    Given I will open the url and file uploader page is opned
    When I upload the 'teams.PNG' file
    And I click on Upload Button
    Then The File is Uploaded
    #1
  #2
  #3