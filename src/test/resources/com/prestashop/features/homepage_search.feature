@login
Feature: home page search functionality
  # each scenario is independent
  # its case sensitive.
  # we use only Feature and Scenario keyword
  # if we put a tag on top of the scenario that scenario will run only.
  #@search @smoke
  Scenario: Verify search term
    Given the user is on the home page
    When the user enters a search term
    Then the search box should contain the search term

  #wright click on any word then choose "find step" it will take you to that method
  Scenario: verify home page title
    Given the user is on the home page
    When the user gets the title of the page
    Then title should be Search - My Store
