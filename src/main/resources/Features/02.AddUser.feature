@Smoke
Feature: Admin

Scenario: Login valid case
When Enter valid user name and password
Then User login to the Website successfully

Scenario: Go to Admin screen valid case
  When User click on Admin button
  Then User directed to Admin screen

Scenario: Add user valid case
  When User click on the Add user button
  Then User directed to Add user screen