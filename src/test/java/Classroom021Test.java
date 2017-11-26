import static org.junit.Assert.*;

import java.util.logging.Logger;
import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom021;
import otherclasses.Student021;

public class Classroom021Test {

	/*
	 * testa removeAStudent - testRemoveStudent
	 * 
	 * testa printFullRelatory - testPrintFullRelatory
	 * 
	 */
	private static final Logger LOG = Logger.getLogger(Classroom021.class.getName());
	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student021> students = new ArrayList<Student021>();

	Student021 sb2 = new Student021("Bertil Bas", "Bertilsson", 20, 'o');
	Student021 se2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);
	Student021 se3 = new Student021("Clara Ext", "Carlsson", 40, 'f', 5, 5, 5);

	Classroom021 cr1 = new Classroom021("101", "ht17", students);
	Classroom021 cr2 = new Classroom021("202", "ht18", students);

	@Test
	public void testGetSetClassroom021() {

		cr1.setClassroomName("101");
		cr1.setClassroomTerm("ht17");
		cr1.setStudents(students);
		// HUR SETTAR JAG ARRAYER???

		assertEquals(cr1.getClassroomName().equals("101"), true);
		assertEquals(cr1.getClassroomTerm().equals("ht17"), true);
		assertEquals(cr1.getStudents().equals(students), true);
		// HUR KOLLAR JAG UPP ARRAYER???
	}

	@Test
	public void testAddNewStudent() {

		LOG.info("Testing the method addNewStudent in Classroom021 with the student " + se2.getFirstName());

		Boolean haveAddedStudent = true;
		int studentsPreviousSize = students.size();
		LOG.info("Variabeln studentsPreviousSize är till en början " + studentsPreviousSize);

		cr1.addANewStudent(se2);
		assertEquals((studentsPreviousSize + 1), students.size(), 0);
		LOG.info("students.size är nu " + students.size() + " . Det ska vara samma som studentsPreviousSize +1.");

		LOG.info("Student/s in array:  --- " + cr1.getStudents());

		/**
		 * Testing method with another student with grades below 6, to check print
		 * result.
		 */
		LOG.info("\nAGAIN Testing the method addNewStudent in Classroom021 with the student " + se3.getFirstName());

		haveAddedStudent = true;
		studentsPreviousSize = students.size();
		LOG.info("Variabeln studentsPreviousSize är nu " + studentsPreviousSize);

		cr1.addANewStudent(se3);
		assertEquals((studentsPreviousSize + 1), students.size(), 0);
		LOG.info("students.size är nu " + students.size() + " . Det ska vara samma som studentsPreviousSize +1.");

		LOG.info("Student/s in array:  --- " + cr1.getStudents());
	}
	
	
	/**
	 * I denna metod vill jag befolka min array med två kända studenter.
	 * Jag vill därefter kontrollera funktionen "om ett visst namn finns, skall inget göras" 
	 * resp "om ett visst namn inte finns, skall den printen displayas".
	 */
	@Test
	public void testRemoveStudent2() {
	
		Student021 seA = new Student021("Kalle", "Karlsson", 40, 'm', 3, 3, 3);
		Student021 seB = new Student021("Beda", "Berntsson", 10, 'f', 7, 7, 7);
		//private ArrayList<Student021> students = new ArrayList<Student021>();
		
		Classroom021 cr3 = new Classroom021("1", "vt20", students);
		LOG.info("Testing the method removeStudent in Classroom021 with the student " + seA.getFirstName() + " and " + seB.getFirstName());

		cr3.addANewStudent(seA);
		cr3.addANewStudent(seB);
		int expectedStudentsSize = 2; 
		assertEquals((students.size() == expectedStudentsSize), true);

		LOG.info("Variabeln expectedStudentsSize är satt till 2: " +  expectedStudentsSize);
		LOG.info("students.size är efter tillägg  " + students.size() + " . Det ska vara samma som expectedStudentsSize = 2.\n");
		
		LOG.info("I will now remove student at index 0, should be Kalle.");
		students.remove(0);
		LOG.info("students.size är efter borttag " + students.size() + " = " + (expectedStudentsSize-1));
		
		assertEquals(cr3.getStudents().contains("Kalle"), false);
		
		LOG.info("\nOnly student left should be Beda: " + cr3.getStudents());
	}
	
	@Test

	public void testPrintFullRelatory() {

		cr1.setClassroomName("123abc");
		assertEquals(cr1.getClassroomName().equals("123abc"), true);

		cr1.setClassroomTerm("ht15");
		assertEquals(cr1.getClassroomTerm().equals("ht15"), true);

		LOG.info("Testing the method printFullRelatory with " + cr1.getClassroomName() + " and "
				+ cr1.getClassroomTerm());

		System.out.println("Classroom name: " + cr1.getClassroomName());
		System.out.println("Classroom term: " + cr1.getClassroomTerm() + "\n");

		LOG.info("Group of students should contain all info about Bo Ext && Clara Ext in 123abc and ht15.");

		String expected = "The students for this term are";
		
		assertEquals(cr1.toString().contains(("Bo Ext")), true);
	LOG.info("information about the students: " + cr1.toString());
	}
}
