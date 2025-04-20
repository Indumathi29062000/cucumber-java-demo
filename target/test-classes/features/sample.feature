#this is the comment syntax

#tag
@sample

#feature can be created, have multiple scenario
Feature: User Login

#common to all scenario- use background
  Background:
    Given the user opens the login page

  @login
  #scenario with parameters, outline, given, and,but,when,then
  Scenario Outline: Successful login with valid credentials
    Given the username is "<username>"
    And the password is "<password>"
    When the user clicks the login button
    Then the user should be logged in
    But the username should not be empty

#scenario outline with multiple datas for testing
    Examples:
      | username | password  |
      | indu    | password1 |
      | mathi      | password2 |