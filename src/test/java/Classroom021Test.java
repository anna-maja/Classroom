import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;
import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom021;
import otherclasses.Student021;

public class Classroom021Test {

	/*
	 *
	 * testa addNewStudent - testAddNewStudent testa removeAStudent -
	 * testRemoveStudent
	 * 
	 * testa printFullRelatory - testPrintFullRelatory
	 * 
	 */
	private static final Logger LOG = Logger.getLogger(Classroom021.class.getName());
	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student021> students = new ArrayList<Student021>();

	Student021 sBas2 = new Student021("Bertil Bas", "Bertilsson", 20, 'o');
	Student021 sExt2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);
	Student021 sExt3 = new Student021("Clara Ext", "Carlsson", 40, 'f', 7, 7, 7);

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

		Boolean haveAddedStudent = true;
		int studentsPreviousSize = students.size();
		LOG.info("Variabeln studentsPreviousSize är till en början " + studentsPreviousSize);

		cr1.addANewStudent(sExt2);
		assertEquals((studentsPreviousSize + 1), students.size(), 0);
		LOG.info("students.size är nu " + students.size() + " . Det ska vara samma som studentsPreviousSize +1.");

		/*
		 * String input1 = "hi"; Boolean added1 = thisBag.add(input1);
		 * assertEquals(true, added1);
		 */
		/*
		 * assertEquals(intsPreviousSize + 1, ints.size()) == jämför om arrayen nu är en
		 * mer än vad den var innan.
		 */
	}

}
