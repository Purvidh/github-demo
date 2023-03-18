Feature: Login feature file
Register user must be able to login the application

Scenario: Login with valid credentials

Given User navigates to login page
When User enters valid email address "purvi0406@yahoo.com" into email field
And User enters valid password "Aa1Bb2Cc3Dd4" into password field
And User clicks on login button
Then User should get login successfully.
