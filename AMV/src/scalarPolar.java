
public class scalarPolar {

	public static void main(String[] args) {

	}

	public static String scalarProductPolarResult(String r1, String t1, String r2, String t2) {
    	
    	String ans  = "";
 
		
    	if (r1.isEmpty() || t1.isEmpty() || r2.isEmpty() || t2.isEmpty()) {
			ans = "Missing an input or inputs";
			
		} else {
			
		  double result, x1, x2, y1, y2, temp_r1, temp_t1, temp_r2, temp_t2;
		  
		  temp_r1 = Double.parseDouble(r1);
	      temp_t1 = Double.parseDouble(t1);
	      temp_r2 = Double.parseDouble(r2);
	      temp_t2 = Double.parseDouble(t2);
	        
		  x1 = temp_r1 * Math.cos(Math.toRadians(temp_t1));
		  x2 = temp_r2 * Math.cos(Math.toRadians(temp_t2));
		  y1 = temp_r1 * Math.sin(Math.toRadians(temp_t1));
		  y2 = temp_r2 * Math.sin(Math.toRadians(temp_t2));

		  result = x1 * x2 + y1 * y2;
		  ans = String.format("%.2f", result);
		}
    	
    	return ans;
	}
}
