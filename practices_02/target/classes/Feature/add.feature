Feature: Add new customer feature
  Verify if user is able to add new customer in to the site

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

