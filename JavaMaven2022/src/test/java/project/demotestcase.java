package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class demotestcase {

	@Test
	public void test() {
		demo calc = new demo();

        assertTrue(calc.doMath("1", 5, 7) == 12.0);
        assertTrue(calc.doMath("2", 5, 7) == -2.0);
        assertTrue(calc.doMath("3", 5, 7) == (5.0/7.0));
        assertTrue(calc.doMath("4", 5, 7) == (5.0*7.0));
	}

}
