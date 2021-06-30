$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search a item",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@release"
    },
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Successful product search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user is on the \"\u003clego web site\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "enter the \"\u003cproduct\u003e\" name in the search field",
  "keyword": "When "
});
formatter.step({
  "name": "select on the \"\u003csuggested product\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is able to see the product detail",
  "keyword": "And "
});
formatter.step({
  "name": "add the product in the bag",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "suggested product",
        "lego web site"
      ]
    },
    {
      "cells": [
        "LLavero star",
        "Llavero de BB-8",
        "https://www.lego.com/es-es"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful product search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@release"
    },
    {
      "name": "@search"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"https://www.lego.com/es-es\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.theUserIsOnTheWebSite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"LLavero star\" name in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.enterTheProductNameInTheSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select on the \"Llavero de BB-8\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.select_on_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is able to see the product detail",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailSteps.theUserIsAbleToSeeTheProductDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add the product in the bag",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailSteps.addTheProductInTheBag()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});