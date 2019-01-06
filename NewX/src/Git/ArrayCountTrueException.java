package Git;

import java.util.ArrayList;

public class ArrayCountTrueException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		ArrayList <Boolean> d = new ArrayList<>();
		d.add(true);
		d.add(true);
		d.add(false);
		d.add(true);
		d.add(true);
		d.add(null);
		System.out.println(d);
		
		try {
		for(boolean i : d) {
			if(i) {
			count+=1;	
			}
			
		}
		}  catch (Exception e) { //avoid null and undefined
		      
		   }
		System.out.println(count);

	}

}
