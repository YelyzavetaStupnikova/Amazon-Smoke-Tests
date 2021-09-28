Feature: Smoke
  As a user
  I want to test main site functionality
  So that I can be sure that website works correctly

  Scenario: Check that search results correspond search input
    Given User opens 'https://www.amazon.com/ref=nav_logo' page
    And User enters 'Computer' input
    And User clicks on the searchBar
    Then User sees 'Computer' corresponding results on the SearchPage

  Scenario: Change Location Delivery
    Given User opens 'https://www.amazon.com/ref=nav_logo' page
    And User clicks Deliver To button
    And Choose your location window pops up
    And User chooses country
    And User submits changes

  Scenario: User can't sign into the account automatically without Capcha
    Given User opens 'https://www.amazon.com/ref=nav_logo' page
    And User opens Sign into the account page
    And User enters valid 'stupnikova247349@gmail.com' email
    And User presses continue button
    And User enters 'secretPass' password
    And User presses sign in button
    And User opens 'https://www.amazon.com/ref=nav_logo' page
    And User is not signed in on the home page

  Scenario: Sign out
    Given User opens 'https://www.amazon.com/ref=nav_logo' page
    And User opens Sign into the account page
    And User enters valid 'stupnikova247349@gmail.com' email
    And User presses continue button
    And User enters 'secretPass' password
    And User presses sign in button
    And User clicks on the All options
    And user clicks sign out

    Scenario: Check main pages of the website's header
      Given User opens 'https://www.amazon.com/ref=nav_logo' page
      And User opens Today Deals Page
      And User opens Customer Service Page
      And User opens Registry page
      And User opens Gift Cards page
      And User opens Sell page

      Scenario: Create new Amazon account without Input
        Given User opens 'https://www.amazon.com/ref=nav_logo' page
        And User opens Sign into the account page
        And User presses Create new Amazon Account
        And User sees name error
        And User sees Mobile or Email Error
        And User sees password error

      Scenario: User checks if main elements on the Customer Page are visible
        Given User opens 'https://www.amazon.com/ref=nav_logo' page
        And user closes Pop Up
        And User opens Customer Service Page
        And user checks options
        And User checks searchBar is visible
        And User checks if Help Topics are visible

