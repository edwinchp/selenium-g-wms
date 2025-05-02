Feature: 002 OrderMonitor
  Validate order is created successfully

  @Test @OrderMonitor @Regression
  Scenario: User creates an order
    Given the portal is opened in the browser
    When I enter valid credentials
    And I click Login button
    And I click on Order Monitor button
    And I click on Create button
    And I enter Shipping Order details:
      | Number | Task ID | Purchase Order | Order Value | Order Notes | Transportation Method |
      |  10001 | TSK-21  | PO-456         |      199.99 | Urgent      | Fulfillment           |
    And I enter Shipping Address details:
      | Name       | Address 1   | Address 2 | City   | State | Zip Code | Phone       | Email            | Country |
      | John Smith | 123 Main St | Apt 4B    | Gotham | NY    |    10001 | 555-1234567 | john@example.com | US     |
    And I enter Billing Address details:
      | Name       | Address 1   | Address 2 | City   | State | Zip Code | Phone       | Email            | Country |
      | John Smith | 123 Main St | Apt 4B    | Gotham | NY    |    10001 | 555-1234567 | john@example.com | US     |
    And I click on Add new order line button
    And I enter the SKU order: "CS099-CAH"
    And I enter 10 in the Package Quantity field
    And I enter 23 in the Sales Price field
    And I click on Save button
    Then I can see the success message
