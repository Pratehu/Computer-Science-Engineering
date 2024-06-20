
public class QUES7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isTriangle;

        isTriangle = (a + b >= c);
        isTriangle = (b + c >= a);
        isTriangle = (a + c >= b);
        System.out.println(isTriangle);
	}

}
