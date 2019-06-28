package myPractice;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new SharedDigit().hasSharedDigit(34, 55));
	}
	
	public static boolean hasSharedDigit(int a, int b){
        if(a<10 || b<10 || a>99 || b>99)
            return false;
            
        if(a%10 == b%10 || a%10 == b/10 || a/10 == b%10 || a/10 == b/10)
        return true;
 
        return false;
        
    }

	/*public static boolean hasSharedDigit(int one, int two) {
		
		String f = String.format("%02d",one);
		String s = String.format("%02d",two);
		int first = Integer.parseInt(Character.toString(f.charAt(0)));
		int fsec = Integer.parseInt(Character.toString(f.charAt(1)));
		int secf = Integer.parseInt(Character.toString(s.charAt(0)));
		int secs = Integer.parseInt(Character.toString(s.charAt(1)));
		
		
		if(one<10 || two <10 || one > 99 || two > 99) {
			return false;
		}else if(first==secf || first==secs || fsec ==secf || fsec== secs && one>=10 && two >= 10 && one <=99 && two <=99){
				return true;
			}else {
				return false;
		} 
	}*/
}
