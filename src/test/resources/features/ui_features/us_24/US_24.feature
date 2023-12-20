@US_24
Feature:Admin should be able to create a teacher.

  Scenario: TC_01 Successfully create a teacher
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    When enter name, cannot be left blank
    And enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify teacher is created

  Scenario: TC_02 Teacher should not be created without name
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_03 Teacher should not be created without surname
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_04 Teacher should not be created without birth place
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_05 Teacher should not be created without email
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_06 Teacher should not be created without phone
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_07 Teacher should not be created without gender
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_08 Teacher should not be created without date of birth
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_09 Teacher should not be created without SSN
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter user name , cannot be left blank
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_10 Teacher should not be created without user name
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter a valid SSN
    And enter a valid password
    And click submit button
    Then verify error message is displayed

  Scenario: TC_11 Teacher should not be created without password
    Given Login to the application as "admin"
    And click Menu
    And click Teacher Management
    And choose lessons
    And enter name, cannot be left blank
    When enter surname,cannot be left blank
    And enter birth place,cannot be left blank
    And enter email, cannot be left blank
    And enter phone,cannot be left blank
    And Select gender ,cannot be left blank
    And enter date of birth, cannot be left blank
    And enter user name , cannot be left blank
    And enter a valid SSN
    And enter user name , cannot be left blank
    And click submit button
    Then verify error message is displayed