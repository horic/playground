package migel.testapp.test.controllers;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author markus
 *
 */
@RunWith(Parameterized.class)
public class BaseControllerTest {

	private String s1;
	private String s2;

	public BaseControllerTest(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	@Test
	public void testStatusReturnsNonNullValues() {
		assertTrue(s1.equals("1"));
		assertTrue(s2.equals("2"));
	}

	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "1", "2" },
				{ "3", "2" }
		});

	}

}
