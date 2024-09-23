Feature: To demonstratte data table

@DataTable
Scenario: Validate the product with data table
Given User launch the browser and open the application "https://automationexercise.com/"
When User click the product link
And User search the product in the search box
|Product|
|Blue Top|
And User clcik the first product which is displayed
And User enter the quantity and Name in the quantity textbox
|Quatity|Name|
|3|test|