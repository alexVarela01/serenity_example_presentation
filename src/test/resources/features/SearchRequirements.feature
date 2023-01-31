#noinspection CucumberUndefinedStep
Feature: Google - Search Engine

  Background: Open Google search page
    Given user navigates to google

  @SearchFeature
  @TestID-1
  Scenario Outline: Perform Search
    Given the search page is opened and cookies banner is closed
    When the user fills in the search field with "<SEARCH_TEXT>" and clicks on the search button
    Then the user should see "<SEARCH_TEXT>" as the search result
    Examples:
      | SEARCH_TEXT  |
      | Serenity BDD |
      | Cucumber BDD |


  @SearchFeature
  @TestID-2
  Scenario Outline: Search and Change page
    Given the search page is opened and cookies banner is closed
    When the user fills in the search field with "<SEARCH_TEXT>" and clicks on the search button
    Then the user should see "<SEARCH_TEXT>" as the search result
    When the user scrolls to the bottom
    And the user clicks on the "Next" button
    Then the user should be on the page "2"
    Examples:
      | SEARCH_TEXT  |
      | Serenity BDD |
      | Cucumber BDD |