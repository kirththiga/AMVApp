import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class additionCartesianTest {
	
	//Missing an input or inputs
	@Test
	public void checkMissingInputForAddTwo() {
		String x1, y1, x2, y2, result;
		x1 = "";
		y1 = "2";
		x2 = "3";
		y2 = "4";
		
		result = "Missing an input or inputs";
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));

		x1 = "1";
		y1 = "";
		x2 = "3";
		y2 = "4";
		
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "2";
		x2 = "";
		y2 = "4";
		
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "";
		x2 = "3";
		y2 = "4";
		
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "";
		
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "";
		x2 = "";
		y2 = "4";
		
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
	}
	
	//Testing result with all valid inputs
	@Test
	public void checkCorrectResultForAddTwo() {
		String x1, y1, x2, y2, result;
		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "4";
		
		result = "(4.0, 6.0)";
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
		
		x1 = "10.52";
		y1 = "34.6";
		x2 = "23.4";
		y2 = "45.18";
		
		result = "(33.92, 79.78)";
		assertEquals(result, additionCartesian.vectorAddTwoResult(x1, y1, x2, y2));
	}
	
	// Test missing input or inputs for vectorAddThree
	@Test
	public void checkMissingInputForAddThree() {
		String x1, y1, x2, y2, x3, y3, result;
		x1 = "";
		y1 = "2";
		x2 = "3";
		y2 = "4";
		x3 = "";
		y3 = "2";
		
		result = "Missing an input or inputs";
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));

		x1 = "1";
		y1 = "";
		x2 = "3";
		y2 = "4";
		x3 = "";
		y3 = "";
		
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));
		
		x1 = "1";
		y1 = "2";
		x2 = "";
		y2 = "4";
		x3 = "2";
		y3 = "";
		
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));
		
		x1 = "1";
		y1 = "";
		x2 = "3";
		y2 = "4";
		x3 = "";
		y3 = "1";
		
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));
		
		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "";
		x3 = "2";
		y3 = "";
		
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));
		
		x1 = "1";
		y1 = "";
		x2 = "";
		y2 = "4";
		x3 = "";
		y3 = "2";
		
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));
	}

	//Testing result with all valid inputs
	@Test
	public void checkCorrectResultForAddThree() {
		String x1, y1, x2, y2, x3, y3, result;
		
		x1 = "5";
		y1 = "5";
		x2 = "9";
		y2 = "3";
		x3 = "8";
		y3 = "5";
		
		result = "(22.0, 13.0)";
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));

		x1 = "65.649";
		y1 = "17.338";
		x2 = "6.838";
		y2 = "63.43";
		x3 = "70.535";
		y3 = "50.948";
		
		result = "(143.022, 131.716)";
		assertEquals(result, additionCartesian.vectorAddThreeResult(x1, y1, x2, y2, x3, y3));
	}
}
