import java.util.HashMap;

public class student {
	
	private String name;
	private HashMap<String, Integer> grade;
	
	public student(String name) {
		this.name = name;
		this.grade = new HashMap<String, Integer>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addGrade(String courseName, Integer grades) {
		grade.put(courseName, grades);
	}
	
	public Integer getGrade(String courseName) {
		return grade.get(courseName);
	}
	
	public HashMap<String, Integer> getAllGrades(){
		return grade;
	}

}
