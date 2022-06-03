#Author: Automation Test User
#Module : Login
#Date : 24th May 2022
Feature: 
  
  Login Functionality

  Scenario: Test Case to verify Login functionality with valid username and password
    Given Browser should be with login page
    When User should logs in using Username and Password and Click on Login button
    Then Home Page should get open and verify page title and close browser
