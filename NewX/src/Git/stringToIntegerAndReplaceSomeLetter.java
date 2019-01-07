package Git;

import java.util.ArrayList;

public class stringToIntegerAndReplaceSomeLetter {

	public static void main(String[] args) {
		int in = 123;
		String s= ""+in;
		String.valueOf(in);
		Integer.toString(in);
		
		//replace all vowels without y
		String names= "Alex look red or dfdasaadioiouu";
		System.out.println(names.replaceAll("(?i)[aeiou]", ""));
		
	}

}
