package linledListt;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color red = new Color("Red", "Five");
		Color blue = new Color("Blue", "One");
		Color grey = new Color("Grey", "One");
		
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Color> listC = new ArrayList<>();
		ListIterator<Color> it  = listC.listIterator();
		listC.add(red);
		listC.add(blue);
		listC.add(grey);
		for(int i  =0; i< listC.size(); i++) {
			System.out.print(listC.get(i).getCol() + ">>>> ");
			System.out.println(listC.get(i).getNum());
			
		}
		
//		while(it.hasNext()) {
//			if(it.next().equals("Red")) {
//				System.out.println("EEEEE");
//			}
//		}
		
		
		
		list.add("Jay Z");
		list.add("Beyonce");
		list.add("Wayne");
		
		ListIterator <String> iterator= list.listIterator(); 
		
		while(iterator.hasNext())
			if(iterator.next().equals("Wayne")) {
				System.out.println("****************YYYYYYYYYYYYESSSSSSSSSSSSSSSSSSSS");
			}
		/*System.out.println(" * " + iterator.next());*/
		
		
		
		
		
		
	}
}
