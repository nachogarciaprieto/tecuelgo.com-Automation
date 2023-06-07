Feature: Test the correct behavior of the demoqa forms

  Scenario: TC2 - Select some check box
    # Precondition
    Given that Carlos wants to select some check box
    # Make that the test wants
    When he click on some check box
    # Check the expected results
    Then he should see the names of the check box in the page