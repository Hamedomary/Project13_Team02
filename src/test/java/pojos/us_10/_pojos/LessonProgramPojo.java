package pojos.us_10._pojos;
import java.io.Serializable;
public class LessonProgramPojo implements Serializable {
    private Object01Pojo object;
    private String message;
    private String httpStatus;
    public LessonProgramPojo() {
    }
    public LessonProgramPojo(Object01Pojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }
    public void setObject(Object01Pojo object){
        this.object = object;
    }
    public Object01Pojo getObject(){
        return object;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setHttpStatus(String httpStatus){
        this.httpStatus = httpStatus;
    }
    public String getHttpStatus(){
        return httpStatus;
    }
    @Override
    public String toString(){
        return
                "LessonProgramPojo{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}
