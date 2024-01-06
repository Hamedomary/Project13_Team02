package pojos.us_17;

import java.util.List;
import java.io.Serializable;

public class LessonProgramSetDTO implements Serializable {
	private String day;
	private EducationTermDTO educationTerm;
	private int id;
	private List<LessonDTO> lesson;
	private String startTime;
	private String stopTime;
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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLesson(List<LessonDTO> lesson){
		this.lesson = lesson;
	}

	public List<LessonDTO> getLesson(){
		return lesson;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
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
			"LessonProgramSetDTO{" + 
			"day = '" + day + '\'' + 
			",educationTerm = '" + educationTerm + '\'' + 
			",id = '" + id + '\'' + 
			",lesson = '" + lesson + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",students = '" + students + '\'' + 
			",teachers = '" + teachers + '\'' + 
			"}";
		}
}