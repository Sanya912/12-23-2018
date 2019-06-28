package myPractice;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalComparator ob = new DecimalComparator();
		System.out.println(ob.areEqualByThreeDecimalPlaces(-3.1756, 3.1757));
	}

	public static boolean areEqualByThreeDecimalPlaces(double par, double par2) {
		if ( (int) (par * 1000) == (int) (par2 * 1000) ){
			return true;
		}
		else {
			return false;
		}
	}
}
