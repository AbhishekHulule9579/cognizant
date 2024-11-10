package Ori;

public class LuckyNumber {
	public static String lucky(int a) {
	if(a>999 && a<10000) {
	int total=0;
	while(a>0) {
		int b=a%10;
		total+=b;
		a/=10;
	}
	if(total%3==0 || total%5==0 || total%7==0) {
		return "Lucky Number";
	}
	}
	
	return "number is not a valid card number";
}

public static void main(String[] args) {
	int a=1253;
	System.out.println(lucky(a));
}
}
