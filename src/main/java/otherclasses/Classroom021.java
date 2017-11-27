package otherclasses;


import java.util.ArrayList;

public class Classroom021 {
	
	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student021> students = new ArrayList<Student021>();
	
		
	public Classroom021(String classroomName, String classroomTerm, ArrayList<Student021> students){
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;		
	}	

	
	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}
	
	public ArrayList<Student021> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student021> students) {
		this.students = students;
	}

	public void addANewStudent(Student021 student){
		this.students.add(student);
	}
	

	public void removeAStudent(String name){
		
		Student021 student = null;
		boolean studentExists = false;
		
		for(int i= 0 ; i < this.students.size() ; i++){
		
			student = this.students.get(i);
			if (student.getFirstName().contains(name)){
				studentExists = true;
				this.students.remove(i);
				System.out.println("Student "+name+" successfully removed!");
				
			}	
		}
		
		if (!studentExists){
			System.out.println("The student does not exist!");
		}
		
		
	}

	public void printFullRelatory(){
		System.out.println("Classroom name: "+this.classroomName);
		System.out.println("Classroom term: "+this.classroomTerm+"\n");
		for (Student021 student : this.students){
			String fullRelatory = "The students for this term are:\n" + student.toString();
			System.out.println(fullRelatory);
		}
	}
	
 
}
