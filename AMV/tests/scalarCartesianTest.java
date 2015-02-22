import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class scalarCartesianTest {

	//Missing an input or inputs
	@Test
	public void checkMissingInputForScalarCartesian() {

		String x1, y1, x2, y2, result;
		x1 = "";
		y1 = "2";
		x2 = "3";
		y2 = "4";
		
		result = "Missing an input or inputs";
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "";
		x2 = "3";
		y2 = "4";
		
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "2";
		x2 = "";
		y2 = "4";
		
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "";
		
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
		
		x1 = "1";
		y1 = "2";
		x2 = "";
		y2 = "";
		
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
	}
	
	//Testing result with all valid inputs
	@Test
	public void checkCorrectResultForScalarCartesian() {
		
		String x1, y1, x2, y2, result;
		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "4";
		
		result = "11.00";
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
		
		x1 = "10.52";
		y1 = "34.6";
		x2 = "23.4";
		y2 = "45.18";
		
		result = "1809.40";
		assertEquals(result, scalarCartesian.scalarProductResult(x1, y1, x2, y2));
		
	}

}
