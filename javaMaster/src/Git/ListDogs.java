package Git;

import java.util.ArrayList;
import classObj.Main;

public class ListDogs{
	public String myDog;
	static ArrayList<Dog> dogsList= new ArrayList<Dog>();

//    public ListDogs(String myDog){
//    	this.myDog=myDog;
//    }
    
    public static void addToList(Dog dogName1){
    	dogsList.add(dogName1);
    }
    
    public static void printGogs() {
    		for(Dog obj : dogsList) {
		System.out.println("Employee");
		System.out.println("Name : " + obj.dogName);
	} 
}
public static void main(String[] args) {
	Dog sam = new Dog("Sam");
	Dog cam = new Dog("Cam");
	Dog ram = new Dog("Ram");
	//dogsList.add(sam);
	addToList(sam);
	addToList(cam);
	addToList(ram);

	printGogs();
	Dog olp = new Dog("Olp");
	addToList(olp);
	System.out.println("*************\n\n");
	printGogs();
}
}
