package Ori;

import java.util.Scanner;

public class ReboundHeight {
	public static int rebound(int h,int v,int Vn) {
		int a=v/Vn;
		int H=h*a*a;
		return H;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter intial height H");
		int h=sc.nextInt();
		System.out.println("Enter intial velecity V");
		int v=sc.nextInt();
		System.out.println("Enter final velocity Vn");
		int Vn=sc.nextInt();
		
		int he=rebound(h,v,Vn);
		System.out.println(he);
		sc.close();
	}

}
