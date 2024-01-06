package stepdefinitions.us_24;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertFalse;

public class US_24_DBStepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("User Set connection")
    public void userSetConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("User creates statement")
    public void userCreatesStatement() throws SQLException {
        statement = connection.createStatement();
    }

    @When("User execute query for created teacher")
    public void userExecuteQueryForCreatedTeacher() throws SQLException {
        resultSet = statement.executeQuery("select * from teacher where name = 'nalan'");
    }

    @Then("validates result set")
    public void validatesResultSet() throws SQLException {
        resultSet.next();
        assertFalse(resultSet.toString().isEmpty());
    }

    @And("User terminate connection")
    public void userTerminateConnection() throws SQLException {
        statement.close();
        connection.close();
    }
}
