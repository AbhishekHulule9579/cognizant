package Ori;

import java.util.Scanner;

public class ReversePyramid {
	public static void ReversePyramide(int rows) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*(rows-i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		ReversePyramide(rows);
		sc.close();
	}

}
