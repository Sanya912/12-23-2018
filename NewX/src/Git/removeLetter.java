package Git;

public class removeLetter {

	public static void main(String[] args) {
		String s = "asd!!f";
		s.replaceAll("!", "");
		//System.out.println(s.replaceAll("!", ""));
	//return just initials 
		String st = "James Low";
		//System.out.println(st.charAt(0)+".");
		st.split(" ");
		
		String input = "hello World";
		String[] in = input.split(" ");
		System.out.println(in[0].toUpperCase().charAt(0)+"."+in[1].toUpperCase().charAt(0));

	}

}
