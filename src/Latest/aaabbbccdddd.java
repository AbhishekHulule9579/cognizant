package Latest;

import java.util.Arrays;
import java.util.Scanner;

public class aaabbbccdddd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuilder str=new StringBuilder(sc.nextLine());
		int count[]=new int[256];
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;	
			
		}
		for(int j=0;j<count.length;j++)
			max=Math.max(max, count[j]);
		int strcount=str.length()-max;
		System.out.println(strcount);
		
	}

}