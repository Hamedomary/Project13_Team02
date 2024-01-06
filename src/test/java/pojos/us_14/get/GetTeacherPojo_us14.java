package pojos.us_14.get;

import java.io.Serializable;

public class GetTeacherPojo_us14 implements Serializable {
	private ObjectPojo_us14 object;
	private String message;
	private String httpStatus;

	public GetTeacherPojo_us14() {
	}

	public GetTeacherPojo_us14(ObjectPojo_us14 object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojo_us14 object){
		this.object = object;
	}

	public ObjectPojo_us14 getObject(){
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
			"GetTeacherPojo_us14{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}