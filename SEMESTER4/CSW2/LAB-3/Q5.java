// Student.java
 class Student implements Comparable<Student> {
    private String name;
    private int rn; // Roll number
    private int totalMark;

    // Constructor
    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Override compareTo method to compare students based on roll number
    @Override
    public int compareTo(Student otherStudent) {
        if (this.rn == otherStudent.rn) {
            return 0;
        } else if (this.rn > otherStudent.rn) {
            return 1;
        } else {
            return -1;
        }
    }
}
//StudentSorter.java
public class Q5 {
 // Method to sort an array of students using Bubble sort
 public static void bubbleSort(Student[] students) {
     int n = students.length;
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
             // If current student's roll number is greater than the next student's roll number, swap them
             if (students[j].compareTo(students[j + 1]) > 0) {
                 Student temp = students[j];
                 students[j] = students[j + 1];
                 students[j + 1] = temp;
             }
         }
     }
 }

 public static void main(String[] args) {
     // Creating an array of student objects
     Student[] students = {
         new Student("John", 101, 85),
         new Student("Alice", 102, 90),
         new Student("Bob", 103, 88)
     };

     // Sorting the array of students
     bubbleSort(students);

     // Displaying the sorted list of students
     System.out.println("Sorted list of students:");
     for (Student student : students) {
         System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Total Marks: " + student.getTotalMark());
     }
 }
}
