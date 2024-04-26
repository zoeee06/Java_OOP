import java.util.HashMap;

public class classroom {
	private HashMap<String,student> classroom; //name and student object
	
	public classroom(){
		this.classroom = new HashMap<String,student>();
		
	}
	
	public void addStudent(String name) {
		student student = new student(name);
		classroom.put(name, student);
	}
	
	public void addGrade(String name, String courseName, Integer grade) {
		student student = classroom.get(name);
		if(student != null) {
			student.addGrade(courseName, grade);
		}
	}
	
	public Integer getGrade(String name, String courseName) {
		student student = classroom.get(name);
		if(student != null) {
			return student.getGrade(courseName);
		}
		return null;
	}
	
	public student getStudent(String name) {
		return classroom.get(name);
	}
	
	public HashMap<String,Integer> getCourseGrades(String courseName){
		HashMap<String,Integer> courseGrade = new HashMap<String,Integer>();//student name and grade
		for(student s: classroom.values()) {
			Integer grade = s.getGrade(courseName);
			if(grade!=null) {
				courseGrade.put(s.getName(), grade);
			}
			
		}
		return courseGrade;
	}
	
	public static void main(String[] args) {
		classroom classroom = new classroom();
		classroom.addStudent("Zoe");
		classroom.addGrade("Zoe", "OOP", 98);
		classroom.addGrade("Zoe", "BA", 100);
		classroom.addStudent("Grace");
		classroom.addGrade("Grace", "OOP", 97);
		classroom.addGrade("Grace", "BA", 95);
		System.out.println("BA Course Grade:");
		System.out.println(classroom.getCourseGrades("BA"));
		System.out.println("Zoe's Grade:");
		System.out.println(classroom.getStudent("Zoe").getAllGrades());
		
		
	}

}
