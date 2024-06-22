import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        employee.setAge(age);

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        // Clear scanner buffer
        scanner.nextLine();

        // Display employee details
        employee.displayDetails();

        // Close scanner
        scanner.close();
    }
}
