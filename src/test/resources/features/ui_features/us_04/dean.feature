Feature:Admin should be able to add Dean

  Background:
    Given the user goes to managementonschools page
    And the user click on login
    And the user enter user name and password for "admin"

  Scenario: The admin user can add a dean
    Given the admin user goes to menu
    And the admin user clicks to "Dean Management"
    When the admin user enters new "valid" dean credentials
    And the admin user clicks submit button
    Then the new dean created successfully

  Scenario: Birth place should accept only place names
    Given the admin user goes to menu
    And the admin user clicks to "Dean Management"
    When the admin user enters new "unvalid" dean credentials
    And the admin user clicks submit button
    Then the new dean should not be created successfully