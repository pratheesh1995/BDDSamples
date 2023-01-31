@PhaseTwo
Feature: Contacts Management
CRUD Opeartions for Contact

Background: Valid Login
Given User is logged in

@SmokeTest                 
Scenario: Create a Contact
#Given User is logged in
When user create a Contact

@SmokeTest @RegressionTest
Scenario: Update a Contact
#Given User is logged in
When User update a Contact

#Scenario: Delete a Contact
#Given User is logged in
#When User Delete a Contact