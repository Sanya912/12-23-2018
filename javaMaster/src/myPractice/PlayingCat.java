package myPractice;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(temperature>=25 && temperature<=35) {
			return true;
		} else if(summer == true && temperature>=25 && temperature<=45) {
			return true;
		}else {
			return false;
		}
	}
}
