package Ori;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int originalnum=num;
		int reveresednum=0;
		while(num!=0) {
			int digit=num%10;
			reveresednum=reveresednum*10+digit;
			num /=10;
		}
		return originalnum==reveresednum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number to chek palindrome");
		int num=sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println(num+"  is palindrome");
		}
		else {
			System.out.println(num+"  is not palindrome");
		}
		sc.close();
	}

}
