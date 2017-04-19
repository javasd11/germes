package org.itsimulator.germes.app.infra.util;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.itsimulator.germes.app.infra.exception.flow.InvalidParameterException;
import org.junit.Test;

public class ChecksTest {
	
	@Test
	public void testCheckParameterGetException() {
		try {
			Checks.checkParameter(false, "test");
			assertTrue(false);
		} catch (Exception ex) {
			assertSame(ex.getClass(), InvalidParameterException.class);
			assertEquals(ex.getMessage(), "test");
		}
	}

	@Test
	public void testCheckParameterNoException() {
		Checks.checkParameter(true, "test");
		assertTrue(true);
	}

}
