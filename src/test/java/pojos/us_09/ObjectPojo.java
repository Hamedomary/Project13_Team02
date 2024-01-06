package pojos.us_09;

import java.io.Serializable;

public class ObjectPojo implements Serializable {

    private String lessonName;
    private Boolean compulsory;
    private int creditScore;

    public ObjectPojo() {
    }

    public ObjectPojo(String lessonName, Boolean compulsory, int creditScore) {
        this.lessonName = lessonName;
        this.compulsory = compulsory;
        this.creditScore = creditScore;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Boolean getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        this.compulsory = compulsory;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "ObjectPojo{" +
                "lessonName='" + lessonName + '\'' +
                ", compulsory=" + compulsory +
                ", creditScore=" + creditScore +
                '}';
    }
}
