package Ori;

import java.util.Arrays;
import java.util.Scanner;

public class SmartShopping {
	public static void FindMinItemPrice(int n,int k,int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		int maxcost=Arrays.stream(arr).max().getAsInt();
		int total=0;
		for(int i=0;i<k;i++) {
			total +=arr[i];
		}
		System.out.println(total-maxcost);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of item");
		int n=sc.nextInt();
		System.out.println("Enter number of items to buy at the shop");
		int k=sc.nextInt();
		System.out.println("Enter array representing price");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		FindMinItemPrice(n,k,arr);
		sc.close();
	}

}
