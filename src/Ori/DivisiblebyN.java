package Ori;

import java.util.Scanner;

public class DivisiblebyN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Arry Elements are");
		int arr[]=new int[10];
		boolean check=true;
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();

		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		
		sc.close();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%x==0)
			{
				System.out.print(arr[i]+" ");
				check=false;
			}
		}
		if(check)
		{
			System.out.println(0);
		}
	}

}