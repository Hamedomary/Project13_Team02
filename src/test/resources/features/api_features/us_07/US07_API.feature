
@US07

Feature: Deans should be able to see the messages sent by users
  Background: navigate_to_managementonschools
    Given user login as dean with credentials username "DeanGul", password "DeanGul123"_GO

  Scenario: dean create contact message_GO
    Given user sets th url for dean_GO
    And user sets the expected data_GO
    And user creates contact message with post request_GO
    Then the response should include fields with get request for "name", "email", "date", and "subject"_GO


  Scenario: dean access all messages_GO
    Given dean gets messages with getAll request_GO
    And verifies all messages_GO
    Then verifies status code is 200_GO










