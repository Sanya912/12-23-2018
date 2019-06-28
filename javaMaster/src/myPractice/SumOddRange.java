package myPractice;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOdd(1, 11));
	}

	public static boolean isOdd (int number) {
		if(number<0) {
			return false;
		} else if(number%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int sumOdd (int start, int end) {

	int sum = 0;
	if(start<0 || end <0 || start > end) {
		return -1;
	}
		for(int num=start; num<=end;num++) {
			if(isOdd(num)==true) {
				sum+=num;
				
			}
			
		}
		return sum;
	}
}
