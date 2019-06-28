package Git;

import java.util.ArrayList;

class Collection2{
	public static void main(String[] args) {
		Employee obj1 = new Employee(101,"Alex", "Lol");
		Employee obj2 = new Employee(102,"Alexxx", "Ldol");
		Employee obj3 = new Employee(103,"Alexs", "Lol");
		
	ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		
		Employee temp = new Employee();
		temp.displayData(list);
		System.out.println("\n\n\n\nOther process");
		
		for(Employee ob : list) {
			System.out.println("Employee");
			System.out.println("No1 : " + ob.eno);
			System.out.println("Name1 : " + ob.name);
			System.out.println("Address1 : " + ob.address);
			
			System.out.println("========");
			
		//}
		
	}
}
}
