import static org.junit.Assert.*;

import java.util.logging.Logger;
import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom021;
import otherclasses.Student021;

public class NewIdeas {

	private static final Logger LOG = Logger.getLogger(Classroom021.class.getName());

	Student021 seA = new Student021("Kalle", "Karlsson", 40, 'm', 3, 3, 3);
	Student021 seB = new Student021("Beda", "Berntsson", 10, 'f', 7, 7, 7);
	private ArrayList<Student021> students = new ArrayList<Student021>();

	Classroom021 cr3 = new Classroom021("1", "vt20", students);

	@Test
	public void testRemoveStudent2() {

		LOG.info("Testing the method removeStudent in Classroom021 with the student " + seA.getFirstName() + " and "
				+ seB.getFirstName());

		Student021 student = null;
		cr3.addANewStudent(seA);
		cr3.addANewStudent(seB);
		int expectedStudentsSize = 2;

		assertEquals((students.size() == expectedStudentsSize), true);

		String expectedName = "Kalle";
		student = this.students.get(0);
		boolean doesExist = false;

		// jag ska testa studentExists
		LOG.info("Testing to remove Kalle = " + student.getFirstName());

		if (student.getFirstName().contains("Kalle")) {
			students.remove(0);
		} doesExist = true; 

		/*
		 * Student021 student = null; boolean studentExists = false;
		 * 
		 * for(int i= 0 ; i < this.students.size() ; i++){
		 * 
		 * student = this.students.get(i); if (student.getFirstName().contains(name)){
		 * studentExists = true; this.students.remove(i);
		 * System.out.println("Student "+name+" successfully removed!"); } }
		 */

		LOG.info("\nOnly student left should be Beda: " + cr3.getStudents());
	}

}
