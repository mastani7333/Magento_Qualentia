Feature: Signin Functionality

  Scenario Outline: Validate the Signin functionality with valid credentials
    Given browser is open
    And the user should be on the Magento home page
    When the user clicks on the Sign In link
    When user enter <Email> and  <password>
    And user clicks the sign in button
    Then user should succussfully completed the login functionality
    And user should naviagated into My Home page
    And the user should see a welcome message Thank you for registering with Main Website Store.

    Examples: 
      | Email                     | password    |
      | mas123                    | masss123    |
      | mastani                   | muskan@123  |
      | mastanishaik746@gmail.com | Mastani@123 |
