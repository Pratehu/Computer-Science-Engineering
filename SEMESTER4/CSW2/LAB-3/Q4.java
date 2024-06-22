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
// StudentSearch.java
public class Q4 {
    // Method to perform linear search on an array of students
    public static Student linearSearch(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null; // Return null if student with the given roll number is not found
    }

    public static void main(String[] args) {
        // Creating an array of student objects
        Student[] students = {
            new Student("John", 101, 85),
            new Student("Alice", 102, 90),
            new Student("Bob", 103, 88)
        };

        // Searching for a student with roll number 102
        int rollNumberToSearch = 102;
        Student foundStudent = linearSearch(students, rollNumberToSearch);

        // Displaying the result
        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Roll Number: " + foundStudent.getRollNumber());
            System.out.println("Total Marks: " + foundStudent.getTotalMark());
        } else {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
    }
}

