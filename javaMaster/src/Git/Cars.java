package Git;

import java.util.ArrayList;

public class Cars {
	static ArrayList<Car> listCars = new ArrayList<Car>();

	static void addCars(Car o){
		listCars.add(o);
	}
	static void printListCars() {
		System.out.println("*****new list*****\n");
		for(Car obj : listCars) {
			System.out.print("Brand" + obj.car + " :");
			System.out.println(obj.price);
		}
	}
	public static void main(String[] args) {

		Car bmw = new Car("BMW", 50999);
		Car merc = new Car("Merc", 233999);
		Car toyota = new Car("Toyota", 40999);
		Car honda = new Car("Honda", 89999);
		addCars(bmw);
		addCars(merc);
		addCars(toyota);
		addCars(honda);
		
		printListCars();
		
	}

}
