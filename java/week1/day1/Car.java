package week1.day1;

public class Car {

	String regNumber = "TN33R0646";
	// String - > Data type (Class)
	// regNumber - > Variable
	// = assignment operator
	// "TN33R0646" Value

	// age of car
	short carAge = 25;
	float age = 2.5f;

	// Punctured
	boolean isPuncured = true;

	// Brand

	char brand = 'R';

	public static void main(String[] args) {

		// Print on console using SYSO
		System.out.println("Welcome to Java");

		Car carnew = new Car();
		char BrandName = carnew.brand;
		System.out.println(BrandName);
		float CarAge = carnew.age;
		System.out.println(CarAge);
		String carRegNumber = carnew.regNumber;
		System.out.println(carRegNumber);
	}

}