import ZooClub.Animal;
import ZooClub.Person;

import java.util.*;


public  class  Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Map<Person, List<Animal>> map;
        map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean start = true;
        while (start) {
            System.out.println("Натисніть 1, щоб додати учасника до клубу");
            System.out.println("Натисніть 2, щоб додати тваринку до учасника клубу");
            System.out.println("Натисніть 3, щоб видалити тваринку з учасника клубу");
            System.out.println("Натисніть 4, щоб видалити учасника клубу");
            System.out.println("Натисніть 5, щоб видалити конкретну тваринку зі всіх учасників");
            System.out.println("Натисніть 6, щоб вивести на екран Зооклуб");
            System.out.println("Натисніть 7, щоб вийти з програми");
            switch (sc.next()) {
                case "1": {
                    System.out.println("Введіть ім'я користувача:");
                    String name = sc.next();
                    System.out.println("Введіть вік учасника");
                    int age = sc.nextInt();
                    if (map.containsKey(new Person(name, age))) {
                        System.out.println("Такий учасник вже існує");
                    } else {
                        map.put(new Person(name, age), new ArrayList<>());
                    }
                }
                case "2": {
                    System.out.println("Введіть ім'я учасника:");
                    String name = sc.next();
                    System.out.println("Введіть вік учасника");
                    int age = sc.nextInt();
                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        System.out.println("Введіть ім'я тваринки");
                        String nickname = sc.next();
                        System.out.println("Введіть вид тваринки");
                        String type = sc.next();
                        map.get(person).add(new Animal(nickname, type));
                    } else {
                        System.out.println("Такого учасника не існує!");
                    }

                }
                case "3": {
                    System.out.println("Введіть ім'я учасника:");
                    String name = sc.next();
                    System.out.println("Введіть вік учасника");
                    int age = sc.nextInt();
                    Person person = new Person(name, age);
                    if (map.containsKey(person)) {
                        System.out.println("Введіть ім'я тваринки");
                        String nickname = sc.next();
                        System.out.println("Введіть вид тваринки");
                        String type = sc.next();
                        map.get(person).remove(new Animal(nickname, type));
                    } else {
                        System.out.println("Тваринку видалено");
                    }
                }
                case "4": {
                    System.out.println("Введіть учасника");
                    String name = sc.next();
                    Person person = new Person();
                    if (map.containsKey(person)) {
                        map.remove(person);
                    }
                }
                case "5": {
                    System.out.println("Введіть учасника");
                    String name = sc.next();
                    Animal animal = new Animal();
                    if (map.containsKey(animal)) {
                        map.remove(animal);

                    }
                }
                case "7": {
                    start = false;
                    break;
                }


            }

        }
    }
}



