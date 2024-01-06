@alanur
Feature: Lesson_Program_Creation
  Scenario: Vice_Dean_Creates_Lesson_Program
    Given user is authorised with "ViceDeanALANUR" and "a1234567S"
    When user save 1847 lesson program for MONDAY 16:00 16:30 17
    Then lesson should be in unassigned program list for MONDAY 16:00:00 16:30:00
    And user assign lesson to teacher 1695
    Then lesson should not be in unassigned program list
    Then delete lesson program

