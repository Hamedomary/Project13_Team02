package stepdefinitions.us_17;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;

import static stepdefinitions.us_17.US17_API_TeacherStepDefinitions.payload;


public class US17_DB_TeacherStepDefinitions {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("user sets connection")
    public void userSetsConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user", "43w5ijfso");
    }

    @And("user creates statement")
    public void userCreatesStatement() throws SQLException {
        statement = connection.createStatement();
    }

    @When("user executes query for saved grades")
    public void userExecutesQueryForSavedGrades() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM public.student_info");
    }

    @Then("validates result set")
    public void validatesResultSet() throws SQLException {

        resultSet.next();

        Assert.assertEquals(payload.getAbsentee(), resultSet.getInt("absentee"));
        Assert.assertEquals(payload.getFinalExam(), resultSet.getInt("final_exam"));
        Assert.assertEquals(payload.getEducationTermId(), resultSet.getInt("education_term_id"));
        Assert.assertEquals(payload.getInfoNote(), resultSet.getString("info_note"));
        Assert.assertEquals(payload.getMidtermExam(), resultSet.getInt("midterm_exam"));
        Assert.assertEquals(payload.getStudentId(), resultSet.getInt("student_id"));
        Assert.assertEquals(payload.getLessonId(), resultSet.getInt("lesson_lesson_id"));
    }

    @And("user terminate connection")
    public void userTerminateConnection() throws SQLException {
        statement.close();
        connection.close();
    }
}
