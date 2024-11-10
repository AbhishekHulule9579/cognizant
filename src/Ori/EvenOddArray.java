package Ori;

import java.util.Scanner;

public class EvenOddArray {
	public static void findevenodd(int[]A,int N) {
		for(int i=0;i<N;i++) {
			if(A[i]%2==0) {
				System.out.print("Even ");
			}
			else {
				System.out.print("odd ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int N=sc.nextInt();
		System.out.println("Enter Array A");
		int []A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		findevenodd(A,N);
		sc.close();
	}

}
