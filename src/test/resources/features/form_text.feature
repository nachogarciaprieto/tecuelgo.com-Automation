Feature: Test the correct behavior of the demoqa forms

  Scenario: TC1 - Fill with text the demoqa form
    # Precondition
    Given that Carlos wants to fill the demoqa forms
    # Make that the test wants
    When he fill the demoqa form
      | fullName    | email           | currentAddress  | permanentAddress |
      | qa training | demoqa@test.com | calle falsa 123 | calle falsa 321  |
    # Check the expected results
    Then he should see the data in the page