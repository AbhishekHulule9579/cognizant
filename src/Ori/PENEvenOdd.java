package Ori;

import java.util.Scanner;

public class PENEvenOdd {
	public static int CountPenSwitches(int N,int arr[]) {
		if(N==0)return 0;
		int switches=0;
		String currentpen=(arr[0]%2==0)?"even":"odd";
		for(int i=1;i<N;i++) {
			if(currentpen.equals("odd")&&arr[i]%2==0) {
				switches++;
				currentpen="even";
			}
			else if(currentpen.equals("even")&&arr[i]%2!=0) {
				currentpen="odd";
			}
		}
		return switches;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of element");
		int N=sc.nextInt();
		System.out.println("Enter element");
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(CountPenSwitches(N,arr));
		sc.close();
	}

}
