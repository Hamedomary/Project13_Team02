Feature: Students, choose lesson, grades and announcement

  Background:
    Given the user goes to managementonschools page
    And the user click on login
    And the user enter user name and password for "student"

  Scenario: The student should be able to see the Teacher, Day, Start Time and Stop Time information in the Choose Lesson list
    Then the student should see lesson management details
      | Lesson     |
      | Teacher    |
      | Day        |
      | Start Time |
      | Stop Time  |

  Scenario: The student should be able to select the desired lesson or lessons.
    When the student should be able to choose lesson
    Then the student should be able to see choosen lesson in the list

  Scenario: The student should not be able to select lessons that coincide with the same day and time.
    When the student try to choose the lessons with same day and time
    Then the student should not be choose the lessons

  Scenario: The student should be able to see their exam grades.
    When the student goes to menu
    And the student click grades and announcements
    Then the student should be able to see the grades


