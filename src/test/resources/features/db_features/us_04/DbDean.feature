#@API
  Feature: The user should be able to add a new dean

    Scenario: The user should be able to add a new dean
      Given the user goes to managementonschools page
      And the user click on login
      And the user enter user name and password for "admin"
      Given the admin user goes to menu
      And the admin user clicks to "Dean Management"
      When the admin user enters new "valid" dean credentials
      And the admin user clicks submit button
      When the user pass valid a new dean credantials
      Then the user should be able to see the new dean details