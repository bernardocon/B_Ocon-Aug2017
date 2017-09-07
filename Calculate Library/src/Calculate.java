// Bernard Ocon
// September 5, 2017
// This is our library that contains various mathematical methods

public class Calculate {

//This method takes integer and returns its square
	
	public static int square (int operand) {
		int squared=operand * operand;
		return squared;
	}
	// This method takes an integer and returns its cube
		public static int cube (int number) {
			int cube=number * number * number;
			return cube;
		}
		
		//This method takes two doubles and returns its average
		public static double average (double number, double number2) {
			double average=(number + number2) / 2;
			return average;
		}
		
		//This method takes two doubles and returns its average
		public static double average (double number, double number2, double number3) {
			double average=(number + number2 + number3) / 3;
			return average;
		}
		
		//This method takes a double and returns it as a degree
		public static double toDegrees (double operand) {
			return (operand * 180/3.14159);
		}
		
		//This method converts an angle measure and returns it as a radians
		public static double toRadians (double operand) {
			return (operand * 3.14159/180);
		}
		
		//This method provides coefficients and returns it as a discriminant
		public static double discriminant (double operand1, double operand2, double operand3 ) {
			return((operand2 * operand2)-(4.0 * operand1 * operand3));
		}
		
		//This method converts mixed number into an improper fraction
		public static int toImproperFrac (int a, int b, int c) {
			return()
		}
	}

