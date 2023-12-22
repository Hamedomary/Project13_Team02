@smoke_test_us03
Feature: contact_feature
  Background: navigate_to_managementschools
    Given user navigates to "https://managementonschools.com/"
    Given user click on Contact button on managementschools


  @contact_button
  Scenario: TC01_name_field
    And user enters the name in the name field(cannot be left blank) "Elif"
    And user click on "Send text message" button
    Then user verifies there is no *Required text message on the bottom of the field
    Then close the application

  Scenario: TC02_name_field_blank
    And user leaves blank the name field
    And user click on "Send text message" button for tc2
    Then user verifies there is *Required text message on the bottom of the name field
    Then close the application

  Scenario: TC03_email_field
    And user provides email address respecting the "@" and "." where necessary "elifranamert@gmail.com"
    And user click on "Send text message" button for tc3
    Then user verifies there is no *Required text message on the bottom of the email field
    Then close the application

  Scenario: TC04_email_field_wrong_credentials_1
    And user enters name containing any item "Elif" for wrong credentials
    And user provides email address NOT respecting the "@" and "." where necessary "elifranamertgmailcom" for tc4
    And user enters subject about the text message "Selenium" for tc4
    And user enters the text message "Hello Sir! Can you help me about Selenium?" for tc4
    And user click on "Send text message" button for tc4
    Then user verifies there is "Please enter valid email" sign on the top of the page for tc4
    Then close the application

  Scenario: TC05_email_field_wrong_credentials_2
    And user enters name containing any item "Elif" for tc5
    And user provides email address NOT respecting the "@" and "." where necessary "elifranamert@gmailcom" for tc5
    And user enters subject about the text message "Selenium" for tc5
    And user enters the text message "Hello Sir! Can you help me about Selenium?" for tc5
    And user click on "Send text message" button for tc5
    Then user verifies there is "Please enter valid email" sign on the top of the page for tc5
    Then close the application

  Scenario: TC06_subject_field
    And user enters subject about the text message "Selenium" for tc6
    And user click on "Send text message" button for tc6
    Then user verifies there is no *Required text message on the bottom of the field for tc6
    Then close the application

  Scenario: TC07_text_message_field
    And user enters the text message "Hello Sir! Can you help me about Selenium?" for tc7
    And user click on "Send text message" button for tc7
    Then user verifies there is no *Required text message on the bottom of the field for tc7
    Then close the application

  Scenario: TC08_text_message_field_blank
    And user leaves blank the text message field for tc8
    And user click on "Send text message" button for tc8
    Then user verifies there is *Required text message on the bottom of the field for tc8
    Then close the application

  Scenario: TC09_send_message
    And user enters name containing any item "Elif"
    And user provides email address respecting the "@" and "." where necessary "elifranamert@gmail.com"
    And user enters subject about the text message "Selenium"
    And user enters the text message "Hello Sir! Can you help me about Selenium?"
    And user click on "Send text message" button
    Then user verifies "Contact text message Created Successfully" sign is visible in the top of the page
    Then close the application

