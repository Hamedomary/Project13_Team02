package pojos.us_11;

import java.util.List;
import java.io.Serializable;

public class AdvisorTeacherDTO implements Serializable {
	private int id;
	private List<StudentsDTO> students;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStudents(List<StudentsDTO> students){
		this.students = students;
	}

	public List<StudentsDTO> getStudents(){
		return students;
	}

	@Override
 	public String toString(){
		return 
			"AdvisorTeacherDTO{" + 
			"id = '" + id + '\'' + 
			",students = '" + students + '\'' + 
			"}";
		}
}