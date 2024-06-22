//import java.util.Scanner;
//
//class car{
//	private int make;
//	private String model;
//	car (int make,String model){
//		this.make=make;
//		this.model=model;
//	}
//	public int getmake()
//	{
//		return make;
//	}
//	public void setmake(int make) {
//		this.make=make;
//	}
////	public void display(int make){
////		System.out.println("make:"+ make);
////		
////	}
//	public String getmodel()
//	{
//		return model;
//	}
//	public void setmodel(String model) {
//		this.model=model;
//	}
//	public void display(int make, String model){
//		System.out.println("make and model:"+ make+" "+model);
//		
//	}
//
//}
//
//public class Q1 {
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no. of cars");
//		int n=sc.nextInt();
//		System.out.println("Enter car1 ");
//		int make=sc.nextInt();
//		String model=sc.next();
//		car car=new car(make, model);
//		car.getmake();
//		car.setmake(make);
//		car.display(make,model);
//		
//	}
//}
class Cars {
    private String make;
    private String model;

    public Cars(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Instantiate myCar1 with specified make and model
        Cars myCar1 = new Cars("Toyota", "Camry");

        // Instantiate myCar2 with null values
        Cars myCar2 = new Cars(null, null);

        // Print initial make and model of both cars
        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());

        // Set new values for myCar2 using setter methods
        myCar2.setMake("Honda");
        myCar2.setModel("Accord");

        // Print updated make and model of myCar2
        System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}

