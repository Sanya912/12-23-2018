package myPractice;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new PerfectNumber().isPerfectNumber(28));
	}

	public static boolean isPerfectNumber(int number) {
		int sum =0;
		if(number<1)
			return false;
		else {
			for(int i=1;i<number; i++) {
				if(number%i==0) {
					sum+=i;
					System.out.println(i);
					if(sum==number) {
						return true;
					}
					
				}
			}
		}
		return false;
		
	}
}
