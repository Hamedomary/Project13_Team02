#@API
Feature: Student choose lesson,grades and announcement

  Scenario: The student should see lessons programlist
    Given the user go to lessons program list as "student"
    Then the student should be able to see the details
      | stopTime  |
      | teachers  |
      | startTime |

  Scenario: The student should select desired lesson or lessons
    Given the user select lesson from student controller as "student"
    Then the student should be able to lesson details

  Scenario: The student should be able to see grades
    Given the user go to grades as "admin"
    Then the user should be able to see the grades

#  Scenario: The student should be able to see meetings
#    Given the user go to meetings as "student"
#    Then the user should be able to see the meetings details
