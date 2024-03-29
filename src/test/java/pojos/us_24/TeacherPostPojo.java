package pojos.us_24;
import java.io.Serializable;
import java.util.Arrays;


public class TeacherPostPojo implements Serializable {
    private String birthDay;
    private String birthPlace;
    private String email;
    private String gender;
    private Boolean isAdvisorTeacher;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;
    private Integer[] lessonsIdList;


    public TeacherPostPojo() {
    }

    public TeacherPostPojo(String birthDay, String birthPlace, String email, String gender, Boolean isAdvisorTeacher, String name, String password, String phoneNumber, String ssn, String surname, String username, Integer[] lessonsIdList) {
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.email = email;
        this.gender = gender;
        this.isAdvisorTeacher = isAdvisorTeacher;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;
        this.lessonsIdList = lessonsIdList;

    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getAdvisorTeacher() {
        return isAdvisorTeacher;
    }

    public void setAdvisorTeacher(Boolean advisorTeacher) {
        isAdvisorTeacher = advisorTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer[] getLessonsIdList() {
        return lessonsIdList;
    }

    public void setLessonsIdList(Integer[] lessonsIdList) {
        this.lessonsIdList = lessonsIdList;
    }

    @Override
    public String toString() {
        return "TeacherPostPojo{" +
                "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", isAdvisorTeacher=" + isAdvisorTeacher +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", lessonsIdList=" + Arrays.toString(lessonsIdList) +
                '}';
    }
}
