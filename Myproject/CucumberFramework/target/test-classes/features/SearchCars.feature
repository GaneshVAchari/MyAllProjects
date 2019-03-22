@Search-Cars
Feature: Acceptance testing to validate search cars options
  In order to validate that 
  the search car page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the home page "https://www.carsguide.com.au" of cars website
    When I move to Menu
      | Menu     |
      | buy + sell |
      | reviews  |
    And click on "Search Cars" link
    And select car brand as "BMW" from Anymake
    And select car model as "1 SERIES" from Cars model
    And select "Australia" from Select Location dropdown
    And select "$1,000" from Price dropdown
    And click on Find My Next Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for sale | carsguide"
