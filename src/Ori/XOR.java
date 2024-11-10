package Ori;

import java.util.Scanner;

public class XOR {
	public static int findunique(int arr[]) {
		int result=0;
		for(int num:arr) {
			result ^=num;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		System.out.println("Enter array element");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("unique element is"+findunique(arr));
		sc.close();
	}

}
//XOR11