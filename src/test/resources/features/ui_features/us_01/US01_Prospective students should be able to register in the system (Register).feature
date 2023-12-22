@smoke
Feature: US01 prospective students should be able to register in the system (Register)

  Background:
    Given user enter  "https://managementonschools.com/"
    And user click  Register button
  Scenario: TC_01_User send messages from the contact page
    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then click on gender radio button
    Then enter valid prospective student date of birth
    Then enter valid prospective student ssn
    Then enter valid prospective student username
    Then enter valid prospective student password
    Then click register button
    And assert the new user is registered

  Scenario: TC_02_User leaves all the infos blank
    When click register button
    And assert the new user is not registered

  Scenario: TC_03_User leaves gender info blank
    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then enter valid prospective student date of birth
    Then enter valid prospective student ssn
    Then enter valid prospective student username
    Then enter valid prospective student password
    Then click register button
    And assert the new user is not registered

  Scenario: TC_04_User doesn't type '-' in ssn info
    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then click on gender radio button
    Then enter valid prospective student date of birth
    Then enter invalid prospective without - student ssn
    Then enter valid prospective student username
    Then enter valid prospective student password
    Then click register button
    And assert the new user is not registered
  Scenario: TC_05_User doesn't type number in password

    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then click on gender radio button
    Then enter valid prospective student date of birth
    Then enter valid prospective student ssn
    Then enter valid prospective student username
    Then enter invalid prospective without number student password
    Then click register button
    And assert the new user is not registered
  Scenario: TC_06_User doesn't type uppercase in password
    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then click on gender radio button
    Then enter valid prospective student date of birth
    Then enter valid prospective student ssn
    Then enter valid prospective student username
    Then enter invalid prospective without uppercase student password
    Then click register button
    And assert the new user is not registered
  Scenario: TC_07_User doesn't type lowercase in password
    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then click on gender radio button
    Then enter valid prospective student date of birth
    Then enter valid prospective student ssn
    Then enter valid prospective student username
    Then enter invalid prospective without lowercase student password
    Then click register button
    And assert the new user is not registered
  Scenario: TC_08_User doesn't type 8 character password

    Then enter valid prospective student name
    Then enter valid prospective student surname
    Then enter valid prospective student birth place
    Then enter valid prospective student phone number
    Then click on gender radio button
    Then enter valid prospective student date of birth
    Then enter valid prospective student ssn
    Then enter valid prospective student username
    Then enter invalid prospective less than eight digit student password
    Then click register button
    And assert the new user is not registered