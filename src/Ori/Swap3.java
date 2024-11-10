package Ori;

import java.util.Arrays;
import java.util.Scanner;

public class Swap3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Array Elements ");
		for(int i=0;i<arr.length;i++)
			 arr[i]=sc.nextInt();
		sc.close();
		int temp=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			sum=arr[i]+sum;
		}
		System.out.println(sum);

	}

}