@Used-Search-Cars
Feature: Acceptance testing to validate Used search cars options
  In order to validate that 
  the used search car page is working fine
  we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
    Given I am on the home page "https://www.carsguide.com.au" of cars website
    When I move to Menu
      | Menu     |
      | buy + sell |
      | reviews  |
    And click on "Used" link on Used Car Page
    And select car brand as "AUDI" from Anymake dropdown on Used Seach Car Page
    And select car model on Used Saech Car Page
    |Car model|
    |A4				|
    |A3				|
    And select "SA - All" from Select Location dropdown on Used Search Car Page
    And select "$2,000" from Price dropdown on Used Search Car Page
    And click on Find My Next Car button on Used Search Car Page
    Then I should see list of Used searched cars
    And the page title should be "Used Audi A4 Under 2000 for Sale SA | carsguide"
