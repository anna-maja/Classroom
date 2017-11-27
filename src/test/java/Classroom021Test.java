import static org.junit.Assert.*;

import java.util.logging.Logger;
import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom021;
import otherclasses.Student021;

public class Classroom021Test {

	/*
	 * testa printFullRelatory - testPrintFullRelatory
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

		// kan också skapas som testGetSetClassroomName och -ClassroomTerm separat.
		cr1.setClassroomName("10001");
		cr1.setClassroomTerm("ht 2017");

		assertEquals(cr1.getClassroomName().equals("10001"), true);
		assertEquals(cr1.getClassroomTerm().equals("ht 2017"), true);
	}

	@Test
	public void testSetAndGetStudents() {

		ArrayList<Student021> studentList2 = new ArrayList<Student021>();
		Student021 s1 = new Student021("Sune", "Sandström", 40, 'm');

		studentList2.add(s1);

		cr1.setStudents(studentList2);
		assertEquals(cr1.getStudents(), studentList2);

	}

	@Test
	public void testAddNewStudent() {
		
		ArrayList<Student021> studentList2 = new ArrayList<Student021>();
		Student021 se2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);		

		LOG.info("Testing the method addNewStudent in Classroom021 with the student " + se2.getFirstName());

		int studentsPreviousSize = students.size();

		cr1.addANewStudent(se2);
		studentList2.add(se2);
		
		assertEquals((studentsPreviousSize + 1), students.size(), 0);
		LOG.info("students.size är nu " + students.size() + " . Det ska vara samma som studentsPreviousSize +1.");

		LOG.info("Student/s in array:  --- " + cr1.getStudents());
		LOG.info("Student/s in local array: --- " + studentList2);
		
		assertEquals(cr1.getStudents(), studentList2);

	}

	@Test
	public void testRemoveStudent2() {

		Student021 seA = new Student021("Kalle", "Karlsson", 40, 'm', 3, 3, 3);
		Student021 seB = new Student021("Beda", "Berntsson", 10, 'f', 7, 7, 7);
		Classroom021 cr3 = new Classroom021("1", "vt20", students);

		cr3.removeAStudent("non-existing");
		
		LOG.info("Testing the method removeStudent in Classroom021 with the student " + seA.getFirstName() + " and "
				+ seB.getFirstName());

		cr3.addANewStudent(seA);
		cr3.addANewStudent(seB);
		int expectedStudentsSize = 2;
		assertEquals((students.size() == expectedStudentsSize), true);

		LOG.info("Variabeln expectedStudentsSize är satt till 2 = = = = = " + expectedStudentsSize);
		LOG.info("students.size är efter tillägg  " + students.size()
				+ " . Det ska vara samma som expectedStudentsSize = 2.\n");

		cr3.removeAStudent("Beda");

		assertEquals(cr3.getStudents().contains("Beda"), false);
		LOG.info("Nu ska bara Kalle finnas kvar. " + cr3.getStudents());
		

	}

	@Test
	// dålig testability för något som saknar return-värde!!! 
	public void testPrintFullRelatory() {

		cr1.setClassroomName("123abc");
		assertEquals(cr1.getClassroomName().equals("123abc"), true);

		cr1.setClassroomTerm("ht15");
		assertEquals(cr1.getClassroomTerm().equals("ht15"), true);

		LOG.info("Testing the method printFullRelatory with " + cr1.getClassroomName() + " and "
				+ cr1.getClassroomTerm());

		cr1.addANewStudent(sb2);
		
		LOG.info("Group of students should contain all info about Bertil Bas");

		cr1.printFullRelatory();
	}
}
