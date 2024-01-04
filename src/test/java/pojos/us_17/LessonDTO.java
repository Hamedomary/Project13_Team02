package pojos.us_17;

import java.io.Serializable;

public class LessonDTO implements Serializable {
	private boolean compulsory;
	private int creditScore;
	private int lessonId;
	private String lessonName;

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

	@Override
 	public String toString(){
		return 
			"LessonDTO{" + 
			"compulsory = '" + compulsory + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}