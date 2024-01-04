package pojos.us_12;

import java.io.Serializable;
import java.util.List;

public class ChooseLessonForTeacher implements Serializable {
    private List<String> lessonProgramId;
    private Long teacherId;

    public ChooseLessonForTeacher() {
    }

    public ChooseLessonForTeacher(List<String> lessonProgramId, Long teacherId) {
        this.lessonProgramId = lessonProgramId;
        this.teacherId = teacherId;
    }

    public List<String> getLessonProgramId() {
        return lessonProgramId;
    }

    public void setLessonProgramId(List<String> lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
