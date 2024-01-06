
Feature: Lesson_Program_Creation
  Scenario: Vice_Dean_Creates_Lesson_Program
    Given user is authorised as vice Dean and the credentials are "ViceDeanHamed"_"Nargis211400"
    When user set Base url for vice Dean_Ho
    And sets the expected data for lesson program creation_Ho
    And Sends post request and gets response_HO
    Then verifies status code is 200
    And verifies the lesson program is created_HO