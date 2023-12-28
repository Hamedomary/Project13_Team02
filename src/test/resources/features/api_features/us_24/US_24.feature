@US_24API
  Feature: Admin should be able to create a teacher
    Scenario: Create a teacher through API
      Given User is authorized as "Admin"
      When User send request to create a teacher
      Then verify status code is 200
      And verify teacher is created through API