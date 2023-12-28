#@API
Feature: Admin should be able to add Dean


  Scenario: The admin user can add a dean
    Given the user enters new dean credentials as "admin"
    Then the admin user see the dean has been created

 Scenario: Birth place should accept only place names
    When the user enters new unvalid dean credentials as "admin"
    Then the admin user should not see the dean has been created