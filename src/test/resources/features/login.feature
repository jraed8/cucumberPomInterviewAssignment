@login.feature
Feature: Login Functionality

  @login1
  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters username student
    And User enters password Password123
    And clicks the login button
    And User should be presented with a Header1 Login Success Message
    And User should be presented with a Header2 Login Success Message
    And User is able to Logout
    Then User is returned to the login page

  @login2
  Scenario: Unsuccessful login with Invalid Username and Invalid password
    Given User is on the login page
    When User enters username joeychestnut
    And User enters password hotdogs
    And clicks the login button
    Then User should be presented with an Invalid Username Error Message

  @login3
  Scenario: Unsuccessful login with Valid Username and Invalid Password
    Given User is on the login page
    When User enters username student
    And User enters password Password789
    And clicks the login button
    Then User should be presented with an Invalid Password Error Message

