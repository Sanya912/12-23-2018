package myPractice;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InputCalculator().inputThenPrintSumAndAverage();
	}
	
	public static void inputThenPrintSumAndAverage() {
		            Scanner sc = new Scanner(System.in);



		            double total = 0;

		            int count = 0;



		            while (true) {

		                boolean hasNextInt = sc.hasNextInt();

		                if (hasNextInt) {

		                    int number = sc.nextInt();

		                    sc.nextLine();

		                    total += number;

		                    count++;

		                } else {

		                    break;

		                }

		            }

		            sc.close();

		            int average = (int) Math.round(total / count);

		            int sum = (int) total;

		            System.out.println("SUM = " + sum + " AVG = " + average);

		        }

		    
	}


