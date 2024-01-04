package pojos.us_12;

import java.io.Serializable;
import java.util.List;

public class LessonProgramSave implements Serializable {
    private List<Long> lessonIdList;
    private String day;
    private String startTime;
    private String stopTime;
    private String educationTermId;

    public LessonProgramSave(List<Long> lessonIdList, String day, String startTime, String stopTime, String educationTermId) {
        this.lessonIdList = lessonIdList;
        this.day = day;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.educationTermId = educationTermId;
    }

    public LessonProgramSave() {

    }

    public List<Long> getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(List<Long> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(String educationTermId) {
        this.educationTermId = educationTermId;
    }

}
