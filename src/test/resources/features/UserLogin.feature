Feature: Login Function

#Scenario: Valid Login
#Given User is on Login page
#When User enters login cred
#Then Should navigate to Home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!" 
#Then Should navigate to Home page

#Scenario Outline: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>" 
#Then Should navigate to Home page

#Examples:

#|username | password |
#|tomsmith | SuperSecretPassword! |
#|tomsmith1 | SuperSecretPassword! |
#|tomsmith2 | SuperSecretPassword! |




##Scenario: Place Order
##Given user is must have logged in

##When User search Item
#Item1
#Item2
#Item3

#Then Item must be listed



Scenario: Valid Login
Given User is on Login page
When User enters login cred 
 |username | password |
 |tomsmith | SuperSecretPassword! |
 Then Should navigate to Home page