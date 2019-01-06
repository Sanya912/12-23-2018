package Git;

public class StringToChar {

	public static void main(String[] args) {
		String a = "Sdsad";
		//char b = a.charAt(0);
		
		
		//if(a.toLowerCase().charAt(0)=='s') {   //or
		if(a.toLowerCase().startsWith("s")) {
			System.out.println("Name Alex");
			
		}else {
			System.out.println("Nooooo");
		}
		

	}

}
