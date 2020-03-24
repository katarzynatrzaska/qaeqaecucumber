Feature: Adding product to cart

  Scenario: User can add product to Cart
    Given Customer is on ProductPage
    When User clicks on Add To Cart Button under Test Product1
    Then Success Message is Displayed
    And Item and Price is Displayed




