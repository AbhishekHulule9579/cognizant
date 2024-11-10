package Ori;

import java.util.Scanner;

public class IdealString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Any String :");
		StringBuilder str=new StringBuilder(sc.nextLine());
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
		
			
			if(str.charAt(i)==str.charAt(i+1))
			{
				str.deleteCharAt(i);
				count++;
			}
		
		}
		System.out.println("The Repitation count of String is :"+count);
		System.out.println("Final String is "+str);

	}

}