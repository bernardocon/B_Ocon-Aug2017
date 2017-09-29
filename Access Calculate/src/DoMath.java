// Bernard Ocon
// September 5, 2017
// This is my runner class for my Calculate Library methods
public class DoMath {

	public static void main(String[] args) {
		
		Calculate.square(-5);
		System.out.println(Calculate.square(-5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(5,5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7));
		System.out.println(Calculate.isDivisibleBy(10,5));
		System.out.println(Calculate.absValue(5));
		System.out.println(Calculate.max(5,10));
		System.out.println(Calculate.max(5, 10, 15));
		System.out.println(Calculate.min(5, 10));
		System.out.println(Calculate.round2(3.2578));
		System.out.println(Calculate.power(5.0,2));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(2));
		System.out.println(Calculate.gcf(2, 4));
		System.out.println(Calculate.sqrt(5));
		System.out.println(Calculate.quadForm(2, 4, 6));
	}
}
