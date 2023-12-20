@Unit_Test
Feature: google_search_feature

Background: Login_to_the_Application
  Given User navigates to the homepage
  When Clicks on Login link
  And Enters the username and password into corresponding field
  And Clicks on Login button
  And Clicks on Menu button
  And Clicks on Lesson Management link
  And Clicks on Lesson program button

      @test1
      Scenario: TC01 Lesson Program Creation by Vice Dean
      And Selects a lesson from Choose Lessons dropDown
      And Selects an education term from education term dropdown
      And Selects a day from Choose day dropdown
      And Enters a start time in Start Time field
        And Enters a Stop time in the Stop Time field
      And Clicks on Submit button
      Then Verifies the (Lesson Created Program) message is appeared
        And close the driver

        @Test2
        Scenario: TC02 Unsuccessful lesson program creation
          And Selects an education term from education term dropdown
          And Selects a day from Choose day dropdown
          And Enters a start time in Start Time field
          And Enters a Stop time in the Stop Time field
          And Clicks on Submit button
          Then Verifies the (Lessons must not empty) alert message is appeared
          And close the driver

  @Test3
  Scenario: TC03 Unsuccessful lesson program creation
    And Selects a lesson from Choose Lessons dropDown
    And Selects an education term from education term dropdown
    And Enters a start time in Start Time field
    And Enters a Stop time in the Stop Time field
    And Clicks on Submit button
    Then Verifies the (You have entered an invalid value. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY) alert message is appeared
    And close the driver

  @test4
  Scenario: TC04 Unsuccessful lesson program creation
    And Selects a lesson from Choose Lessons dropDown
    And Selects an education term from education term dropdown
    And Selects a day from Choose day dropdown
    And Enters "1200"as start time in Start Time field
    And Enters "0100"a Stop time in the Stop Time field
    And Clicks on Submit button
    Then Verifies the (Error: start time must not be greater than or equal to stop time) message is appeared
    And close the driver

  @test5
  Scenario: TC05 Unsuccessful lesson program creation
    And Selects a lesson from Choose Lessons dropDown
    And Selects an education term from education term dropdown
    And Selects a day from Choose day dropdown
    Then Verifies (Required) text message is appeared under start time field
    And Verifies (Required) text message is appeared under stop time field
    And close the driver