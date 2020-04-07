package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByTagName("h2");
		
		//String is collection of characters
		//Way 1
		String txt = "Welcome to TestLeaf"; //String Literal
		String txt1 = "ver 2.0";
		int phoneNumber = 12345;
		System.out.println(txt);
		//length--returns count of string
		int countCharacter = txt.length();
		System.out.println(countCharacter);
		//charAt-- prints the character at given  
		char ch = txt.charAt(3);
		System.out.println(ch);
		//indexOf -- returns index no of given character
		//If there are same character multiple time, then it prints first matching
		int indexNumber = txt.indexOf('s');
		System.out.println(indexNumber);
		//lastIndexOf -- returns
	    int lastIndexnumber = txt.lastIndexOf('e');
	    System.out.println(lastIndexnumber);
	    //trim -- removes whitespace
	    String trim = txt.trim();
	    System.out.println(trim);
	    //Concatenate-- connects 2 different strings
	    System.out.println(txt.concat(txt1));
	    // + is used to connects 2 different data types 
	    System.out.println(txt + phoneNumber);
	    //convert to lower/upper case
	    System.out.println(txt.toLowerCase());
	    System.out.println(txt.toUpperCase());
	    //char Array
	    char[] charArray = txt.toCharArray();
	    System.out.println(charArray[7]);
	    //String Array
	    String[] split = txt.split(" ");
	    System.out.println(split[1]);
	    //pick only TestLeaf- substring with single argument
	    String substring = txt.substring(5);
	    System.out.println(substring);
	    //substring with double arguments can print from given points
	    String substring2 = txt.substring(15, txt.length()-1);
	    System.out.println(substring2);
	    //startsWith
	    System.out.println(txt1.startsWith("Ver"));
	    //ends with
	    System.out.println(txt.endsWith("0"));
	    txt.replace('v', 'V');
		//Way 2
		//String obj = new String("TestLeaf");//String object
		//System.out.println(obj);
	}

}
