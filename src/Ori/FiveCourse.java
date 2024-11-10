package Ori;

import java.util.Scanner;

public class FiveCourse {
	public static boolean compare(String[] str,String se) {
	
	
	for(int i=0; i<str.length; i++) {
		if(str[i].equals(se)) {
			return true;
		}
	}
	return false;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of courses");
		int n=sc.nextInt();
		System.out.println("Enter course name");
		String[] str=new String[n];
		  for (int i = 0; i < n; i++) {
	            str[i] = sc.next();
	        }
		System.out.println("Enter Course to be searched");
		String se=sc.next();
		boolean isAvailable=compare(str,se);
		
		if(isAvailable) {
			System.out.println(se+" is Available");
		}
		else {
			System.out.println(se+" is not available");
		}
	}

}
