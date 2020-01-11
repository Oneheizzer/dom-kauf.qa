Feature: Login and buy into dom-kauf website
  Exsiting user should be able to login into account, search and add items to the cart using correct credentials

  Scenario Outline: Login into account and add item to the cart using correct credentials
    Given User navigates to dom-kauf website on the home page
    When User clicks on the login button
    And User enters a valid username "<username>"
    And User enters a valid password "<password>"
    And User clicks on sign in button
    Then User should be logged in
    When User clicks on the search field
    And User fills down the name of item
    And User presses search button
    Then Users should see a chosen item
    When User clicks on a chosen item
    And User adds a chosen item into cart
    And User clicks on checkout button
    Then User should see his cart with chosen item

    Examples:
      |     username            |   password   |
      |  oneheizzer.qa@gmail.com |   41177232u  |