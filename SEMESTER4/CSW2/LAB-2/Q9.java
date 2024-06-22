import java.util.ArrayList;
import java.util.List;

// Interface class for loose coupling
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

// Student class
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment management class
class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> offeredCourses;

    public Enrollment() {
        enrolledStudents = new ArrayList<>();
        offeredCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        offeredCourses.add(course);
        System.out.println(student.getName() + " has been enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && offeredCourses.contains(course)) {
            enrolledStudents.remove(index);
            offeredCourses.remove(course);
            System.out.println(student.getName() + " has been dropped from " + course.getCourseName());
        } else {
            System.out.println("Student is not enrolled in the specified course.");
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getName() +
                    ", Course: " + offeredCourses.get(i).getCourseName());
        }
    }
}

// Main class
public class Q9 {
    public static void main(String[] args) {
        // Creating instances of Student, Course, and Enrollment classes
        Student student1 = new Student("S001", "John Doe");
        Student student2 = new Student("S002", "Jane Smith");
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");

        // Demonstrate enrollment system functionality
        EnrollmentSystem enrollmentSystem = new Enrollment();
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();

        System.out.println();

        // Demonstrate dropping a student
        enrollmentSystem.dropStudent(student1, course1);
        enrollmentSystem.displayEnrollmentDetails();
    }
}
