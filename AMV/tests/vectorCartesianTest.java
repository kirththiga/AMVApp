import static org.junit.Assert.*;

import org.junit.Test;

public class vectorCartesianTest {

	@Test
	public void checkMissingInputForVectorCartesian() {

		String x1, y1, x2, y2, result;
		x1 = "";
		y1 = "2";
		x2 = "3";
		y2 = "4";

		result = "Missing an input or inputs";
		assertEquals(result,
				vectorCartesian.vectorProductResult(x1, y1, x2, y2));

		x1 = "1";
		y1 = "";
		x2 = "3";
		y2 = "4";

		assertEquals(result,
				vectorCartesian.vectorProductResult(x1, y1, x2, y2));

		x1 = "1";
		y1 = "2";
		x2 = "";
		y2 = "4";

		assertEquals(result,
				vectorCartesian.vectorProductResult(x1, y1, x2, y2));

		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "";

		assertEquals(result,
				vectorCartesian.vectorProductResult(x1, y1, x2, y2));

		x1 = "1";
		y1 = "2";
		x2 = "";
		y2 = "";

		assertEquals(result,
				vectorCartesian.vectorProductResult(x1, y1, x2, y2));
	}
	
	@Test
	public void checkCorrectResultForVectorCartesian() {
		String x1, y1, x2, y2, result;
		x1 = "1";
		y1 = "2";
		x2 = "3";
		y2 = "4";
		
		result = "";
		assertEquals(result, vectorCartesian.vectorProductResult(x1, y1, x2, y2));
		
		x1 = "61.47";
		y1 = "55.1";
		x2 = "77.3";
		y2 = "23.69";
		
		result = "";
		assertEquals(result, vectorCartesian.vectorProductResult(x1, y1, x2, y2));
		
		x1 = "941.67";
		y1 = "203.91";
		x2 = "999.2";
		y2 = "391.91";
		
		result = "";
	}

}
