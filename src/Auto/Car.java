package Auto;

public class Car extends Vehicle {

    private int mileage;

    public Car(String model, String color) {
        super(model, color);
    }

    public Car(String model, String color, int mileage) {
        super(model, color);
        this.mileage = mileage;
    }

    public void drive(){
        System.out.println("I am a car");
    }
}

