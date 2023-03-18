Feature: User Login
Registered User should be able to login to access account details

Background: Given User navigates to Login page

Scenario: Login with valid credentials

When User enters valid Email address "purvi0406@yahoo.com"
And User enters valid Passowrd "Aa1Bb2Cc3Dd4"
And Clicks on Login button
Then User should login successfully

Scenario: Login with invalid credentials
When User enters invalid email address "purvi040623@yahoo.com"
And Enters invalid password "12345"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with valid emmail address and invalid password
When User enters valid Email address "purvi0406@yahoo.com"
And Enters invalid password "1234567890"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with invalid emmail address and valid password
When User enters valid Email address "purvi040623@yahoo.com"
And Enters invalid password "1234567890"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login wihtout providing any credentials

When User dont enter any credentials
And Clicks on Login button
Then User should get a proper warning message