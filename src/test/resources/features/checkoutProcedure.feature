Feature: User can checkout

  Scenario: User checkouts as a Guest User
    Given a User adds a product to cart
    When User selects Guest Radio Button
    Then Step Billing Details bar has correct Text
    When User press Continue Button under Customer Options
    And types "Kasia" in the the first name Field
    And types "Trzaska" in the Last name Field
    And types "Test@testxyzs.com" in Email Field
    And types "700900900" in Mobile No. Field
    And types "Test Company" in Company Field
    And types "First line Address" in Address first line Field
    And types "Second Line Address" in Address second line Field
    And types "Katowice" in City Field
    And types "90210" in ZIP Code Field
    And selects "Poland" from Country Field
    And selects "Slaskie" from Region Field
    And User clicks on Continue Button
    When User clicks on Delivery Details
    Then Delivery Method statement has correct Text
    When User clicks on Continue Button after Delivery Details
    And types " This is a test comment in the Order Comments"
    And clicks on Continue Button after Delivery Method
    When user user agrees to Terms & Conditions
    And clicks on Continue Button after Payment Method
    Then user sees correct order summary


