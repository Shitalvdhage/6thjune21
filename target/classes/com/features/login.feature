Feature: login test for Offline JBK Application

Scenario: valid login test

Given user should be on login page
When user enter uname and pass
And click login button
Then user will be on homepage
