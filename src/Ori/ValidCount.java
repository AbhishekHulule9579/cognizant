package Ori;

import java.util.Scanner;

public class ValidCount {
	public static void countvalid(int input1,int input2,int input3[]) {
		int count=0;
		int i=0;
		int j=input1-1;
		
		while(i<=j) {
			if(input3[i]+input3[j]<input2) {
				count +=(j-i+1);
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int input1=sc.nextInt();
		System.out.println("Enter comparison value");
		int input2=sc.nextInt();
		System.out.println("Enter sorted Subarray");
		int[] input3=new int[input1];
		for(int i=0;i<input1;i++) {
			input3[i]=sc.nextInt();
		}
		countvalid(input1,input2,input3);
		
	}

}
