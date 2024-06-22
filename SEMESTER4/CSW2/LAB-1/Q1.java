
import java.util.*;
class product{
     int ID = 1;
     String type = null;
     double price = 0;
     public  void get(int i, String t, double p) {
    	 this.ID=i;
    	 this.type=t;
    	 this.price=p;
     }
     public void show() {

    	 System.out.println(this.ID+","+ this.type+ ","+ this.price);
     }
	
}

public class Q1 {
	

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("How many product you want to insert ?");
         n=sc.nextInt();
         String t;
         double pr=0;
         product p[]=new product[n];
         for(int i=0;i<n;i++)
         {
        	 p[i]=new product();
        	 System.out.println("Enter the type and price of product-"+i);
        	 t=sc.next();
        	 pr=sc.nextDouble();
        	 p[i].get(i,t,pr);
        	 
         }
         double value=20000;
         System.out.println("the products are as follows");
         System.out.println("-----------------------");
         System.out.println("product ID, type , price");
         for(int i=0;i<n;i++)
         if(p[i].price>=value)
        	 p[i].show();
        	
         }
         
	}


         
//         Q1.get_info(type,price,ID,n);
         

	


