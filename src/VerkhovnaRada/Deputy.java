package VerkhovnaRada;

import java.util.ArrayList;
import java.util.Scanner;

public class Deputy extends Person {
    private String surname;
    private String name;
    private int age;
    private boolean corrupt;
    private int sizeBribe;

    public Deputy(String surname, String name, int age, boolean corrupt) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.corrupt = corrupt;
    }
    public void giveBribe(){
        Scanner s = new Scanner(System.in);
        if (corrupt = false){
            System.out.println("Цей депутат не бере хабарів");
        }else {
            System.out.println("Введіть суму хабаря");
            int bribe = s.nextInt();
            if (bribe > 5000) {
                System.out.println("Поліція увязнить депутата");
            } else {
                sizeBribe = bribe;
            }
        }
    }




    public  static void clearAllDeputy(){
        ArrayList<Deputy> deputies = new ArrayList<>();
        deputies.removeAll(deputies);
        System.out.println(deputies);
    }

    public Deputy() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCorrupt() {
        return corrupt;
    }

    public void setCorrupt(boolean corrupt) {
        this.corrupt = corrupt;
    }

    public int getSizeBribe() {
        return sizeBribe;
    }

    public void setSizeBribe(int sizeBribe) {
        this.sizeBribe = sizeBribe;
    }

    @Override
    public String toString() {
        return "VerkhovnaRada.Deputy{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", corrupt=" + corrupt +
                ", sizeBribe=" + sizeBribe +
                '}';
    }

}













