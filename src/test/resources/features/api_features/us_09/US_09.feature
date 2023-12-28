@US_09API
  Feature: Vice Deans should be able to view the lesson list and make updates through API
    Scenario: Check visibility of Lesson Name,Compulsory and Credit Score
      Given User is authorized as "ViceDean"
      When User send request to get all lessons
      Then verify status code is 200
      And verify Lesson Name is visible
      And verify Compulsory is visible
      And verify Credit Score is visible

    Scenario: Make updates to lesson list
      Given User is authorized as "ViceDean"
      When User send request to update a lesson
      Then verify "Lesson Name" is changed



