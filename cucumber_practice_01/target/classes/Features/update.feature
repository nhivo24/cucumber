Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Profile updated successfully
    Given user is on home page
    When I compare the title
    And user input Image, Name, Email, Website, Experience, Expertise, Education, click Alert and Comment
    And user submit information
    Then your information has been updated