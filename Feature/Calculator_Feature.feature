#Author: Automation Test User
#Module : Calculator Module
#Date : 30th May 2022
Feature: Calculator Functionality

@Add
  Scenario: 
    Test Case to verify addition functionality using given calculator

    Given Open Application url for testing
    When User should enter two enter and perform Addition operation
    Then Result should get display and verify output value for Addition.

@Sub
  Scenario: 
    Test Case to verify subtraction functionality using given calculator

     Given Open Application url for testing
    When User should enter two enter and perform subtraction operation
    Then Result should get display and verify output value for subtraction  .

@Multiply
  Scenario: 
    Test Case to verify multiplication functionality using given calculator

     Given Open Application url for testing
    When User should enter two enter and perform multiplication operation
    Then Result should get display and verify output value for multiplication .

@Div
  Scenario: 
      Test Case to verify division functionality using given calculator

     Given Open Application url for testing
    When User should enter two enter and perform division operation
    Then Result should get display and verify output value for division .
