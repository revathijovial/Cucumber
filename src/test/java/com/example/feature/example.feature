Feature: Hotel Booking

Scenario Outline: Login Page

Given user Launch The Application
When user Enter The Username "<userName>" And Password "<password>"
Then user Click the Login Button 

Examples:
  
   |userName|password|
   |Revathijovi|Revathi@27|
   
   