package Auto;

import java.sql.SQLOutput;

public  class Vehicle {
    private  String model;
    private  String color;

    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public void drive(){
        System.out.println("I am vehicle");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
