package myPractice;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DiagonalStar().printSquareStar(8);
	}
	
    public static void printSquareStar(int number) {
   	 
    if (number < 5) {
        System.out.println("Invalid Value");
    } else {
        for (int row = 1; row <= number; row++) {
            for (int Col = 1; Col <= number; Col++) {
                if (row == 1 || row == number || Col == 1 || Col == number || row == Col || Col == (number - row + 1)) {
                    System.out.print("*");
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

}
