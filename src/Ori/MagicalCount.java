package Ori;

import java.util.Scanner;

public class MagicalCount {
	public static int countMagicalRows(int n,int m,int[][]books) {
		int magicalcount=0;
		for(int i=0;i<n;i++) {
			int oddSum=0;
			for(int j=0;j<m;j++) {
				if(books[i][j]%2!=0) {
					oddSum +=books[i][j];
				}
			}
		if(oddSum%2==0) {
			magicalcount ++;
		}
		}
		return magicalcount;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int n=sc.nextInt();
		System.out.println("Enter column");
		int m=sc.nextInt();
		System.out.println("Enter element");
		int[][]books=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				books[i][j]=sc.nextInt();
			}
		}
		System.out.println(countMagicalRows(n,m,books));
		sc.close();
	}

}
