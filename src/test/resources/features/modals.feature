Feature: Test the correct behavior of the demoqa forms

  Scenario: TC1 - Check that the alert is displayed.
    # Precondition
    Given that Nacho wants to open a modal window
    # Make that the test wants
    When he click on the modal window
    # Check the expected results
    Then he should see the text in the modal is displayed
    When he click on the close modal button
    Then the modal window is closed

