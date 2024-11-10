package Ori;

import java.util.Scanner;

public class WavwTheater {
	public static void calcu(int pizza,int puff,int colddrink) {
		int total=0;
		int pizzas=pizza*100;
		int puffs=puff*20;
		int cold=colddrink*10;
		
		total=pizzas+puffs+cold;
		System.out.println("No of pizza is"+pizza);
		System.out.println("No of puff is"+puff);
		System.out.println("No of cold drink is"+colddrink);
		System.out.println("Total Price:"+total);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of pizza you bought");
		int pizza=sc.nextInt();
		System.out.println("Enter no of puff you bought");
		int puff=sc.nextInt();
		System.out.println("Enter no of cold drink you bought");
		int colddrink=sc.nextInt();
		System.out.println("Bill Details:");
		
		calcu(pizza,puff,colddrink);
		sc.close();
	}

}
