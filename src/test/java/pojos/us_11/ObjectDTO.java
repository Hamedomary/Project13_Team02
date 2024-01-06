package pojos.us_11;

import java.util.List;
import java.io.Serializable;

public class ObjectDTO implements Serializable {
	private String day;
	private EducationTermDTO educationTerm;
	private List<LessonNameDTO> lessonName;
	private int lessonProgramId;
	private StartTimeDTO startTime;
	private StopTimeDTO stopTime;
	private List<StudentsDTO> students;
	private List<TeachersDTO> teachers;

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setEducationTerm(EducationTermDTO educationTerm){
		this.educationTerm = educationTerm;
	}

	public EducationTermDTO getEducationTerm(){
		return educationTerm;
	}

	public void setLessonName(List<LessonNameDTO> lessonName){
		this.lessonName = lessonName;
	}

	public List<LessonNameDTO> getLessonName(){
		return lessonName;
	}

	public void setLessonProgramId(int lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public int getLessonProgramId(){
		return lessonProgramId;
	}

	public void setStartTime(StartTimeDTO startTime){
		this.startTime = startTime;
	}

	public StartTimeDTO getStartTime(){
		return startTime;
	}

	public void setStopTime(StopTimeDTO stopTime){
		this.stopTime = stopTime;
	}

	public StopTimeDTO getStopTime(){
		return stopTime;
	}

	public void setStudents(List<StudentsDTO> students){
		this.students = students;
	}

	public List<StudentsDTO> getStudents(){
		return students;
	}

	public void setTeachers(List<TeachersDTO> teachers){
		this.teachers = teachers;
	}

	public List<TeachersDTO> getTeachers(){
		return teachers;
	}

	@Override
 	public String toString(){
		return 
			"ObjectDTO{" + 
			"day = '" + day + '\'' + 
			",educationTerm = '" + educationTerm + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",lessonProgramId = '" + lessonProgramId + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",students = '" + students + '\'' + 
			",teachers = '" + teachers + '\'' + 
			"}";
		}
}