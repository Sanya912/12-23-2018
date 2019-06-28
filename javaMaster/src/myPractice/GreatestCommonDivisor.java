package myPractice;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new GreatestCommonDivisor().getGreatestCommonDivisor(25, 15));
	}

	   public static int getGreatestCommonDivisor (int first, int second){
	        
	        int returnValue = 1;
	        
	        
	        if (first < 10 || second < 10){
	            return -1;
	        }
	        
	        for (int i = 1 ; i<= first ; i++){
	            if (first % i == 0){
	                if(second % i == 0){
	                    returnValue = i;
	                }
	            }    
	        }
	        
	        return returnValue;
	    }
	}

