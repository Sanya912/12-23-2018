package Book1;

public class method1 {
	int to = 0;
	
	public static void methof (String Joy, int number) {
		if(number<50 && Joy.equals("Hi")) {
			System.out.println("Your score is low" + "     HIHIHIHIHIIHHI");
			int to = 5;
			System.out.println(to);
		} else if(number>=50 && number<=70) {
			System.out.println("Score not bad");
		} else {
			System.out.println("Great");
		}
	}

	
	public static void main(String[] args) {

		methof("Hi", 9);
	
	}
}