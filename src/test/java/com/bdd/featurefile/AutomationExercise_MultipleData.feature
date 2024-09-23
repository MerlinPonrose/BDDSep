@Multiple
Feature: Multiple test data for Automation exercise

@test
Scenario Outline: To validate the Automation exercise with multiple data

Given User launch the browser and open the application "https://automationexercise.com/"
When User click the product link
And User search the product "<Product>" in the search box
And User clcik the first product which is displayed
And User enter the quantity "<Quantity>" in the quantity textbox
And User click the add to cart button
And User click the view cart link
Then User validate the product "<Product>" in the cart

Examples:
|Product|Quantity|
|Blue Top|3|
|Stylish Dress|1|
|Winter Top|2|



