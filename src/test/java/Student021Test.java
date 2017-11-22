import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Student021;

public class Student021Test {

	private static final Logger LOG = Logger.getLogger(Student021.class.getName());

	Student021 sBas1 = new Student021("Adam Bas", "Adamsson", 18, 'm');
	Student021 sBas2 = new Student021("Bertil Bas", "Bertilsson", 20, 'o');
	Student021 sBas3 = new Student021("Cecilia Bas", "Ceder", 22, 'f');

	Student021 sExt1 = new Student021("Albert Ext", "Andersson", 11, 'm', 5, 5, 5);
	Student021 sExt2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);
	Student021 sExt3 = new Student021("Clara Ext", "Carlsson", 40, 'f', 7, 7, 7);
	Student021 sExt4 = new Student021("Delta Ext", "Dunker", 17, 'm', 0, 0, 0);

	public void testGetSetPerson021() {
		
		Student021 sBas1 = new Student021("Adam Bas", "Adamsson", 18, 'm');

		sBas1.setFirstName("Adam Bas");
		sBas1.setLastName("Adamsson");
		sBas1.setAge(18);
		sBas1.setGender('m');
		assertEquals(sBas1.getFirstName().equals("Adam Bas"), true);
		assertEquals(sBas1.getLastName().equals("Adamsson"), true);
		assertEquals(sBas1.getAge(), 18);
		assertEquals(sBas1.getGender(), 'm');
	}

	
	public void testGetSetStudent021() {
		
		Student021 sExt1 = new Student021("Albert Ext", "Andersson", 11, 'm', 6.6, 7.7, 9.9);
		
		sExt1.setFirstName("Albert Ext");
		sExt1.setLastName("Andersson");
		sExt1.setAge(11);
		sExt1.setGender('m');
		sExt1.setFirstGrade(6.6);
		sExt1.setSecondGrade(7.7);
		sExt1.setThirdGrade(9.9);
		sExt1.setAverageGrade(8.067);
		assertEquals(sExt1.getFirstName().equals("Albert Ext"), true);
		assertEquals(sExt1.getLastName().equals("Andersson"), true);
		assertEquals(sExt1.getAge(), 11);
		assertEquals(sExt1.getGender(), 'm');
		assertEquals(sExt1.getFirstGrade(), 6.6, 0);
		assertEquals(sExt1.getSecondGrade(), 7.7, 0);
		assertEquals(sExt1.getThirdGrade(), 9.9, 0);
		assertEquals(sExt1.getAverageGrade(), 8.067, 0.5);
		
	}

	
	
	
	

}
