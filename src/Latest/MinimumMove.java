package Latest;
import java.util.Scanner;
public class MinimumMove {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Integer");
		int size=sc.nextInt();
		System.out.println("Enter the array elements :");
		int input1[]=new int[size];
		for(int i=0;i<input1.length;i++)
		{
			input1[i]=sc.nextInt();
		}
		System.out.println("Enter the array elements :");
		int input2[]=new int[size];
		for(int i=0;i<input2.length;i++)
		{
			input2[i]=sc.nextInt();
		}
		System.out.println("Enter the Number of Moves");
		int move=sc.nextInt();
		int i=0,count=0;
		while(i<size)
		{
			if(input1[i]>input2[i])
			{
				input1[i]=input1[i]-1;
				count++;    }
			if(input1[i]<input2[i])
			{
				input1[i]=input1[i]+1;
				count++;     }
			if(input1[i]==input2[i])
			{
				i++;  }  }
		if(move>=count)
			System.out.println(count);
		else 
		  System.out.println("-1");
	}
}