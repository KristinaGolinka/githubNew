public class Car {
    private String model;
    private int creationYear;

    public Car() {
    }
    private Car(String model, int creationYear) {
        this.model = model;
        this.creationYear = creationYear;
    }

    public void model (String a) {
        this.model = a;
    }

    public void creationYear(int b) {
        this.creationYear = b;
    }



}
