package Ori;

public class MinMaxSquarCube {
	
	public static int solution(int n) {
		int square=0;
		int cube=0;
		boolean a=false;
		boolean b=false;
		for(int i=1;i<=n;i++) {
			if(i*i<=n) {
				square=Math.max(square, i*i);
			}
			else {
				a=true;
			}
			if(i*i*i<=n) {
				cube=Math.max(cube, i*i*i);
			}
			else {
				b=true;
			}
			
			if(a && b) {
				break;
			}
		}
		int sum=cube+square;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}
