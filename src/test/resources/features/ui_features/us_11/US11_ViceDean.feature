Feature: vice deans should be able to create a lesson schedule
  Background:
    Given go to the webpage
    And click on login link
    And enter user name
    And enter password
    And click on login button
    And click on menu
    And click on lesson management
    And click on lesson program

  Scenario:Vice Dean views the Lesson Day Start Time and Stop Time created
    Given user is on the lesson program page
    Then Verify the created Lesson Day Start Time and Stop Time are visible

  @update
  Scenario:Vice Dean updates the lesson
    Given Verify the Lesson Program List is visible
    Then click an update button from the list
    And an update form must be displayed
    Then Verify the selected item is updated from the Lesson Program List

  @delete
  Scenario:Vice Dean deletes the lesson
    Given Verify the Lesson Program List is visible
    Then click an delete button from the list
    Then Verify the selected item is removed from the Lesson Program List

