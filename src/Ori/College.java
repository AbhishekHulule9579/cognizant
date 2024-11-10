package Ori;

import java.util.Scanner;

public class College {
	public static void findhigh(int CSE,int ECE,int MECH) {
		if(CSE>ECE && CSE>MECH) {
			System.out.println("Highest placement in CSE");
		}
		else if(ECE>CSE && ECE>MECH) {
			System.out.println("Highest placement in ECE");
		}
		else if(MECH>CSE && MECH>ECE){
			System.out.println("Highest placement in MECH");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of student in CSE");
		int CSE=sc.nextInt();
		System.out.println("Enter no of student in ECE");
		int ECE=sc.nextInt();
		System.out.println("Enter no of student in MECH");
		int MECH=sc.nextInt();
		
		if(CSE<0 || ECE<0 || MECH<0) {
			System.out.println("invalid input");
		}
		else if(CSE==ECE && ECE==MECH) {
			System.out.println("None of the department got highest placement");
		}
		else {
			findhigh(CSE,ECE,MECH);
		}
		sc.close();
	}
	

}
