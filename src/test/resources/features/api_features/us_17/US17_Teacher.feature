Feature: The lesson, student and semester should be saved by teacher
  Scenario: TC01_Teacher enters evaluation for selected terms and lesson
    Given user is authorized as "Teacher"
    And user sets Url for saving grades
    And sets the payload for saving grades
    When sends post request for saving grades and get response
    Then verify status code for saving grades is 200
    And verify response body of saving grades
