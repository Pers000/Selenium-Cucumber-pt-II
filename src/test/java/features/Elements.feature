@elements
Feature: Check Elements

  Scenario: Verify Text Box element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Text Box"
    And I fill "Full Name" field with "Monster Thutty"
    #And I fill "Email" field with "sample@email.com" <-this needs improvement first
    And I fill "Current Address" field with "This is my current address."
    And I fill "Permanent Address" field with "This is my permanent address"

  #When I click the button "Submit" <-button is not clickable
  Scenario: Verify Check Box element functions
    Given I accessed the site
    And I click the tile "Elements"
    #And I click "Check Box"
    And I click the button "Collapse all"
    And I click the button "Expand all"
    And I tick "home" check box
    And I tick "documents" check box

  @pilottest
  Scenario: Verify Radio Button element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Radio Button"
    When I toggle "Yes"
		Then I should see "Yes" is selected
		When I toggle "Impressive"
		Then I should see "Impressive" is selected
		Then I should see toggle "yes" is disabled
		Then I should see toggle "no" is disabled
		
  Scenario: Verify Web Tables element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Web Tables"

  Scenario: Verify Buttons element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Buttons"

  Scenario: Verify Links element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Links"

  Scenario: Verify Broken Links - Images element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Broken Links - Images"

  Scenario: Verify Upload and Download element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Upload and Download"

  Scenario: Verify Dynamic Properties element functions
    Given I accessed the site
    And I click the tile "Elements"
    And I click "Dynamic Properties"
