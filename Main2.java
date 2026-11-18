class Vehicle
{
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand;

    Car(String b1, String b2) {
        super(b1);
        brand = b2;
    }

    @Override
    void display() {
        super.display();

        System.out.println("Car Brand: " + brand);
        System.out.println("Parent Brand: " + super.brand);
    }
}

public class Main2
{
    public static void main(String[] args) {

        Car c = new Car("Toyota", "BMW");

        c.display();
    }
}