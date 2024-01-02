@US_09API
  Feature: Vice Deans should be able to view the lesson list and make updates through API
    Scenario: Check visibility of Lesson Name,Compulsory and Credit Score
      Given User authorised with the credentials "Sabiha ViceDean"_"Mahraba123"SC
      When User send request to create a lessonSC
      When validate the status code should be 200
      Then validate that response data is the same with created lesson credentialsSC




