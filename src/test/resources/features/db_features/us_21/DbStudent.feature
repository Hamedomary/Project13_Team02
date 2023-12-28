#@API
  Feature: The user should be able to reach student details

    Scenario: The user should be able to see student details
      When the user check the student details with id "2687"
      Then the user should be able to see the student details

    Scenario: The user get student table column names
      When the user check the student details with id "2687"
      Then the user should be able to see student table column names
        | id           |
        | birth_day    |
        | birth_place  |
        | gender       |
        | name         |
        | surname      |
        | password     |
        | phone_number |
        | ssn          |
        | username     |

    Scenario: The user get lesson program table column names
      When the user check the lesson program details with id "2337"
      Then the user should be able to see lesson program column names
        | id                |
        | day               |
        | start_time        |
        | stop_time         |
        | education_term_id |