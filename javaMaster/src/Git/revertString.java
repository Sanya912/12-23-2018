package Git;

import java.util.Arrays;

public class revertString {

	public static void main(String[] args) {
		String st = "Hello People";
	
//		char [] s = st.toCharArray();
//		for(int i = s.length-1; i>=0; i--) {
//			System.out.print(s[i]);
//		}

//		StringBuffer s = new StringBuffer(st);
//		System.out.println(s.reverse());
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		for(int i =0; i<numbers.length; i++) {
			
		//System.out.print(numbers[i]);	
		
		
	}
		
		char [] s = Arrays.toString(numbers).toCharArray();
		s[0]= '(';
		s[9]= ')';
		s[10] = ' ';
		s[17] = '-';
		
		
		for(int i =0; i<s.length; i++) {

		
	}
		
		StringBuilder sss = new StringBuilder();
		sss.append("Hello");
		sss.append(" car");
		System.out.println();
		System.out.println(sss);
		System.out.println(sss.toString().replaceAll("e", "E"));
		String as ="redy";
		String o = as.replaceAll("e", "AE");
		System.out.println(o);


	}}
