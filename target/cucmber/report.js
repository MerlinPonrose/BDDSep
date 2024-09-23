$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:DataTable_AutomationExercise.feature");
formatter.feature({
  "name": "To demonstratte data table",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the product with data table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DataTable"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launch the browser and open the application \"https://automationexercise.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationExercise_test.launchbrowserr(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the product link",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationExercise_test.user_click_the_product_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User search the product in the search box",
  "rows": [
    {
      "cells": [
        "Product"
      ]
    },
    {
      "cells": [
        "Blue Top"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTable_AutomationExercise.user_search_the_product_in_the_search_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clcik the first product which is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationExercise_test.user_clcik_the_first_product_which_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter the quantity and Name in the quantity textbox",
  "rows": [
    {
      "cells": [
        "Quatity",
        "Name"
      ]
    },
    {
      "cells": [
        "3",
        "test"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTable_AutomationExercise.user_enter_the_quantity_and_Name_in_the_quantity_textbox(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});