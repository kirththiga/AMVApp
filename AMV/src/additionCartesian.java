public class additionCartesian {

	public static void main(String[] args) {

		String result;
		if (args.length == 4) {
			// result = vectorAddTwoResult(args[0], args[1], args[2], args[3]);
		}
	}

	/*
	 * Vector addition for two vectors Adding the x components of the two
	 * vectors for the resultant. Same process for y components.
	 */
	private static double vectorAddTwo(double x1, double x2) {

		double x = x1 + x2;
		return x;
	}

	public static String vectorAddTwoResult(String x1, String y1, String x2,
			String y2) {

		String ans = "";

		if (x1.isEmpty() || y1.isEmpty() || x2.isEmpty() || y2.isEmpty()) {
			ans = "Missing an input or inputs";
		} else {

			double[] result = new double[2];

			double temp_x1 = Double.parseDouble(x1);
			double temp_y1 = Double.parseDouble(y1);
			double temp_x2 = Double.parseDouble(x2);
			double temp_y2 = Double.parseDouble(y2);

			double x = vectorAddTwo(temp_x1, temp_x2);
			double y = vectorAddTwo(temp_y1, temp_y2);
			result[0] = x;
			result[1] = y;

			ans = "(" + x + ", " + y + ")";
		}

		return ans;
	}

	public static String vectorAddThreeResult(String x1, String y1, String x2,
			String y2, String x3, String y3) {
		String ans = "";

		if (x1.isEmpty() || y1.isEmpty() || x2.isEmpty() || y2.isEmpty()
				|| x3.isEmpty() || y3.isEmpty()) {
			ans = "Missing an input or inputs";
		} else {

			double[] result = new double[2];

			double temp_x1 = Double.parseDouble(x1);
			double temp_y1 = Double.parseDouble(y1);
			double temp_x2 = Double.parseDouble(x2);
			double temp_y2 = Double.parseDouble(y2);
			double temp_x3 = Double.parseDouble(x3);
			double temp_y3 = Double.parseDouble(y3);

			double x = vectorAddThree(temp_x1, temp_x2, temp_x3);
			double y = vectorAddThree(temp_y1, temp_y2, temp_y3);
			result[0] = x;
			result[1] = y;

			ans = "(" + x + ", " + y + ")";
		}
		return ans;
	}

	/*
	 * Vector addition for three vectors Adding the x components of the three
	 * vectors for the resultant. Same process for y components.
	 */
	private static double vectorAddThree(double x1, double x2, double x3) {

		double x = x1 + x2 + x3;
		return x;
	}

}
