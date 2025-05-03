Feature: 003 UploadCsvFile
  Validate error is displayed when uploading an invalid CSV file

  @Test @OrderMonitor @Regression @UploadCsvFile
  Scenario: User uploads an invalid CSV file
    Given the portal is opened in the browser
    When I enter valid credentials
    And I click Login button
    And I click on Order Monitor button
    And I click on Orders tab
    And I upload a CSV file with invalid data
    Then I can see the error message "Import Error"