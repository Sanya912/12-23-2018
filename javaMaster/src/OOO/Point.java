package OOO;

public class Point {
	private int x;
	private int y;
	 
	public Point(){
	 
	}
	 
	public Point(int x, int y){
	    this.x=x;
	    this.y=y;
	}
	 
	public int getX() {
	    return x;
	}
	 
	public void setX(int x) {
	    this.x = x;
	}
	 
	public int getY() {
	    return y;
	}
	 
	public void setY(int y) {
	    this.y = y;
	}
	public double distance(){
	    return distance(0,0);
	}
	 
	public double distance(int x1, int y1){
	 
	    ///return Math.sqrt((Math.pow((x-x1),2))+(Math.pow((y-y1),2)));
	   return Math.sqrt(Math.pow((x1-x),2)+ Math.pow((y1-y),2));
	 
	}
	public double distance(Point another){
	    return distance(another.x,another.y);
	 
	}
	public static void main(String[] args) {
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
	}
}
