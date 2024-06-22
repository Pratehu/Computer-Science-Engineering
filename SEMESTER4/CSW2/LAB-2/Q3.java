class point {
	int x,y;
	public  point(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public point(point obj) {
		this.x=obj.x;
		this.y=obj.y;
	}
	public void display(point obj) {
		System.out.println("x and y"+" "+ x+" "+y);
		
	}
}
public class Q3 {

	public static void main(String[] args) {
		System.out.println("the point");
		point p1=new point(5,15);
		point p2=new point(p1);
		p1.display(p2);

	}

}
