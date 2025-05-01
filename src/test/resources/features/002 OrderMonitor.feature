Feature: 002 Order
  Validate order is created successfully

@Test @Login @Regression
  Scenario: User creates an order
    Given the portal is opened in the browser
    When I enter valid credentials
    And I click Login button
    And I click on Order Monitor button
    And I click on Create button