package myPractice;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new EvenDigitSum().getEvenDigitSum(2000));
	}

	public static int getEvenDigitSum(int number) {
		 int remainder =0;
		 int sum =0;
		if(number < 0 ) {
			return -1;
			
	} else {
		
		  while( number != 0 )
	        {
	            remainder = number % 10;
	            number  /= 10;
	            if(remainder % 2 == 0) {
	            sum+=remainder;
	            } 
	        } 
	}
		return sum;	
		
	}
}
