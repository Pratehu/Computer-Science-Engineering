import java.util.*;
class Laptop{
	private String model;
	private int price;
//	Laptop(String model,int price){
//		this.model=model;
//		this.price=price;
//	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String toString() {
		return("Model name: "+model+" and it's Price: "+price);
		
	}
}

public class Q4 {
	public static void main(String args[]) {
		Laptop lap=new Laptop();
		lap.setModel("HP");
		lap.setPrice(15000);
		System.out.println(lap);
		
	}

}