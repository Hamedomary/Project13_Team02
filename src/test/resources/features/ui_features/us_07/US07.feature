
Feature: search_delete_button_feature
  Background: navigate_to_managementonschools
    Given user navigates to "https://managementonschools.com/"
    And user click on login button on managementonschools
    And user enters username "DeanGul"
    And user enters password "DeanGul123"
    And user clicks on the login button
    And user click on menu button
    Then user click on contact get all
    Then user navigate the page

  @delete_button
  Scenario: TC01_verify_delete_button
    Then user verifies page contains "delete button'
    Then close the application

  @messages
  Scenario: TC02_deans_access_messages
    Then user verifies page title contains "name", "email","date",and "subject"
    Then close the application


@clickable_button
  Scenario: TC03_deans_delete_messages
  Then user verifies delete button is enable and clickable
  Then close the application




