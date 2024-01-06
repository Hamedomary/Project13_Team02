package pojos.us_17;

import java.io.Serializable;

public class ObjectDTO implements Serializable {
	private int absentee;
	private int average;
	private boolean compulsory;
	private int creditScore;
	private int educationTermId;
	private int finalExam;
	private int id;
	private String infoNote;
	private int lessonId;
	private String lessonName;
	private int midtermExam;
	private String note;
	private StudentResponseDTO studentResponse;

	public void setAbsentee(int absentee){
		this.absentee = absentee;
	}

	public int getAbsentee(){
		return absentee;
	}

	public void setAverage(int average){
		this.average = average;
	}

	public int getAverage(){
		return average;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
	}

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setEducationTermId(int educationTermId){
		this.educationTermId = educationTermId;
	}

	public int getEducationTermId(){
		return educationTermId;
	}

	public void setFinalExam(int finalExam){
		this.finalExam = finalExam;
	}

	public int getFinalExam(){
		return finalExam;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setInfoNote(String infoNote){
		this.infoNote = infoNote;
	}

	public String getInfoNote(){
		return infoNote;
	}

	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	public void setMidtermExam(int midtermExam){
		this.midtermExam = midtermExam;
	}

	public int getMidtermExam(){
		return midtermExam;
	}

	public void setNote(String note){
		this.note = note;
	}

	public String getNote(){
		return note;
	}

	public void setStudentResponse(StudentResponseDTO studentResponse){
		this.studentResponse = studentResponse;
	}

	public StudentResponseDTO getStudentResponse(){
		return studentResponse;
	}

	@Override
 	public String toString(){
		return 
			"ObjectDTO{" + 
			"absentee = '" + absentee + '\'' + 
			",average = '" + average + '\'' + 
			",compulsory = '" + compulsory + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",finalExam = '" + finalExam + '\'' + 
			",id = '" + id + '\'' + 
			",infoNote = '" + infoNote + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",midtermExam = '" + midtermExam + '\'' + 
			",note = '" + note + '\'' + 
			",studentResponse = '" + studentResponse + '\'' + 
			"}";
		}
}