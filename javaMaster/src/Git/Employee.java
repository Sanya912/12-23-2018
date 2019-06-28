package Git;

import java.util.ArrayList;

public class Employee {

	int eno;
	String 	name, address;
	Employee(){};
	public Employee(int eno, String name, String address) {
		this.eno = eno;
		this.name = name;
		this.address = address;
	}
	void displayData(ArrayList<Employee> list) {
		for(Employee ob : list) {
			System.out.println("Employee");
			System.out.println("No : " + ob.eno);
			System.out.println("Name : " + ob.name);
			System.out.println("Address : " + ob.address);
			
			System.out.println("========");
	}
	
	
}
	}
