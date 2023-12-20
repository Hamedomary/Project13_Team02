@US_09
Feature: Vice Deans should be able to view the lesson list and make updates
  Scenario: TC_01 Lesson Name,Compulsory and Credit Score should be visible
    Given Login to the application
    Then click Lessons
    Then verify created Lesson Name, Compulsory and Credit Score visible
    When click delete button
    Then verify lesson has been deleted

  Scenario: TC_02
    Given Login to the application
    When click Lessons
    Then should be able to update the lesson information
