package stepdefinitions.us_04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.DBUtils;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DbDeanStepDefs {

    public ResultSet resultSet;
    DeanStepDefinitions deanStepDefinitions = new DeanStepDefinitions();


    @When("the user pass valid a new dean credantials")
    public ResultSet theUserPassValidANewDeanCredantials() {
//        String sqlQuery = "INSERT INTO public.dean (birth_day, birth_place, gender, name, password, phone_number, ssn, surname, username)" +
//                " VALUES ('" + formattedBirthday + "', '" + birthPlace + "', '" + gender + "', '" + name + "', '" +
//                password + "', '" + phoneNumber + "', '" + ssn + "', '" + surname + "', '" + username + "')";
        String sqlQuery = "Select * from public.dean where username = '" + deanStepDefinitions.username + "'";
        resultSet = DBUtils.executeQueries(sqlQuery);
        try {
            resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    @Then("the user should be able to see the new dean details")
    public void theUserShouldBeAbleToSeeTheNewDeanDetails() throws SQLException {
        assertNotNull(resultSet.getString("id"));

    }
}
