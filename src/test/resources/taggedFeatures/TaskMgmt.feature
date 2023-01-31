@PhaseOne
Feature: Task Management
CRUD Opeartions for Task

@RegressionTest
Scenario: Create a task
Given User is logged in
When user create a task

@SmokeTest
Scenario: Update a task
Given User is logged in
When User update a task

Scenario: Delete a task
Given User is logged in
When User Delete a task