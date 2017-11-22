package main;

import java.util.ArrayList;

import otherclasses.Classroom021;
import otherclasses.Student021;

public class MainToClassroom021 {	
	public static void main(String[] args) {
		ArrayList<Student021> students = new ArrayList<Student021>();
		Classroom021 classroom = new Classroom021("TEST15", "Spring 16", students);
		Student021 student1 = new Student021("Rafael", "Silva", 20, 'M', 3.1, 5.4, 6.2);
		Student021 student2 = new Student021("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8, 6.1);
		Student021 student3 = new Student021("Hans", "Ekström", 20, 'M', 8.8, 5.0, 6.0);
		Student021 student4 = new Student021("Patrik", "Hollsten", 20, 'F', 8.2, 7.3, 6.0);
		Student021 student5 = new Student021("Gopi", "Sundarraj", 20, 'M', 8.2, 9.0, 6.0);

		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		classroom.addANewStudent(student3);
		classroom.addANewStudent(student4);
		classroom.addANewStudent(student5);
		System.out.println("################ STUDENT LIST ###############");
		classroom.printFullRelatory();
		
	}

}
