package myPractice;

public class FlourPacker {
	public static void main(String[] args) {
		System.out.println(new FlourPacker().canPack(2, 1, 5));
	}
	 
    public static boolean canPack(int bigCount,int smallCount, int goal){
 
        if (bigCount < 0 || smallCount < 0 || goal<0) {
            return false;
 
        }
        if ((bigCount*5)+smallCount==goal){
            return true;
        }else if (bigCount*5+smallCount>goal){
                return goal-(bigCount*5)>0;
            }
        return false;
    }
}