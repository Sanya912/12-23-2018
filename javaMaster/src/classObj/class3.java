package classObj;

import java.util.ArrayList;

class class3{  
	    
	  String name;  
	  int age; 
	  private static ArrayList<Integer> st=new ArrayList<>();
	  private static ArrayList<Integer> sts=new ArrayList<>();
	  
	  class3(int name){  
	   st.add(name);  
	  } 
	  
	 static void de(int r) {
		 sts.add(r);
	  }
	  
	  public static void main(String[] args) {
		  
		  new class3(5);
		  new class3(3);
		  de(4);
		  de(6);
		  //System.out.println(sts.toString());
		  for(int j=0; j<sts.size(); j++) {
			  System.out.print(sts.get(j));
		  }
		  for(int i=0; i<st.size(); i++) {
		//System.out.print(st.get(i));
		if(st.get(i).equals(5)) {
			System.out.println("Has it");
		}
	}}
	  
	} 