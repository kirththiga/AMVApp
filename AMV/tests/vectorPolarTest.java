import static org.junit.Assert.*;

import org.junit.Test;

public class vectorPolarTest {

	// Missing an input or inputs
	@Test
	public void checkMissingInputForVectorPolar() {

		String r1, t1, r2, t2, result;
		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "-45";

		result = "Missing an input or inputs";
		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));

		r1 = "200";
		t1 = "";
		r2 = "120";
		t2 = "-45";

		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));

		r1 = "200";
		t1 = "60";
		r2 = "";
		t2 = "-45";

		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));

		r1 = "200";
		t1 = "60";
		r2 = "120";
		t2 = "";

		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));

		r1 = "";
		t1 = "60";
		r2 = "120";
		t2 = "";

		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));
	}

	@Test
	public void checkCorrectResultForVectorPolar() {
		String r1, t1, r2, t2, result;
		r1 = "77";
		t1 = "25";
		r2 = "81";
		t2 = "18";
		
		result = "-6211.66";
		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));
		
		r1 = "51.29";
		t1 = "234.76";
		r2 = "13.26";
		t2 = "138.4";
		
		result = "";
		assertEquals(result, vectorPolar.vectorProductResult(r1, t1, r2, t2));
	}
}
