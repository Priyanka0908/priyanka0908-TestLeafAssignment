package week1.day2;

public class Math {

	/*
	 * Methods ADD MULTIPLY DIVISON SUBTRACTION
	 */

	// add method(4 , 3) -> 7

	public int multiply(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {

		Math multiplication = new Math();
		int mul = multiplication.multiply(4, 3);
		System.out.println(mul);

	}

}
