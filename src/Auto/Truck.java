package Auto;

public class Truck extends Vehicle {

    private int price;

    public Truck(String model, String color) {
        super(model, color);
    }

    public Truck(String model, String color, int price) {
        super(model, color);
        this.price = price;
    }
    public void drive() {
        System.out.println("I am a truck");
    }


}
