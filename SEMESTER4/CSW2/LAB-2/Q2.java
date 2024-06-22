//
//import java.util.*;
//abstract class p
//{
//    abstract void cal(float a1 , float b1);
//    
//    void display()
//    {
//        System.out.println("The Calculated Area for the Triangle and Rectangle : ");
//    }
//       
//}
//
//class rec extends p
//{
//    double a;
//    void cal(float h,float b)
//    {
//        this.a = (h*b);
//    }
//    void display()
//    {
//        System.out.println("The area of Rectangle is : "+a);
//    }
//}
//public class Q2 {
//
//	public static void main(String[] args) {
//		 System.out.println("This Program will calculate the Rectangle ");
//	        System.out.println("Enter the Height : ");
//	        Scanner sc = new Scanner(System.in);
//	        float h = sc.nextFloat();
//	        System.out.println("Enter the Base or Width : ");
//	        float b = sc.nextFloat();
//	        
//	        p c = new rec();
//	        c.cal(h,b);
//	        c.display();
//	        
//
//	}
//
//}

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Display initial values
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());

        // Set new values for length and width
        myRectangle.setLength(7.0);
        myRectangle.setWidth(4.0);

        // Display updated values
        System.out.println("Updated Length: " + myRectangle.getLength());
        System.out.println("Updated Width: " + myRectangle.getWidth());

        // Display area and perimeter
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}

