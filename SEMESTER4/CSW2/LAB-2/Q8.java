interface Vehicle {
    void accelerate();
    void brake();
}

class Car implements Vehicle {
    
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    
    public void brake() {
        System.out.println("Car is braking.");
    }

    
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed " + speed + " km/h for " + duration + " seconds.");
    }
}


class Bicycle implements Vehicle {
    
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method Overloading
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed " + speed + " km/h for " + duration + " seconds.");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // Testing overridden methods
        car.accelerate();
        car.brake();

        bicycle.accelerate();
        bicycle.brake();

        // Testing method overloading
        car.accelerate(60);
        car.accelerate(80, 10);

        bicycle.accelerate(20);
        bicycle.accelerate(30, 5);
    }
}

public class Q8 {

}
