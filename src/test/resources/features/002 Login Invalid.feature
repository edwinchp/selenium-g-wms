Feature: 002 Login Invalid
  Validate login functionality

  @Test @Login @Regression
  Scenario: User logs in with invalid credentials
    Given the portal is opened in the browser
    When I enter invalid credentials
    And I click Login button
    Then I can see the success login message