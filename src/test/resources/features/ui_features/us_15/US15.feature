@unite_15_test
Feature: search_feature
  Background: navigate_to_managementonschools
    Given user navigates to "https://managementonschools.com/"
    And user clicks on login button
    And user enters vice username "ViceDeanGul"
    And user enters vice password "Vicedeangul1"
    Then user clicks on login button
    Then user click on menu button
    Then user click on student management button


  @advisor
  Scenario: TC01_verify_advisory_teacher_selected
    And user select advisor teacher button
    Then user verifies to select advisor teacher "Angila Davis"
    Then close the driver

  @student_name
  Scenario: TC02_name_must_be_entered_can't_be_leave_blank
    And user enters student name "Sun"
    Then user verifies that a warning as "required" when you left blank student name box
    Then user verifies to name can be entered
    Then close the driver

@surname
  Scenario: TC03_surname_must_be_entered_can't_be_leave_blank
    And user enters student surname "Shine"
    Then user verifies to surname can be entered
    Then user verifies that a warning as "required" when you left blank student surname box
    Then close the driver

  @birthplace
  Scenario: TC04_birth_place_must_be_entered_can't_be_leave_blank
    And user enters birth place "NewYork"
    And user verifies birth place
    Then user verifies that a warning as "required" when you left blank birthplace box
    Then close the driver

@email
  Scenario: TC05_email_must_be_entered_can't_be_leave_blank
  And user enters email "ozoktemgul@gmail.com"
    Then user verifies to email can be entered
    Then user verifies that a warning as "required" when you left blank email address box
    Then close the driver

  @phone_number
  Scenario: TC06_phone_number_must_be_entered_can't_be_leave_blank
    And user enters phone number "765-345-9876"
    Then user verifies to phone number can be entered
    Then user verifies that a warning as "required" when you left blank phone number box
    Then close the driver

    @gender
  Scenario: TC07_gender_must_be_selected_can't_be_leave_blank
      And user selects gender "Female"
    Then user verifies to gender is selected
    Then user verifies that a warning as "required" when you left blank gender box
    Then close the driver

 @birthdate
  Scenario: TC08_birth_date_must_be_entered_can't_be_leave_blank
   And user enters birth date "12 Apr 2010'
    Then user verifies to birth date is selected
    Then user verifies that a warning as "required" when you left blank birthdate box
    Then close the driver

@SSN
  Scenario: TC09_SSN_number_must_be_entered_can't_be_leave_blank
  And user enters SSN number "876-12-4567"
    Then user verifies to SSN number is entered
    Then user verifies that a warning as "required" when you left blank SSN box
    Then close the driver

  @username
  Scenario: TC10_username_must_be_entered_can't_be_leave_blank
    And user enters username "Sunshine"
    Then user verifies to username is entered
    Then user verifies that a warning as "required" when you left blank username box
    Then close the driver

    @father_name
  Scenario: TC11_father_name_must_be_entered_can't_be_leave_blank
      And user enters father name "Jack"
    Then user verifies to father name is entered
    Then user verifies that a warning as "required" when you left blank father name box
    Then close the driver

@mother_name
  Scenario: TC12_mother_name_must_be_entered_can't_be_leave_blank
    And user enters mother name "Elsie"
    Then user verifies to mother name is entered
    Then user verifies that a warning as "required" when you left blank mother name box
    Then close the driver

  @password
  Scenario: TC13_password_must_be_entered_must_consist_of_at_least_8_characters
    And user enters password "Abcd1234"
    Then verifies password is entered
    Then user verifies to password is consist of at least 8 characters
    Then user verifies that gives a warning as "At least 8 character" when user enters less than 8 characters
    Then close the driver

    @password_requirement
  Scenario: TC14_password_must_contain_uppercase_letters_lowercase_letters_a number.
      And user enters password "Abcd1234"
    Then user verifies password is entered
    Then user verifies to password  include at least one uppercase character
    Then user verifies that gives a warning as "At least 8 character" when user enters less than 8 characters
    Then user verifies when password doesn't include at least one uppercase, gives a warning as " One uppercase character"
    Then user  verifies that password include at least one lowercase character
    Then user verifies password doesn't include at least one lowercase, gives a warn as " One lowercase character"
    Then user verifies that password is include at least one number
    Then verifies when password doesn't include at least one number, gives a warning as "One number"
    Then user verifies the password contains uppercase letters, lowercase letters, and a number
    Then close the driver

@student_register
  Scenario: TC15_student_number_should_automatically_appear
  And user selects advisor teacher "Todd Green"
    And user enters student name "Haydi"
    And user enters student surname "Jackson"
    And user enters birth place "America"
    And user enters email address "haydi@gmail.com"
    And user enters phone number "123-232-2321"
    And user selects gender "Female'
    And user enters birth date "3 Feb 2008"
    And user enters SSN number "234-34-5643"
    And user enters username "Hayson"
    And user enters father name "Jack'
    And user enters mother name "Ashley'
    And user enters password "Haydi123"
    And user clicks on submit button
    Then user verifies that student is added
    Then user verifies that student number is appear on the student list
    Then close the driver











































