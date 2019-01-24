package Git;

import java.util.HashMap;

public class HashhhMap {
 

	public static void main(String[] args) {
		Employee f = new Employee(1);
		Employee f2 = new Employee(1);
		
		HashMap<Employee, String> lp = new HashMap<>();
		lp.put(f, "Cat");
		lp.put(f2,"Cat");
		
		System.out.println(lp.size());
		
		Integer n = new Integer(1);
		Integer n2 = new Integer(1);
		HashMap<Integer, String> c = new HashMap<>();
		c.put(n, "one");
		c.put(n2, "one");
		System.out.println(c.size());
		////////////////////////////////////////////////
		StringBuilder s = new StringBuilder();
		s.append("Hi"); s.append("Poo");
		System.out.println(s);
		Thread.currentThread();
		
}
}
