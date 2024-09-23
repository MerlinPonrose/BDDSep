@AutomationExercise
Feature: Automation exercises test scenarios

Background:
Given User launch the browser and open the application "https://automationexercise.com/"

@test
Scenario: Validate the product is added to cart
When User click the product link
And User search the product "Blue Top" in the search box
And User clcik the first product which is displayed
And User enter the quantity "3" in the quantity textbox
And User click the add to cart button
And User click the view cart link
Then User validate the product "Blue Top" in the cart

@sanity @reg 
Scenario: Validate the searchbox
When User click the cart link
Then User validatde whether it landed in cart page

@sanity @test @testtt
Scenario: Validate the product
When User click the product link
And User search the product "Blue Top" in the search box