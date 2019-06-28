package myPractice;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MinutesToYearsDaysCalculator().printYearsAndDays(529900);
	}

	
	public static void printYearsAndDays(long XX) {
		if(XX<0) {
			System.out.println("Invalid Value");
		} else {
			long DD = (int) (XX % 525600);
			long ZZ = DD / 1440;
			int YY  =(int) (XX / 525600);
			System.out.println(XX + " min = "+ YY +" y and " + ZZ+ " d");
		}
	}
}
