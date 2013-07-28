package migel.testapp.test.controllers;

import migel.controllers.BaseController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BaseControllerMockTest {

	@Autowired
	private BaseController baseController;
	
	@Test
	public void testGetStatus() {
		
	}
}
