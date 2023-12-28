package pojos.us_10._pojos;
import java.util.List;
public class LessonListPOJO {
    private List<Integer> lessonIdList;
    public LessonListPOJO() {
    }
    public LessonListPOJO(List<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }
    public List<Integer> getLessonIdList() {
        return lessonIdList;
    }
    public void setLessonIdList(List<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }
    @Override
    public String toString() {
        return "LessonListPOJO{" +
                "lessonIdList=" + lessonIdList +
                '}';
    }
}