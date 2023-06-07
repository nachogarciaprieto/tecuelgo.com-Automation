Feature: Test the correct behavior of the demoqa forms

  Scenario: TC1 - Register an user in the demoqa web
    # Precondition
    Given that Nacho wants to fill the demoqa register forms
    # Make that the test wants
    When he fill the demoqa register form
      | firstName    | lastName        | userName        | password    |
      | nacho       | garcia          | nachoGarcia     | 1234Ab/*    |
    # Check the expected results
    Then he should see the confirmation pop up
    """
    User Register Successfully.
    """

