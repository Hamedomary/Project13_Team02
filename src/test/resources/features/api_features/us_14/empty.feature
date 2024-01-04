@API12
  Feature:Teacher_Creation_Test
    Background:Common_Steps
      Given user is authorised as vice Dean Hamed and the credentials are "ViceDeanHamed"_"Nargis211400"

    Scenario: Vice_Dean_Creates_a_teacher
      And user sets the base url for teacher creation_HO
      And user sets the expected data_HO
      And user sends post request and get response_HO
      And verifies status code is 200_HO

      Scenario: Vice_Dean_Can_see_Created_teacher_Info
        And user gets all teacher id using teacher username_HO "NargisSadaat"
        And user sets base url to get the created teacher by id_HO
        And user sets expected data using teacher id_HO
        And user sends get request and gets response_HO
        And verifies the response body_HO0

  Scenario: Vice_Dean_Updates_Teacher_Info
    And user sets base url to update teacher info_HO
    And user sets the expected data to update teacher info_HO
    And user sends put request and gets response_HO
    And verifies statusCode is "200"_for put request

    Scenario: Vice_Dean_Can_see_Updated_Teacher_Info_HO
      And user gets all teacher id using teacher username_HO "OmariHamed01"
      And user sets base url to get the created teacher by id_HO
      And user sets expected data by using teacher id_HO
      And user sends get request and gets response_HO
      And verifies status code is "200"_ for get request_HO
      And verifies the get response body_HO0

     Scenario: Vice_Dean_Deletes_Created_Teacher
      And user gets all teacher id using teacher username_HO "OmariHamed01"
      And user sets base url to get the created teacher by id_HO
       When user sets base url to delete created teacher_HO
       And user sends delete request and get response_HO
       Then Verifies the status code is 200 for the delete request_HO

