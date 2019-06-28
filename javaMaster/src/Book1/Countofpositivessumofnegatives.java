package Book1;

public class Countofpositivessumofnegatives {
static int count =0;
static int neg = 0;
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
		for (int i=0; i<input.length; i++) {
			if(input[i]>0) {
			count+=1;	
			} else if(input[i]<0) {
				neg+=input[i];
			}
		}System.out.println(count);
		System.out.println(neg);

	}

}
