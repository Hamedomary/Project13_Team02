@US_24API
  Feature: Admin should be able to create a teacher
    Scenario: Create a teacher through API
      Given User authorised with the credentials "SabihaAdmin"_"Mahraba123"SC
      When User send request to create a teacher
      Then validate the status code should be 200
      And verify teacher is created through APISC