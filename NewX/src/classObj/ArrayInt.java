package classObj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayInt {

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(45);
		numbers.add(4);
		numbers.add(69);
		numbers.add(3);
		System.out.println(Collections.max(numbers));
		
		//System.out.println(numbers.get(0) + numbers.get(1));
		int [] a = new int [5];
		a[0]=4;
		a[1]=2;
		a[2]=8;
	
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		ArrayList <Double> dob = new ArrayList<>();
		dob.add(56.33);
		dob.add(43.3);
		System.out.println(dob);

	}

}
