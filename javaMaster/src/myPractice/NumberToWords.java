package myPractice;

public class NumberToWords {
	 
    public static void numberToWords(int number) {
        int revNumber = reverse(number);
        if(number==0){
            System.out.println("Zero");
        }
        else if (number >= 0) {
            for (int i = 0; i <= getDigitCount(number); i++)
                while (number != 0) {
                    int d1 = revNumber % 10;
                    switch (d1) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    revNumber /= 10;
                    number /= 10;
                }
        } else {
            System.out.println("Invalid Value");
        }
    }
 
 
    public static int reverse(int n1) {
        int r1 = 0;
        while (n1 != 0) {
            int d1 = n1 % 10;
            r1 = r1 * 10 + d1;
            n1 /= 10;
        }
        return r1;
    }
 
    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
