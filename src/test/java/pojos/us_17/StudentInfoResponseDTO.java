package pojos.us_17;

import java.io.Serializable;

public class StudentInfoResponseDTO implements Serializable {
	private String httpStatus;
	private String message;
	private ObjectDTO object;

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setObject(ObjectDTO object){
		this.object = object;
	}

	public ObjectDTO getObject(){
		return object;
	}

	@Override
 	public String toString(){
		return 
			"StudentInfoResponseDTO{" + 
			"httpStatus = '" + httpStatus + '\'' + 
			",message = '" + message + '\'' + 
			",object = '" + object + '\'' + 
			"}";
		}
}