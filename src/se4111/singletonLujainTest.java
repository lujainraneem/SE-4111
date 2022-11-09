package se4111;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class singletonLujainTest {
	
	static singletonLujain sn;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUpClass() {
		sn=singletonLujain.getiu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLujainConfig() {
		sn.setLujainAgeConfig(5);
		
		assertEquals(5, sn.getLujainAgeConfig());
	}

}
