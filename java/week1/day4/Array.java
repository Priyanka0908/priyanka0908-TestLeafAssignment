package week1.day4;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default value is 0
		/*int[] a = new int[4];
		System.out.println(a[2]);
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		/*
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		} */
		
		//default
		//String[] txt = new String[4];
		//System.out.println(txt);
		
		int[] a = {200, 500, 10, 3000};
		 
		 int max = 0 ;
		 for (int i = 1; i < a.length-1; i++) {
			
			 if (a[i]>max) {
				 max = a[i]; 
				 System.out.println(max);
			 }
			 
			//index number
			 
			 int[] c = {200, 500, 10, 3000, 10, 10};
			 if(c[i] == 10) {
				 System.out.println(i);
				 break;
			 }
		}
}
}
