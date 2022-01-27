Feature: Login Feature
  Verify if user is able to Login in to the site
@tag1
  Scenario: Login an account successfully
    Given user is on home page
    When I click customer login
    And I select my name
    Then user submit information
    
@tag2 
Scenario Outline: Add New Customer
Given user is on website
When I click Bank Manager Login
And I click add new customer button
And user enters Firstname as "<Firstname>"
And user enters Lastname as "<Lastname>"
And user enters Postcode as <Postcode>
Then user submit
Examples:
|Firstname|Lastname|Postcode|
|Vo       |Nhi     |500000  |
|         |        |4      |
   