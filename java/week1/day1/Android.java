package week1.day1;

public class Android {

	String brandName = "Samsung S20";
	int launchYear = 2020;
	boolean isAndroid = true;
	float screenSize = 6.2f;
	long imeiNumber = 1236548798;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Android newAndroid = new Android();
		String brand = newAndroid.brandName;
		int launch = newAndroid.launchYear;
		boolean osStatus = newAndroid.isAndroid;
		float display = newAndroid.screenSize;
		long imie = newAndroid.imeiNumber;

		System.out.println(brand);
		System.out.println(launch);
		System.out.println(osStatus);
		System.out.println(display);
		System.out.println(imie);

	}

}
