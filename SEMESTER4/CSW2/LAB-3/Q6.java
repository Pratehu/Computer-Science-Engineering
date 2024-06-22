class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        // Create a unique ID based on object's fields
        return name.hashCode() + color.hashCode() + type.hashCode();
    }
}

public class Q6 {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", "Yellow", "Wild");
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");

        System.out.println("Hash code for Lion: " + lion.hashCode());
        System.out.println("Hash code for Dog: " + dog.hashCode());
        System.out.println("Hash code for Cat: " + cat.hashCode());
    }
}