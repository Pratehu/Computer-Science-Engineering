// Write a program to print the following pattern
 
//  1
//  2 3
//  4 5 6
//  7 8 9 10
//  11 12 13 14 15
//  16 17 18 19
//  20 21 22
//  23 24
//  25
public class SetAQ2 {

	public static void main(String[] args) {
		
		        int n = 5; // Number of rows
		        int num = 1; // Starting number
		        
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println();
		        }
		        
		        for (int i = n - 1; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println();
		        }
		    }
		}

	