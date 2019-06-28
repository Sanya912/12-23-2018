package OOO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFromFile {

	public static void main(String[] args) throws IOException {
		
	
	BufferedReader br = new BufferedReader(new FileReader("D:\\Text.txt"));
	
	
	try {
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
	        sb.append(line);
	        sb.append(System.lineSeparator());
	        line = br.readLine();
	    }
	    String everything = sb.toString();
	    System.out.println(everything);
	} finally {
	    br.close();
	}
}
}