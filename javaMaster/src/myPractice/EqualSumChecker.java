package myPractice;

public class EqualSumChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new EqualSumChecker().hasEqualSum(1, -3, 0));
	}

	public static boolean hasEqualSum(int one, int two, int three) {
		if(one+two==three) {
			return true;
			
		}
		return false;
	}
}
