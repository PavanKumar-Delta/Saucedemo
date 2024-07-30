
Feature: this is saucelabs demo using background


Background: user is logged into saucedemo app
Given user is on the login page
When user enters valid creds
Then user is navigated to homepage


Scenario: test the menu items
And clicks the login button
Then user should able to see menu items

Scenario: test the add to cart functionality
And clicks the add button
Then items should be added to cart
