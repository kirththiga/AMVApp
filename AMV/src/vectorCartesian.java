public class vectorCartesian {

	public static void main(String[] args) {

	}

	public static String vectorProductResult(String x1, String y1, String x2,
			String y2) {
		String ans = "";

		if (x1.isEmpty() || y1.isEmpty() || x2.isEmpty() || y2.isEmpty()) {
			ans = "Missing an input or inputs";
		} else {
			double temp_x1, temp_y1, temp_x2, temp_y2, result;

			temp_x1 = Double.parseDouble(x1);
			temp_y1 = Double.parseDouble(y1);
			temp_x2 = Double.parseDouble(x2);
			temp_y2 = Double.parseDouble(y2);

			result = vMultiplication(temp_x1, temp_y1, temp_x2, temp_y2);
			ans = String.format("%.2f", result);
		}

		return ans;
	}

	public static double vMultiplication(double x1, double y1, double x2,
			double y2) {
		return x1 * y2 - x2 * y1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
