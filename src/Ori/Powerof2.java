package Ori;

public class Powerof2 {
	
	static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPowerOfTwo(64)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
