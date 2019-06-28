package myPractice;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new NumberPalindrome().isPalindrome(34567));
	}

 

	public static boolean isPalindrome(int number) {
        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = number;

        // reversed integer is stored in variable 
        while( number != 0 )
        {
            remainder = number % 10;
            System.out.println(remainder);
            reversedInteger = reversedInteger * 10 + remainder;
            System.out.println(reversedInteger);
            number  /= 10;
            System.out.println(number);
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");
        return true;
        } else
            System.out.println(originalInteger + " is not a palindrome.");
        return false;
    }	

	}

