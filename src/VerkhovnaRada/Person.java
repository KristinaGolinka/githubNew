package VerkhovnaRada;

public class Person {
    private int weight;
    private int height;


    public Person() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "VerkhovnaRada.ZooClub.Person{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
