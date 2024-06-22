 class UnreachableObject {
    String name;
    public UnreachableObject(String name) {
    this.name = name;
    }
    void display() {
    System.out.println("Displaying object: " + name);
    UnreachableObject u = new UnreachableObject("New Object");
    }
    protected void finalize() throws Throwable {
    System.out.println("Garbage collecting object: " + name);
    }
    }
    public class Q1 {
    static void show(String name) {
    UnreachableObject u = new UnreachableObject(name);
    u.display();
    }
    public static void main(String[] args) {
    show("Show Object");
    UnreachableObject u = null;
    System.gc();
    }
    }
   // Output:- Displaying object: Show Object
    //Displaying object: New Object
    //Garbage collecting object: Show Object