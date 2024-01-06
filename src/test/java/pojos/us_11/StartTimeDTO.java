package pojos.us_11;

import java.io.Serializable;

public class StartTimeDTO implements Serializable {
	private int hour;
	private int minute;
	private int nano;
	private int second;

	public void setHour(int hour){
		this.hour = hour;
	}

	public int getHour(){
		return hour;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public int getMinute(){
		return minute;
	}

	public void setNano(int nano){
		this.nano = nano;
	}

	public int getNano(){
		return nano;
	}

	public void setSecond(int second){
		this.second = second;
	}

	public int getSecond(){
		return second;
	}

	@Override
 	public String toString(){
		return 
			"StartTimeDTO{" + 
			"hour = '" + hour + '\'' + 
			",minute = '" + minute + '\'' + 
			",nano = '" + nano + '\'' + 
			",second = '" + second + '\'' + 
			"}";
		}
}