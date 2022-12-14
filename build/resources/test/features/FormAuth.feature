Feature: Form authentication

  Scenario: form authentication success
    Given that a web user wants to login
    When he fills all the requested fields with the correct credentials
    Then he should see the secure area page