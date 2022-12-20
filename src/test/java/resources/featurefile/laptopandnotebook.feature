Feature: laptop and notebook
  As a User I want to verify laptop and note book page functionality

  @smoke
  Scenario: Verify Products Price Display High To Low Successfully
    Given User is on homepage
    When user click on laptop and note book tab
    And user click on show all laptop and note book
    And User click on sort by price high to low
    Then verify products are sorted by high to low price

  @sanity
  Scenario: Verify That User Place Order Successfully
    Given User is on homepage
    And User click on currency link
    When user mouse hover on laptop and desktop tab
    And user click on show all laptop and note book
    And User click on sort by price high to low
    And User click on Macbook tab
    And User click on add to cart
    Then verify message Success You have added MacBook to your shopping cart!
    And User click on shopping cart
    Then verify text Shopping Cart
    And verify the Product name MacBook
    And User Change Quantity
    And User click on update cart
    Then Verify the message Success You have modified your shopping cart!
    And Verify the Total
    And User click on checkout button
    Then  Verify the text Checkout
    And Verify the Text New Customer
    And User Click on Guest Checkout radio button
    And User Click on Continue tab
    And User enter name "DDD"
    And User enter last name "Paris"
    And User enter email "paris123@gmail.com"
    And User enter telephone number "1234567890"
    And user enter address "2, Italy raod"
    And User enter city "France"
    And User enter post code "HA9 6BB"
    And User enter country "Andorra"
    And User enter zone "Anugus"
    And User click on continue button
    And User enter comments to their order in to text area
    And User click on check box of terms and conditions
    And user click on continue button
    Then verify the message Warning: Payment method required!



