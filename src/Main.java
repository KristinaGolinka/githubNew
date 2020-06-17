import java.util.*;

public  class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Person, List<Animal>> map = null;
        ZooClub zooClub = new ZooClub();

        boolean start = true;
        while (start) {


            System.out.println("Введіть 1, щоб додати учасника клубу");
            System.out.println("Введіть 2, щоб додати тваринку до учасника клубу");
            System.out.println("Введіть 3, щоб видалити тваринку з учасника клубу");
            System.out.println("Введіть 4, щоб видалити учасника клубу");
            System.out.println("Введіть 5, щоб видалити конкретну тваринку зі всіх власників");
            System.out.println("Введіть 6, щоб вивести на екран зооклуб");
            System.out.println("Введіть 7, щоб вийти з програми");

            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("Введіть ім'я користувача");
                    String name = sc.nextLine();
                    System.out.println("Введіть вік учасника");
                    int age = sc.nextInt();
                    if (map.containsKey(new Person(name, age))) {
                        System.out.println("Такий учасник вже існує");
                    } else {
                        map.put(new Person(name, age), new ArrayList<>());
                    }
                }
                case 2: {
                    System.out.println("Введіть ім'я тваринки");
                    String name = sc.nextLine();
                    System.out.println("Введіть тип тваринки");
                    String type = sc.nextLine();
                    if (map.containsKey(new Animal(name, type))) {
                        System.out.println("Така тваринка вже існує");
                    }
                }
                case 3: {
                    System.out.println("Введіть ім'я тваринки");
                    String name = sc.nextLine();
                    System.out.println("Введіть тип тваринки");
                    String type = sc.nextLine();
                    Animal animal = new Animal(name, type);
                    map.get(animal).remove(map.get(animal).indexOf(animal));
                    System.out.println("Тваринку видалено");
                }
                case 4: {
                    System.out.println("Введіть ім'я користувача");
                    String name = sc.nextLine();
                    System.out.println("Введіть вік учасника");
                    int age = sc.nextInt();
                    Person person = new Person(name, age);
                    map.remove(person);
                    System.out.println("Учасника видалено");
                }
                case 7: {
                    start = false;
                    break;
                }


            }
        }
    }
}





