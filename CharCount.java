package Ori;

import java.util.Scanner;

public class CharCount {
	public static int CharacterCount(String input1,int n,char c) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(input1.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 1 String s");
		String input1=sc.nextLine();
		int n=input1.length();
		System.out.println("Enter character C to find");
		char c=sc.next().charAt(0);
		int count=CharacterCount(input1,n,c);
		
		System.out.println("Character "+c+"occurs "+count+" HELLOWORLD"
				+ "times");
		
	}

}
