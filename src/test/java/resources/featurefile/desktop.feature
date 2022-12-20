Feature: Login Test
  As user I want to go to desktop page on tutorial ninja

  @smoke
  Scenario: Verify Product Arrange In Alphabetical Order
    Given I am on home page
    When I click on currency link
    And I mouse hover on Desktops tab and click on it
    And I click on show all desktops
    And I select sort by position name z to a
    And I should see the products are arranged in Descending order

  @sanity
  Scenario: verify Product Added To Shopping Cart SuccessFully
    Given I am on home page
    When I click on currency link
    And I mouse hover on Desktops tab and click on it
    And I click on show all desktops
    And I select sort by position name A to Z
    And I click on Product HPLP
    And I verify the text HP LP3065
    And I select delivery date 2022-11-30
    And I enter quantity 1
    And I click on add to cart button
    Then I verify the message Success: You have added HP LP3065 to your shopping cart!
    And I click on shopping cart display in to success message
    And I verify text shopping cart
    And I verify the product name
    And I verify delivery date
    And I verify the model
    Then I verify Total amount
