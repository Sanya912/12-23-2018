package OOO;

import java.util.ArrayList;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new arrayExample("pop", 5);
		new arrayExample("poppop", 56);
		new arrayExample("pophyyy", 50);
		
		arrayExample lop=new arrayExample("pop", 5);
		arrayExample lip=new arrayExample("pops", 45);
		arrayExample som=new arrayExample("pkiop", 35);
		ArrayList<String> st = new ArrayList<String>();
		st.add("car");
		st.add("ror");
		st.add("tpor");
		st.add("Lopd");
		for(int i=0; i<st.size(); i++) {
			if(st.get(i).equals("ror")){
				System.out.println("ferfffffffffffffff");
			}
			//System.out.println(st.get(i));
		}
		
	}

}
