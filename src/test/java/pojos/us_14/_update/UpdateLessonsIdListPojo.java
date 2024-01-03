package pojos.us_14._update;

import java.util.List;

public class UpdateLessonsIdListPojo {
    private Integer lessonIdList;

    public UpdateLessonsIdListPojo() {
    }

    public UpdateLessonsIdListPojo(int lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    public int getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(int lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    @Override
    public String toString() {
        return "UpdateLessonsIdListPojo{" +
                "lessonIdList=" + lessonIdList +
                '}';
    }
}
