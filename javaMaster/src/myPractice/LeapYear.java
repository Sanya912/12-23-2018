package myPractice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isLeapYear(int year) {
		if(year>=1 && year<=9999 ) {
		  if (year % 4 != 0) {
		    return false;
		  } else if (year % 400 == 0) {
		    return true;
		  } else if (year % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
		}
		return false;
	}
}
