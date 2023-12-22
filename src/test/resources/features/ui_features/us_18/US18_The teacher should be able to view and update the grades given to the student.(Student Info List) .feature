@smoke18
Feature: US18_The teacher should be able to view and update the grades given to the student.(Student Info List)




  Scenario: TC_01_User goes to table site
    Given user enter  'https://managementonschools.com/'
    And user clicks  Login button
    And user types username
    And user types password
    Then user clicks Log in button
    Then user choose lesson
    Then user choose student
    Then user choose educationTerm
    Then user types Absentee
    Then user types Midterm Exam
    Then user types Final Exam
    Then user types Info Note
    Then user clicks submit button
    Then assert name is visible
    Then assert lessonname is visible
    Then assert absentee is visible
    Then assert midterm exam is visible
    Then assert final exam is visible
    Then assert note is visible
    Then assert info note is visible
    Then assert average is visible

  Scenario: TC_02_User change the student grade info
    Then user click edit button
    Then user changes the midterm exam note
    Then user click submit edit page button
    Then assert edit success message is visible
    Then user clicks x button

  Scenario: TC_03_User delete the student grade info
    Then user clicks delete button
    Then assert the student is deleted
    Then user close the window
