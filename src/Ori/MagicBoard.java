package Ori;

import java.util.Scanner;

public class MagicBoard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		for(int i=0;i<input.length();i+=2) {
			String pair=input.substring(i, i+2);
			int asciiValue=Integer.parseInt(pair);
			char character=(char)asciiValue;
			System.out.println(asciiValue+"-"+character);
		}
		sc.close();
	}

}
