package Ori;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Fuel {
	public static void fuelconsumption(int liter,double distance) {
		//int fuelof100=(liter/distance)*100;
		double mile=0.6214;
		
		
		double miless=distance*mile;
		
		double gaallons=0.2642;
	
		double fuelof100km=(liter/distance)*100;
		
		double gallons=liter*gaallons;
		
		double fuelconsumed=miless/gallons;

		DecimalFormat df = new DecimalFormat("#.##");
		
		String km=df.format(fuelof100km);
		System.out.println("Liters/100KM \n"+km);
		
        String fuels = df.format(fuelconsumed);
		System.out.println("Miles/gallons \n"+fuels);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of liter");
		int liter=sc.nextInt();
		System.out.println("Enter distance covered");
		double distance=sc.nextInt();
		fuelconsumption(liter,distance);
		sc.close();
	}

}
