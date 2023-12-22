@US_12
Feature: lesson_feature

  Background: Login_to_the_Application for us12
    Given User navigates to the homepage for us12
    When Clicks on Login link for us12
    And Enters the username and password for us12
    And Clicks on Login button for us12
    And Clicks on Lesson program button for us12

  @US12_TC1
 Scenario: TC01 Choose lesson display
   And Select Music lesson from the lessons dropDown
   And close the driver for us12

  @US12_TC2
  Scenario: TC02 Course Schedule Creation
    And Select sql lesson from the lessons dropDown
    And Selects 15 from the education term dropdown
    And Selects FRIDAY from the day dropdown
    And Enters 1100 time in the start time field
    And Enters 1200 time in the stop time field
    And Clicks on Submit button for US12
    Then Verify the message is appeared for add lesson program
    And close the driver for us12

  @US12_TC3
  Scenario: TC03 Lesson Program Assignment
    And Select sql lesson from the lessons dropDown
    And Selects 15 from the education term dropdown
    And Selects FRIDAY from the day dropdown
    And Enters 1100 time in the start time field
    And Enters 1200 time in the stop time field
    And Clicks on Submit button for US12
    Then Verify the message is appeared for add lesson program
    Then Verify the record shown in the Lesson Program Assignment sql FRIDAY 11:00:00 12:00:00
    And close the driver for us12

  @US12_TC4
  Scenario: TC04 Teacher Selection for Lesson
    And Selects the last record in the lesson table
    Then Selects 5 index from teacher dropdown
    Then Clicks teacher submit button
    Then Verify the message is appeared for teacher added to lesson
    And close the driver for us12

  @US12_TC5
  Scenario: TC05 Verify Teacher Assignment without choosing lesson
    Then Selects 5 index from teacher dropdown
    Then Clicks teacher submit button
    Then Verify the error message is appeared for teacher added to lesson
    And close the driver for us12



