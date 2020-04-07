package week1.day3;

public class StringNextChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputText = "A1B2C3";

		System.out.println("Input text is: " + inputText);

		for (int i = 0; i < inputText.length(); i++) {

			char value = (char) ((inputText.charAt(i)) + 1);
			System.out.println("Output text is: " + value);
		}
	}

}
