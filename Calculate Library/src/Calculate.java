//Bernard Ocon
//September 5, 2017
//This is our library that contains various mathematical methods

public class Calculate {

private static final int n = 0;
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
			double discriminant=((operand2 * operand2)-(4.0 * operand1 * operand3));
			return (discriminant);
		}
		
		//This method converts mixed number into an improper fraction
		public static String toImproperFrac (int a, int b, int c) {
			String toImproperFrac=(((a * c)+ b)+ "/" +c);
			return toImproperFrac;
		}
		
		//This method converts an improper fraction into a mixed number
		public static String toMixedNum (int numerator, int denominator) {
			String toMixedNum=(numerator % denominator + "/" + denominator);
			return (toMixedNum);
		}
		//This method converts a binomial multiplication into a quadratic equation
		public static String foil (int a, int b, int c, int d) {
			int first = (a * c);
			int second = (a * d) + (b * c);
			int third = (b * d);
			return (first + "n^2" + "+" + second + "n" + "+" + third);
		}
		
		//This is part 2 Methods with Conditionals
		
		public static boolean isDivisibleBy (int a, int b) {
		if ( a % b == 0 ) {
		return (true);	
		}
		else {
			return (false);
		}
		}
		
		//This method returns the absolute value of the number passed
		public static double absValue (double operand1) {
		if (operand1 >= 1) {
			return (operand1);
		}
		else {
			return (operand1 * -1.0);
		}
		
		}
		//This method retuns the max of two doubles
		public static double max (double operand1, double operand2) {
			if (operand1 > operand2) {
				return (operand1);
			}
			else {
				return (operand2);
			}
		}
		//Max #2
		public static double max (double a, double b, double c) {
			if (a > b && a > c) {
				return (a);
			}
			else if (b > a && b > c) {
				return (b);
			}else {
				return (c);
			}
		}
		
		//This method returns the smaller of two values
		public static int min (int operand1, int operand2) {
			if (operand1 > operand2) {
				return operand2;
			} else {
				return operand1;
				}
			}
			
			//this methods rounds a double correcrtly to 2 decimal steps
			public static double round2 (double number) {
				double lastDigit = number*1000%10;
				if(lastDigit <5) {
					return ((number*1000) - lastDigit)/1000;
				} else {
					return ((number*1000) - lastDigit +10)/1000;
			}
				
			}
			
			//Part 3 of Calculate
			//This method raises a positive value positive integer power
			public static double power(double base, int exponent) {
			    double ans = 1;
			    if (exponent != 0) {
			        int absExponent = exponent > 0 ? exponent : (-1) * exponent;
			        for (int i = 1; i <= absExponent; i++) {
			            ans *= base;
			        }

			}
				return ans;
				
		}
			//This method returns the factorial of the value passed
			public static int factorial (int i1) {
				for (int i = 1; i <= n; i++) {
			           result = result * i;
			       }
				return result;
		}
			//This method 
			public static boolean isPrime(int n) {
			    //check if n is a multiple of 2
			    if (n%2==0) return false;
			    //if not, then just check the odds
			    for(int i=3;i*i<=n;i+=2) {
			        if(n%i==0)
			            return false;
			    }
			    return true;
			}
			 // This method 
			 public static int gcf(int num1, int num2) {
			        
			int greatestCommonFactor = 1;
			for(int i=1; i<=num1; i++) {
				if(isDivisibleBy(num1,i) && isDivisibleBy(num2,i)) {
					greatestCommonFactor=i;
				}
			}
			return (greatestCommonFactor);
			}

			 public static double sqrt (double num1) {
				 double i = 0;
				 double sqrt = num1/2.0;
				 if(num1<0) {
					 throw new IllegalArgumentException("Cannot Square root this number");
				 }
				 do {
					 i = sqrt;
					 sqrt=(i+(num1/i))/2.0;
				 } while (i-sqrt !=0);
				 sqrt = round2(sqrt);
				 return sqrt;
			 }
				 
				
	}










