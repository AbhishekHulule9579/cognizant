package Ori;

public class FindCommon {
	
	public static int solution(String arr[],int price[],int wt[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && price[i]==price[j] && wt[i]==wt[j]) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		String arr[]= {"ball","box","ball","ball","box"};
		int price[]= {2,2,2,2,2};
		int wt[]=    {1,2,1,1,3};
		System.out.println(solution(arr,price,wt));
	}

}
