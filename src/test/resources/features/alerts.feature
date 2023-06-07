Feature: Test the correct behavior of the demoqa forms

#  Scenario: TC1 - Check that the alert is displayed.
#    # Precondition
#    Given that Nacho wants to check that the alert is displayed
#    # Make that the test wants
#    When he click on the alert button
#    # Check the expected results
#    Then he should see the text You selected Ok in the page

  Scenario: TC2 - Check that the alert is displayed and it is possible to write a text.
    # Precondition
    Given that Nacho wants to check that the alert is displayed
    # Make that the test wants
    When he click on the alert button and write a text
      | sampleText    |
      | nacho   |
    # Check the expected results
    Then he should see the text is the same as the introduced