import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ScalarPolarTest {

	//Missing an input or inputs
	@Test
	public void checkMissingInputForScalarPolar() {

		String r1, t1, r2, t2, result;
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		
		result = "Missing an input or inputs";
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
		
		r1 = "200";
		t1 = "";
		r2 = "120";
		t2 = "-45";
		
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
		
		r1 = "200";
		t1 = "60";
		r2 = "";
		t2 = "-45";
		
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
		
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "";
		
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
		
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "";
		
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
	}

	//Testing result with all valid inputs
	@Test
	public void checkCorrectResultForScalarPolar() {
		
		String r1, t1, r2, t2, result;
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		
		result = "-6211.66";
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
		
		r1 = "150.67";
		t1 = "35";
		r2 = "175.63";
		t2 = "67.82";
		
		result = "22238.21";
		assertEquals(result, scalarPolar.scalarProductPolarResult(r1, t1, r2, t2));
	}
}
