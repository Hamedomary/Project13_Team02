package pojos.us_14.get;

import java.util.List;
import java.io.Serializable;

public class LessonsProgramListPojoUs14 implements Serializable {
	private int id;
	private String day;
	private String startTime;
	private String stopTime;
	private List<LessonPojoUs14> lesson;

	public LessonsProgramListPojoUs14() {
	}

	public LessonsProgramListPojoUs14(int id, String day, String startTime, String stopTime, List<LessonPojoUs14> lesson) {
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lesson = lesson;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
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

	public void setLesson(List<LessonPojoUs14> lesson){
		this.lesson = lesson;
	}

	public List<LessonPojoUs14> getLesson(){
		return lesson;
	}

	@Override
 	public String toString(){
		return 
			"LessonsProgramListPojoUs14{" + 
			"id = '" + id + '\'' + 
			",day = '" + day + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",lesson = '" + lesson + '\'' + 
			"}";
		}
}