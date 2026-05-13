Feature: Login Functionality

Scenario: Check login with valid credentials

Given user present on login page
When user entered the valid uname and pass
And clicks on login button
Then user navigate to homepage
