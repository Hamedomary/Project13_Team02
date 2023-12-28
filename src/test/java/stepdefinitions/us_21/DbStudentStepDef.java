package stepdefinitions.us_21;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DbStudentStepDef {

    public ResultSet resultSet;
    public ResultSetMetaData rsMetaData;

    @Given("the user check the student details with id {string}")
    public ResultSet theUserCheckTheStudent(String id) {
        resultSet = DBUtils.executeQueries("SELECT * FROM public.student where id = '" + id + "';");
        try {
            resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }


    @Then("the user should be able to see the student details")
    public void theUserShouldBeAbleToSeeTheStudentDetails() {
        String expectedName = "Jack";
        String expectedSurname = "Rich";
        try {
            assertEquals(expectedName, resultSet.getString("name"));
            assertEquals(expectedSurname, resultSet.getString("surname"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Then("the user should be able to see student table column names")
    public void theUserShouldBeAbleToSeeStudentColumnNames(List<String> columnNames) throws SQLException {
        String expectedIdColumn = columnNames.get(0);
        String expectedBirthDayColumn = columnNames.get(1);
        String expectedBirthPlaceColumn = columnNames.get(2);
        String expectedGenderColumn = columnNames.get(3);
        String expectedNameColumn = columnNames.get(4);
        String expectedSurnameColumn = columnNames.get(5);
        String expectedPasswordColumn = columnNames.get(6);
        String expectedPhoneNumberColumn = columnNames.get(7);
        String expectedSSNColumn = columnNames.get(8);
        String expectedUsernameColumn = columnNames.get(9);

        rsMetaData = resultSet.getMetaData();

        assertEquals(expectedIdColumn, rsMetaData.getColumnName(1));
        assertEquals(expectedBirthDayColumn, rsMetaData.getColumnName(2));
        assertEquals(expectedBirthPlaceColumn, rsMetaData.getColumnName(3));
        assertEquals(expectedGenderColumn, rsMetaData.getColumnName(4));
        assertEquals(expectedNameColumn, rsMetaData.getColumnName(5));
        assertEquals(expectedPasswordColumn, rsMetaData.getColumnName(6));
        assertEquals(expectedPhoneNumberColumn, rsMetaData.getColumnName(7));
        assertEquals(expectedSSNColumn, rsMetaData.getColumnName(8));
        assertEquals(expectedSurnameColumn, rsMetaData.getColumnName(9));
        assertEquals(expectedUsernameColumn, rsMetaData.getColumnName(10));
    }

    @When("the user check the lesson program details with id {string}")
    public ResultSet theUserCheckTheLessonProgramDetailsWithId(String id) {
        resultSet = DBUtils.executeQueries("SELECT * FROM public.lesson_program where id = '" + id + "';");
        String studentId = null;
        try {
            resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    @Then("the user should be able to see lesson program column names")
    public void theUserShouldBeAbleToSeeLessonProgramColumnNames(List<String> columnNames) throws SQLException {
        String expectedIdColumn = columnNames.get(0);
        String expectedDayColumn = columnNames.get(1);
        String expectedStartTimeColumn = columnNames.get(2);
        String expectedStopTimeColumn = columnNames.get(3);
        String expectedEducationTermColumn = columnNames.get(4);

        rsMetaData = resultSet.getMetaData();

        assertEquals(expectedIdColumn, rsMetaData.getColumnName(1));
        assertEquals(expectedDayColumn, rsMetaData.getColumnName(2));
        assertEquals(expectedStartTimeColumn, rsMetaData.getColumnName(3));
        assertEquals(expectedStopTimeColumn, rsMetaData.getColumnName(4));
        assertEquals(expectedEducationTermColumn, rsMetaData.getColumnName(5));
    }
}

