package VerkhovnaRada;

import java.util.ArrayList;
import java.util.Scanner;

public class Faction {
    private String nameFaction;
    private static ArrayList<Deputy> deputies = new ArrayList<>();

     public static void addDeputy(){
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Додати депутата, введіть прізвище");
        strings.add(sc.nextLine());
        System.out.println("Введіть ім'я ");
        strings.add(sc.nextLine());
        System.out.println("Введіть вік");
        strings.add(sc.nextLine());
        System.out.println(strings);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Бере хадар? true - yes , false - no");
        boolean grafter = sc1.nextBoolean();
        Deputy deputy = new Deputy();
        if (grafter) {
            deputy.giveBribe();
        }
    }

    public static void removeDeputy(){
        ArrayList<String> strings1 = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        strings1.remove(sc1.nextLine());
        System.out.println(strings1);
    }



}
