@CloseSession
Feature: Login in the system


  @CloseSession
  Scenario: TC - Login an user in the pre environment with administrator rol.
    # Precondition
    Given that Nacho wants to login in the system
    # Make that the test wants
    When he fills the login form with ADMINISTRATOR rol
    # Check the expected results
    Then the administrator menu is opened


  @CloseSession
  Scenario: TC - Login an user in the pre environment with vendor rol.
    # Precondition
    Given that Nacho wants to login in the system
    # Make that the test wants
    When he fills the login form with VENDOR rol
    # Check the expected results
    Then the vendor menu is opened


  @CloseSession
  Scenario: TC3 - Login an user in the pre environment with client rol.
    # Precondition
    Given that Nacho wants to login in the system
    # Make that the test wants
    When he fills the login form with CLIENT rol
    # Check the expected results
    Then the user menu is opened


