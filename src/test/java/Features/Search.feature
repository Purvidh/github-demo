#Tidy Gherkin, Auto generate , different way of genrating auto step defination Part -14

Feature: Search functionality
Background: Given User open the Application
Scenario: Search for a valid product

When User enter valid product into Search field
And User click on Search button
Then Valid product should get displayed in search results

Scenario: Search for a non-existing product
When User enter non-existing product into Search field
And User click on Search button
Then Proper text informing the User about no prodcut matching should be displayed

Scenario: Search without providing any product
When User dont enter any product into Search field
And User clicks on Search button
Then Proper text informing the User about no prodcut matching should be displayed