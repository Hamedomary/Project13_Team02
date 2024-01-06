@US_24_DB
  Feature: Admin should be able to create a teacher DB
    Scenario: User Validates Created Teacher From DB
      Given User Set connection
      And User creates statement
      When User execute query for created teacher
      Then validates result set
      And User terminate connection