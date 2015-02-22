import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class additionPolarTest {

	//Missing an input or inputs
	@Test
	public void checkMissingInputForPolarAddTwo() {
		
		String r1, t1, r2, t2, result;
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		
		result = "Missing an input or inputs";
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
		
		r1 = "200";
		t1 = "";
		r2 = "120";
		t2 = "-45";
		
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
		
		r1 = "200";
		t1 = "60";
		r2 = "";
		t2 = "-45";
		
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
		
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "";
		
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
		
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "";
		
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
	}
	
	//Testing result with all valid inputs
	@Test
	public void checkCorrectResultForPolarAddTwo() {
		
		String r1, t1, r2, t2, result;
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		
		result = "204.88 at 25.55 degrees";
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
		
		r1 = "150.67";
		t1 = "35";
		r2 = "175.63";
		t2 = "67.82";
		
		result = "313.09 at 52.70 degrees";
		assertEquals(result, additionPolar.vectorPolarAddTwoResult(r1, t1, r2, t2));
	}

	//Missing an input or inputs
	@Test
	public void checkMissingInputForPolarAddThree() {
		
		String r1, t1, r2, t2, r3, t3, result;
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		r3 = "23";
		t3 = "310";
		
		result = "Missing an input or inputs";
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "200";
		t1 = "";
		r2 = "120";
		t2 = "-45";
		r3 = "23";
		t3 = "310";
		
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "200";
		t1 = "60";
		r2 = "";
		t2 = "-45";
		r3 = "23";
		t3 = "310";
		
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "";
		r3 = "23";
		t3 = "310";
		
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		r3 = "";
		t3 = "310";
		
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		r3 = "23";
		t3 = "";
		
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "";
		r3 = "23";
		t3 = "310";
		
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
	}
	
	//Testing result with all valid inputs
	@Test
	public void checkCorrectResultForPolarAddThree() {
		
		String r1, t1, r2, t2, r3, t3, result;
		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "-45";
		r3 = "23";
		t3 = "310";
		
		result = "211.80 at 19.51 degrees";
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
		
		r1 = "150.67";
		t1 = "35";
		r2 = "175.63";
		t2 = "67.82";
		r3 = "23.84";
		t3 = "310.09";
		
		result = "308.76 at 48.38 degrees";
		assertEquals(result, additionPolar.vectorPolarAddThreeResult(r1, t1, r2, t2, r3, t3));
	}

}
