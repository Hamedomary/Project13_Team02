package pojos.us_11;

import java.util.List;
import java.io.Serializable;

public class LessonProgramPostDTO implements Serializable {
	private String day;
	private String educationTermId;
	private List<Integer> lessonIdList;

	public LessonProgramPostDTO(String day, String educationTermId, List<Integer> lessonIdList, String startTime, String stopTime) {
		this.day = day;
		this.educationTermId = educationTermId;
		this.lessonIdList = lessonIdList;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}

	private String startTime;
	private String stopTime;

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setEducationTermId(String educationTermId){
		this.educationTermId = educationTermId;
	}

	public String getEducationTermId(){
		return educationTermId;
	}

	public void setLessonIdList(List<Integer> lessonIdList){
		this.lessonIdList = lessonIdList;
	}

	public List<Integer> getLessonIdList(){
		return lessonIdList;
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

	@Override
 	public String toString(){
		return 
			"LessonProgramPostDTO{" + 
			"day = '" + day + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",lessonIdList = '" + lessonIdList + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			"}";
		}
}