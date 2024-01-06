package pojos.us_14;

import java.io.Serializable;

public class LessonPojo implements Serializable {
	private int creditScore;
	private boolean compulsory;
	private int lessonId;
	private String lessonName;

	public LessonPojo() {
	}

	public LessonPojo(int creditScore, boolean compulsory, int lessonId, String lessonName) {
		this.creditScore = creditScore;
		this.compulsory = compulsory;
		this.lessonId = lessonId;
		this.lessonName = lessonName;
	}

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
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
			"LessonPojo{" + 
			"creditScore = '" + creditScore + '\'' + 
			",compulsory = '" + compulsory + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}