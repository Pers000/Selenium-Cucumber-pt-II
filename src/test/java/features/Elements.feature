@elements
Feature: Check Elements

  Scenario: Verify Text Box element functions
    Given I accessed the site
    And I click the tile "Elements"
    When I click "Text Box"
    And I fill "Full Name" field with "Monster Thutty"
    And I fill "Email" field with "sample@email.com"
    And I fill "Current Address" field with "This is my current address."
    And I fill "Permanent Address" field with "This is my permanent address"
