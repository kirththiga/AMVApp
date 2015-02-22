
public class additionPolar {

	public static void main(String[] args) {

	}
	
    public static String vectorPolarAddTwoResult(String r1, String t1, String r2, String t2) {
    	String ans = "";
		
    	if (r1.isEmpty() || t1.isEmpty() || r2.isEmpty() || t2.isEmpty()) {
			ans = "Missing an input or inputs";
			
		} else{
	        double temp_r1, temp_t1, temp_r2, temp_t2, r1x, r1y, r2x, r2y, rx, ry, r, t;
	        double[] result = new double[2];
	        
	        temp_r1 = Double.parseDouble(r1);
	        temp_t1 = Double.parseDouble(t1);
	        temp_r2 = Double.parseDouble(r2);
	        temp_t2 = Double.parseDouble(t2);
	        
	        r1x = temp_r1 * Math.cos(Math.toRadians(temp_t1));
	        r1y = temp_r1 * Math.sin(Math.toRadians(temp_t1));
	        r2x = temp_r2 * Math.cos(Math.toRadians(temp_t2));
	        r2y = temp_r2 * Math.sin(Math.toRadians(temp_t2));
	
	        rx = r1x + r2x;
	        ry = r1y + r2y;
	
	        r = Math.sqrt(rx * rx + ry * ry);
	        t = Math.atan(ry / rx);
	
	        result[0] = r;
	        result[1] = Math.toDegrees(t);
			
	        ans = String.format("%.2f", result[0]) + " at " + String.format("%.2f", result[1]) + " degrees";
	        
		}
    	return ans;
    }
    
    public static String vectorPolarAddThreeResult(String r1, String t1, String r2, String t2, 
    		String r3, String t3) {
    	String ans = "";
    	
    	if (r1.isEmpty() || t1.isEmpty() || r2.isEmpty() || t2.isEmpty() || r3.isEmpty() || t3.isEmpty()) {
			ans = "Missing an input or inputs";
			
		} else{
	        double temp_r1, temp_t1, temp_r2, temp_t2, temp_r3, temp_t3;
	        double r1x, r1y, r2x, r2y, r3x, r3y, rx, ry, r, t;
	        double[] result = new double[2];
	        
	        temp_r1 = Double.parseDouble(r1);
	        temp_t1 = Double.parseDouble(t1);
	        temp_r2 = Double.parseDouble(r2);
	        temp_t2 = Double.parseDouble(t2);
	        temp_r3 = Double.parseDouble(r3);
	        temp_t3 = Double.parseDouble(t3);
	        r1x = temp_r1 * Math.cos(Math.toRadians(temp_t1));
	        r1y = temp_r1 * Math.sin(Math.toRadians(temp_t1));
	        r2x = temp_r2 * Math.cos(Math.toRadians(temp_t2));
	        r2y = temp_r2 * Math.sin(Math.toRadians(temp_t2));
	        r3x = temp_r3 * Math.cos(Math.toRadians(temp_t3));
	        r3y = temp_r3 * Math.sin(Math.toRadians(temp_t3));
	
	        rx = r1x + r2x + r3x;
	        ry = r1y + r2y + r3y;
	        
	        r = Math.sqrt(rx * rx + ry * ry);
	        t = Math.atan(ry / rx);
	        
	        result[0] = r;
	        result[1] = Math.toDegrees(t);
	        
	        ans = String.format("%.2f", result[0]) + " at " + String.format("%.2f", result[1]) + " degrees";
		}
    	
    	return ans;
    }

}
