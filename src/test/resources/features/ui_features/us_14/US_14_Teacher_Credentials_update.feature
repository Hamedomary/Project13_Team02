@Smoke_Test011
Feature: Teacher_visibility_in_the_teacher_list
  Background:login_to_the_application
    Given User navigates to the homepage
    When Clicks on Login link
    And Enters the username and password into corresponding field
    And Clicks on Login button
    And Clicks on Menu button
    And Clicks on teacher management link

    @Test12
    Scenario: TC02_Successfully Updating teacher credentials
      And Clicks on edit button
      And Selects a lesson from (choose lessons) dropDown in Teacher Edit page
      And Enters a new name "Angelina" into the Name field
      And Enters a new surname "Joli" into the Surname field
      And Enters a new birth place "America" into the Birth place field
      And Enters a new Email address into the Email address field
      And Enters a new phone number into the phone number field
      And Enters a new Ssn number into the Ssn field
      And Clicks on is advisor Teacher checkbox in Teacher edit page
      And Selects Male as the gender in teacher edit page
      And Enters a new DOB "12121981" into the date of birth field

      And Enters a new User Name into the User Name field
      And Enters a new valid password "Nargis21130" into the password field
      And Clicks on submit button in teacher edit page
      And Verifies teacher updated successfully message is appeared
      And close the driver
