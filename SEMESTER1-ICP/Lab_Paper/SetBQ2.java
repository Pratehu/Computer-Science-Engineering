import java.util.Scanner;
public class SetBQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter Gross Salary: ");
		        double grossSalary = scanner.nextDouble();

		        double taxAmount = 0;

		        if (grossSalary <= 250000) {
		            taxAmount = 0;
		        } else if (grossSalary <= 500000) {
		            taxAmount = (grossSalary - 250000) * 0.05;
		        } else if (grossSalary <= 1000000) {
		            taxAmount = 12500 + (grossSalary - 500000) * 0.2;
		        } else {
		            taxAmount = 112500 + (grossSalary - 1000000) * 0.3;
		        }

		        System.out.println("Income Tax Amount: " + taxAmount);

		        scanner.close();
		    }
		}

	
 // Enter Gross Salary: 300500
//  Income Tax Amount: 2525.0
