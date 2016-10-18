package exercises.gui;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Conversor;

public class conversorTest {

	@Test
	public void testRadiensToDegrees() {
		Conversor convers= new Conversor();
		
		//convers.DegreesToRadiens(5.0);
		assertEquals(convers.DegreesToRadiens(5.0),0.08,0.01);
		
	}
	
	@Test
	public void testDegreesToRadiens() {
		Conversor convers= new Conversor();
		
		
		assertEquals(convers.RadiensToDegrees(5.0),286.4,0.1);
		
	}

}
