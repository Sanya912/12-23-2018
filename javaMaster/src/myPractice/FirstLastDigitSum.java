package myPractice;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new FirstLastDigitSum().sumFirstAndLastDigit(5));
	}

	public static int sumFirstAndLastDigit(int number) {
		if(number<0) {
			return -1;
		}
		
		String ss=Integer.toString(number);
		int first = Integer.parseInt(Character.toString(ss.charAt(0)));
		int last =  Integer.parseInt(Character.toString(ss.charAt(ss.length() -1)));
		return first + last;
		
		
	}

}
