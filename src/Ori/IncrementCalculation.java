package Ori;

import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		System.out.println("Enter the performance Approval rating");
		double rating=sc.nextDouble();
		
		if(salary<=0 ||rating<1 ||rating>5) {
			System.out.println("Invalid input");
		}
		else {
			double increment=0;
			if(rating>=1 &&rating<=3) {
				increment=0.1;
			}
			else if(rating>=3.1 && rating<=4) {
				increment=0.25;
			}
			else if(rating>=4.1 && rating<=5) {
				increment=0.3;
			}
			
			double incrementamt=salary*increment;
			double newSalary=salary+incrementamt;
			
			System.out.println((int)newSalary);
		}
		sc.close();
	}

}
