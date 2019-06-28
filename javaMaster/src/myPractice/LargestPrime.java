package myPractice;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new LargestPrime().getLargestPrime(6));
	}

	public static int getLargestPrime(int number) {
		int total = 0;

		if(number<=0) {
			return -1;
		} else {
			for(int i=1; i<=number; i++) {
				if(number%i==0) 
					total = i;
					
					
			}
		}return total;
		
	}
}
