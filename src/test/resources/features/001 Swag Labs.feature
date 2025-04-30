Feature: 001 Login
  Validate login functionality

  @Test @Login @Regression
  Scenario: User logs in with valid credentials
    Given the portal is opened in the browser
    When I enter valid credentials
    And I click Login button
    Then I can see the Products section
