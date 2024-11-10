package Ori;

import java.util.Scanner;

public class PrimeNo {
	public static void primenumber(int in1,int in2) {
		//int prime=0;
		if(in1>in2 ||in1<=0||in2<=0) {
			System.out.println("Enter valid input");
			return;
		}
		else {
			for(int i=in1;i<=in2;i++) {
				boolean isPrime=true;
				int j=2;
				
				while(j*j<=i) {
					if(i%j==0) {
						isPrime=false;
						break;
					}
					j++;
				}
				if(isPrime && i>1) {
					System.out.println(i+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first input");
		int in1=sc.nextInt();
		System.out.println("Enter second input");
		int in2=sc.nextInt();
		sc.close();
		primenumber(in1,in2);
	}

}
