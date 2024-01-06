package pojos.us_09;

import java.io.Serializable;

public class ViceDeanPojo implements Serializable {

    private String httpStatus;
    private String message;
    private ObjectPojo object;

    public ViceDeanPojo() {

    }

    public ViceDeanPojo(String httpStatus, String message, ObjectPojo object) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

    @Override
    public String toString(){
        return
                "DeanPojo{" +
                        "httpStatus = '" + httpStatus + '\'' +
                        ",message = '" + message + '\'' +
                        ",object = '" + object + '\'' +
                        "}";
    }
}
