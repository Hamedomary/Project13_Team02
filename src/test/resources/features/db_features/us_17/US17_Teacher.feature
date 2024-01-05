Feature: Saving grades validation DB
  Scenario: User validates saved grades from DB
    Given user sets connection
    And user creates statement
    When user executes query for saved grades
    Then validates result set
    And user terminate connection