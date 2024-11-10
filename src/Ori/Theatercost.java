package Ori;

import java.util.Scanner;

public class Theatercost {
	public static void totalprice(int ticket,char refreshment,char coupon,char circle) {
		double ticketcost=0;
		if(ticket<5 ||ticket>40) {
			System.out.println("Minimun of 5 and 40 ticket are allowed");
			return;
		}
		if(circle!='k' && circle!='q') {
			System.out.println("Invalid input");
			return;
		}
		if(circle=='k') {
			ticketcost=75*ticket;
		}
		else {
			ticketcost=150*ticket;
		}
		if(ticket>20) {
			ticketcost *=0.9;		//10 percent discount
		}
		if(coupon=='y') {
			ticketcost *=0.98;		//2 percent discount
		}
		if(refreshment=='y') {
			ticketcost +=50*ticket;
		}
		System.out.println("Ticket cost is"+ticketcost);
	}
	

	  static public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of ticket");
		int ticket=sc.nextInt();
		
		
		System.out.println("Do you want refreshment :y/n");
		char refreshment=sc.next().charAt(0);
		System.out.println("Do you have coupen code:y/n");
		char coupon=sc.next().charAt(0);
		System.out.println("Enter the circle:");
		char circle=sc.next().charAt(0);
		
		totalprice(ticket,refreshment,coupon,circle);
		sc.close();
	}

}
