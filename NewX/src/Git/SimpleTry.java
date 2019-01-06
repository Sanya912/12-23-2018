package Git;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleTry {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.remove(2);
		Collections.sort(list);
		System.out.println(list.get(0)*list.size());
		

}}
