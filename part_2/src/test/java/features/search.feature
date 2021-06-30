@release @search
Feature: Search a item
  # ===================================================
  # This feature for running tests from Search field
  # ====================================================

  @smoke
  Scenario Outline: Successful product search
    Given the user is on the "<lego web site>"
    When enter the "<product>" name in the search field
    And select on the "<suggested product>"
    And the user is able to see the product detail
    Then add the product in the bag


    Examples:
      | product        | suggested product | lego web site             |
      | LLavero star   | Llavero de BB-8   | https://www.lego.com/es-es|