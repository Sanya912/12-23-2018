package myPractice;

public class MegaBytesConverter {

	public static void main(String[] args) {
		MegaBytesConverter obj = new MegaBytesConverter();
		obj.printMegaBytesAndKiloBytes(-1024);

	}
	int kiloBytes = 0;
	static long megabytes = 1024;
	static int rem = 0;
	

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}else {
			rem = (int) (kiloBytes%megabytes);
			megabytes=(long)(kiloBytes/megabytes);
		
			System.out.println(kiloBytes+" KB = "+ megabytes +" MB and "+ rem +" KB");
		}

	}
	
	
	
}
