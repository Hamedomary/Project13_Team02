package pojos.us_11;

import java.util.List;
import java.io.Serializable;

public class StudentsDTO implements Serializable {
	private boolean active;
	private String birthDay;
	private String birthPlace;
	private String email;
	private String fatherName;
	private String gender;
	private List<LessonProgramSetDTO> lessonProgramSet;
	private String motherName;
	private String name;
	private String phoneNumber;
	private String ssn;
	private int studentNumber;
	private String surname;
	private int userId;
	private String username;

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}

	public String getFatherName(){
		return fatherName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setLessonProgramSet(List<LessonProgramSetDTO> lessonProgramSet){
		this.lessonProgramSet = lessonProgramSet;
	}

	public List<LessonProgramSetDTO> getLessonProgramSet(){
		return lessonProgramSet;
	}

	public void setMotherName(String motherName){
		this.motherName = motherName;
	}

	public String getMotherName(){
		return motherName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setStudentNumber(int studentNumber){
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber(){
		return studentNumber;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"StudentsDTO{" + 
			"active = '" + active + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",email = '" + email + '\'' + 
			",fatherName = '" + fatherName + '\'' + 
			",gender = '" + gender + '\'' + 
			",lessonProgramSet = '" + lessonProgramSet + '\'' + 
			",motherName = '" + motherName + '\'' + 
			",name = '" + name + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",studentNumber = '" + studentNumber + '\'' + 
			",surname = '" + surname + '\'' + 
			",userId = '" + userId + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}