 public class Q1 {
    public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    String s4 = new String("Hello");
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1 == s3: " + (s1 == s3));
    System.out.println("s3 == s4: " + (s3 == s4));
    System.out.println("s1.equals(s3): " + s1.equals(s3));
    System.out.println("s1.intern() == s3: " + (s1.intern() == s3));
    }
    }
    
   // Output:- s1 == s2: true
    //s1 == s3: false
    
    //s3 == s4: false
   // s1.equals(s3): true
   // s1.intern() == s3: true