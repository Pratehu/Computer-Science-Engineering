
import java.util.*;

class products{
	int ID ;
    String type;
    double price;
    
    public products() {
    	System.out.println("sometimes");
	}
	public  void get(int i, String t, double p) {
   	 this.ID=i;
   	 this.type=t;
   	 this.price=p;
    }
    public void show() {
   	 
   	 System.out.println("   "+this.ID+","+"      "+ this.type+ ","+"   "+ this.price);
    }
	
}
class mobile extends products{
	private String b;
	public mobile(int i, String t, double p,String b) {
		super();
		this.b = b;
	}

	public void display()
	{
		super.show();
		System.out.println("Brand:"+b);
	}

	public void mobile(int i, String string, double d, String string2) {
		// TODO Auto-generated method stub
		
	}

	
	
}

class laptop extends products{
	
}
public class Q2 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("How many product you want to insert ?");
         n=sc.nextInt();
         String t = null;
         double pr=0;
         product p[]=new product[n];
//         System.out.println("enter the no. of moblies");
//         int m=sc.nextInt();
         for(int i=0;i<n;i++)
         {
        	 p[i]=new product();
        	 System.out.println("Enter the type and price of product-"+i);
        	 t=sc.next();
        	 pr=sc.nextDouble();
        	 p[i].get(i,t,pr);
        	 
         }
         mobile mobile=new mobile(n, t, pr, t);
         
		mobile.mobile(1,"mobile",12000.50,"samsung");
         mobile.display();

         double value=20000;
         System.out.println("the products are as follows");
         System.out.println("-----------------------");
         System.out.println("product ID, type , price");
         for(int i=0;i<n;i++)
         if(p[i].price>=value)
        	 p[i].show();
	}

}
