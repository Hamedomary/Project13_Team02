Feature: vice deans should be able to create a lesson schedule
  Scenario: TC01_Vice Dean views the Lesson Day Start Time and Stop Time created
    Given user is authorized as "US_11_username" "US_11_password"
    And user sets Url for lesson program create
    And sets the payload for creating lesson program
    When sends post request and get response
    Then verify status code is 200
    And verify response body
