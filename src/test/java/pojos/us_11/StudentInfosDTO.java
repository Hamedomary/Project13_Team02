package pojos.us_11;

import java.io.Serializable;

public class StudentInfosDTO implements Serializable {
	private int absentee;
	private EducationTermDTO educationTerm;
	private int examAverage;
	private int finalExam;
	private int id;
	private String infoNote;
	private LessonDTO lesson;
	private String letterGrade;
	private int midtermExam;
	private StudentDTO student;

	public void setAbsentee(int absentee){
		this.absentee = absentee;
	}

	public int getAbsentee(){
		return absentee;
	}

	public void setEducationTerm(EducationTermDTO educationTerm){
		this.educationTerm = educationTerm;
	}

	public EducationTermDTO getEducationTerm(){
		return educationTerm;
	}

	public void setExamAverage(int examAverage){
		this.examAverage = examAverage;
	}

	public int getExamAverage(){
		return examAverage;
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

	public void setLesson(LessonDTO lesson){
		this.lesson = lesson;
	}

	public LessonDTO getLesson(){
		return lesson;
	}

	public void setLetterGrade(String letterGrade){
		this.letterGrade = letterGrade;
	}

	public String getLetterGrade(){
		return letterGrade;
	}

	public void setMidtermExam(int midtermExam){
		this.midtermExam = midtermExam;
	}

	public int getMidtermExam(){
		return midtermExam;
	}

	public void setStudent(StudentDTO student){
		this.student = student;
	}

	public StudentDTO getStudent(){
		return student;
	}

	@Override
 	public String toString(){
		return 
			"StudentInfosDTO{" + 
			"absentee = '" + absentee + '\'' + 
			",educationTerm = '" + educationTerm + '\'' + 
			",examAverage = '" + examAverage + '\'' + 
			",finalExam = '" + finalExam + '\'' + 
			",id = '" + id + '\'' + 
			",infoNote = '" + infoNote + '\'' + 
			",lesson = '" + lesson + '\'' + 
			",letterGrade = '" + letterGrade + '\'' + 
			",midtermExam = '" + midtermExam + '\'' + 
			",student = '" + student + '\'' + 
			"}";
		}
}