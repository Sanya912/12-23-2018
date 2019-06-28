package myPractice;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static boolean hasSameLastDigit(int a, int b, int c) {
		if(a<10 || a > 1000 || b<10 || b > 1000 || c<10 || c > 1000) {
			return false;
		} else if (a%10 == b%10 || a%10 == c%10 || b%10 == c%10) {
			
			return true;
		}return false;
		
	}
	
	public static boolean isValid(int one) {
		if(one>=10 && one<=1000)
			return true;
		else
			return false;
	}
}
