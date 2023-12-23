@Smoke_Test011
Feature: Teacher_visibility_in_the_teacher_list
  Background:login_to_the_application
    Given User navigates to the homepage
    When Clicks on Login link
    And Enters the username and password into corresponding field
    And Clicks on Login button
    And Clicks on Menu button
    And Clicks on teacher management link

    @Test11
    Scenario: TC_01 Created teacher (Name, phone, Ssn and Username) visibility in the teacher list
      And Selects a lesson from (choose lessons) to create a teacher
    And Enters a name "Maximelium13" into the Name field
    And Enters a surname "Rey" into the Surname field
    And Enters a birth place "Spain" into the Birth place field
    And Enters an Email address into the Email address field
    And Enters a phone number into the phone number field
    And Clicks on is advisor Teacher checkbox
    And Selects Male as the gender
    And Enters a DOB "12121991" into the date of birth field
    And Enters a Ssn number into the Ssn field
    And Enters a User Name into the User Name field
    And Enters a valid password "Nargis211300" into the password field
    And Clicks on submit button
      And Verify teacher ( Name, phone number, Ssn and Username ) are visible in the teacher list
      And close the driver