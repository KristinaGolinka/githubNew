package Auto;

public class Motorcycle extends Vehicle {

    private int wheel;

    public Motorcycle(String model, String color) {
        super(model, color);
    }

    public Motorcycle(String model, String color, int wheel) {
        super(model, color);
        this.wheel = wheel;
    }
    public void drive(){
        System.out.println("I am a motorcycle");
    }



}


