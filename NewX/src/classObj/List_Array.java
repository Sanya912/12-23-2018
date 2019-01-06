package classObj;

import java.util.ArrayList;

public class List_Array {

	public static void main(String[] args) {
		ArrayList <String> cities = new ArrayList<>();
		cities.add("Phila");
		cities.add("DC");
		cities.add("NY");
		
		System.out.println(cities);
		System.out.println("DD is here " + cities.contains("DD"));
		System.out.println("cities.contains DA:     "  + cities.contains("DA"));
		System.out.println(cities.contains("DC"));
		System.out.println(cities.get(1));
		
		cities.set(0, "DD");
		System.out.println(cities.get(0));
		System.out.println(cities);
		System.out.println(cities.contains("DD"));
		//for (String o: cities) 
			//System.out.println(o);
		for(int i=cities.size()-1; i>=0; i-- )
			System.out.println(cities.get(i));
	}

}
