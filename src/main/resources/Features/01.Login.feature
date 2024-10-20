@LoginFunction
Feature: Login

  Scenario: Login valid case
    When Enter valid user name and password
    Then User login to the Website successfully

    Scenario: Login invalid case
      When User click on user profile button
      And User click on logout button
      Then User logged out successfully
      When Enter invalid password for login
      Then User failed to login