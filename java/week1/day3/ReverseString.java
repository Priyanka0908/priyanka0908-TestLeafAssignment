package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputTxt = "Welcome";
		for (int i = inputTxt.length()-1; i >= 0; i--) {
			System.out.println(inputTxt.charAt(i));
		}
	}
}