package week1.day1;

public class Mobile {

	boolean phStatus = true;
	int screenSize = 5;
	String brandName = "Samsung";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mob = new Mobile();
		boolean phStatus = mob.phStatus;
		System.out.println(phStatus);
		int screenSize = mob.screenSize;
		System.out.println(screenSize);
		String brandName = mob.brandName;
		System.out.println(brandName);
	}

}
