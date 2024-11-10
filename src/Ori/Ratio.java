package Ori;

import java.util.Scanner;

public class Ratio {
	
	public static void solution(int l, int r, int u) {
		
		while(l<u) {
			System.out.println(l);
			l=l*r;
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter first term of sequenece");
		int a=sc.nextInt();
		System.out.println("Enter common ration");
		int b=sc.nextInt();
		System.out.println("Enter upper limit");
		int c=sc.nextInt();
		solution(a,b,c);
		
	}

}
