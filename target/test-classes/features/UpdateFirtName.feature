@Second
Feature: Update First Name

Scenario Outline: A user signin using <username> and <password>
Given The user is at Homepage
When He clicks on the signin button
And enters "<username>" and "<password>"
Then He should sign in to the system
Examples:

|username|password|
|SeleniumTesting@gmail.com|Selenium123|


Scenario Outline: A user changes the First Name by providing <old password>

Given When a user is on My account page
When He changes his First Name
And Provides the "<old password>"
Then An updated name should get displayed 

Examples:
|old password|
|Selenium123|