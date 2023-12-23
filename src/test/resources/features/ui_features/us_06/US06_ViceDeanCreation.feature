@rabia
Feature: US06 Dean creates Vice Dean account

  Background:
    Given user enter  "https://managementonschools.com/"
    And user click  Login button
    Then user types username
    Then user types password
    Then user clicks loginnn button

  Scenario: TC_01_Dean types all the infos
    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then click on gender radio button
    Then enter valid prospective vicedean date of birth
    Then enter valid prospective vicedean ssn
    Then enter valid prospective vicedean username
    Then enter valid prospective vicedean password
    Then click register button
    And assert the new vicedean is registered
    Then close driver

  Scenario: TC_02_User leaves all the infos blank
    When click register button
    And assert the new vicedean is not registered
    Then close driver

  Scenario: TC_03_User leaves gender info blank
    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then enter valid prospective vicedean date of birth
    Then enter valid prospective vicedean ssn
    Then enter valid prospective vicedean username
    Then enter valid prospective vicedean password
    Then click register button
    And assert the new vicedean is not registered
    Then close driver

  Scenario: TC_04_User doesn't type '-' in ssn info
    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then click on gender radio button
    Then enter valid prospective vicedean date of birth
    Then enter invalid prospective without - vicedean ssn
    Then enter valid prospective vicedean username
    Then enter valid prospective vicedean password
    Then click register button
    And assert the new vicedean is not registered
    Then close driver

  Scenario: TC_05_User doesn't type number in password

    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then click on gender radio button
    Then enter valid prospective vicedean date of birth
    Then enter valid prospective vicedean ssn
    Then enter valid prospective vicedean username
    Then enter invalid prospective without number vicedean password
    Then click register button
    And assert the new vicedean is not registered
    Then close driver

  Scenario: TC_06_User doesn't type uppercase in password
    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then click on gender radio button
    Then enter valid prospective vicedean date of birth
    Then enter valid prospective vicedean ssn
    Then enter valid prospective vicedean username
    Then enter invalid prospective without uppercase vicedean password
    Then click register button
    And assert the new vicedean is not registered
    Then close driver

  Scenario: TC_07_User doesn't type lowercase in password
    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then click on gender radio button
    Then enter valid prospective vicedean date of birth
    Then enter valid prospective vicedean ssn
    Then enter valid prospective vicedean username
    Then enter invalid prospective without lowercase vicedean password
    Then click register button
    And assert the new vicedean is not registered
    Then close driver

  Scenario: TC_08_User doesn't type 8 character password

    Then enter valid prospective vicedean name
    Then enter valid prospective vicedean surname
    Then enter valid prospective vicedean birth place
    Then enter valid prospective vicedean phone number
    Then click on gender radio button
    Then enter valid prospective vicedean date of birth
    Then enter valid prospective vicedean ssn
    Then enter valid prospective vicedean username
    Then enter invalid prospective less than eight digit vicedean password
    Then click register button
    And assert the new vicedean is not registered
    Then close driver