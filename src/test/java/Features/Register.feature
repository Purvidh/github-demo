#Lecture 11,12,13

Feature: User Registration
Background:Given User navigate to Register Account page

Scenario: Register with mandatroy fields

When User enters firstname "Purvi" into the First Name field
And Enters lastname "Dholakia" into the Last Name field
And Enters email address "purvi0406@yahoo.cm" into the EMail field
And Enters telephone "1234567890" into the Telephone field
And Enters password "Aa1Bb2Cc3Dd4" into the Password field
And Enters password "Aa1Bb2Cc3Dd4" into the Password Confirm field
And Selects Privacy Policy field
And Clicks on Continue button
Then Account should get successfully created

Scenario: Register with all fields
When User enters firstname "Purvi" into the First Name field
And Enters lastname "Dholakia" into the Last Name field
And Enters email address "purvi0406@yahoo.cm" into the EMail field
And Enters telephone "1234567890" into the Telephone field
And Enters password "Aa1Bb2Cc3Dd4" into the Password field
And Enters password "Aa1Bb2Cc3Dd4" into the Password Confirm field
And Selects Yes for Newsletter
And Selects Privacy Policy field
And Clicks on Continue button
Then Account should get successfully created

Scenario: Register without providing any fields
When User don't enter details into any fields
And Clicks on Continue button
Then Warning messages should be displayed for all the mandatory fields

Scenario: Register with duplicate emaill address
When User enters firstname "Purvi" into the First Name field
And Enters lastname "Dholakia" into the Last Name field
And Enters email address "purvi0406@yahoo.cm" into the EMail field
And Enters telephone "1234567890" into the Telephone field
And Enters password "Aa1Bb2Cc3Dd4" into the Password field
And Enters password "Aa1Bb2Cc3Dd4" into the Password Confirm field
And Selects Privacy Policy field
And Clicks on Continue button
Then Warning message informing the user about duplicate email address


 