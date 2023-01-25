Feature: Google - Search Engine

  Background: Open Google search page
    Given user navigates to google

  @SearchFeature
  @TestID-1
  Scenario Outline: Perform Search
    Given the search page is opened and cookies banner is closed
    When the user fills in the search field with "<SEARCH_TEXT>" and clicks on the search button
    Examples:
      | SEARCH_TEXT  |
      | Serenity BDD |
      | Cucumber BDD |