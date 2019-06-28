package myPractice;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new AreaCalculator().area(-1.0, 4.0));
	}

	public static double area(double radius) {
		if(radius<0) {
			return -1;
		}
		return radius*radius * Math.PI;
	}
	public static double area(double x, double y) {
		if(x<0 || y<0) {
			return -1.0;
		}
		return x*y; 
	}
	

}

