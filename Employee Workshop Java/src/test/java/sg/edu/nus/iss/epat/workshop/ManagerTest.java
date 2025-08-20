package sg.edu.nus.iss.epat.workshop;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ManagerTest{
	@Test
	public void testComputeSalary() {
//		Employee manager = new Manager("John", 5000.0f, 2000.0f);
		Employee manager = new Manager("John", 5000.0f, 2000.0f);
		assertTrue( manager.computeSalary() == 6000.0f);
	}
}
