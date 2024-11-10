package Latest;

public class CompareArraysum18 {
	public static void solution(int arr[],int n) {
		int max=0;
		int a=0;
		int b=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]+arr[j]==18 && arr[i]*arr[j]>max) {
					max=arr[i]*arr[j];
					 a=i;
					 b=j;
				}
			}
		}
		System.out.println("("+arr[a]+","+arr[b]+")");
	}
	
	public static void main(String[] args) {
		int arr[]= {11,1,2,8,10,11,15,7};
		int n=arr.length;
		solution(arr,n);
	}
}
