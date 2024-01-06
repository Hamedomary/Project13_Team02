
Feature: teacher should be able to give grades to the students

  @tc_01
  Scenario: the lesson student and semester should be selectable
    Given go to the webpage
    And click on login link
    And enter user name for us17
    And enter password for us17
    And click on login button
    And click on menu
    And click on student info management
    And verify add student info is visible
    And add student info is visible
    Then verify choose lesson is selectable
    And verify choose student is selectable
    And verify choose education term is selectable

  @tc_02
  Scenario: absences should be able to be entered
    Given add student info is visible
    Then Verify Absentee input is visible
    And Enter absences to Absentee

  @tc_03
  Scenario: midterm and final exam grades should be able to be entered
    Given add student is vsisible
    Then enter a midterm exam grade
    And verify midterm exam grade should be able to be entered
    When enter a Final Exam grade
    Then verify Final exam grade should be able to be entered

  @tc_04
  Scenario: info note about the student should be able to be entered
    Given add student info is visible
    Then click on info note
    And enter info about the student
    Then click on submit button
