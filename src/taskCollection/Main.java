package taskCollection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Engine engine1 = new Engine("pp09", 2.0, 100);
//        Engine engine2 = new Engine("ss56", 2.2, 200);
//        CarWheel wheel1 = new CarWheel("sava", 15.6);
//        CarWheel wheel2 = new CarWheel("michelin", 17.0);
//
//        Auto auto1 = new Auto("ford", 2015, "vs0992ak", "red", engine1, wheel1);
//        Auto auto2 = new Auto("mazda", 2009, "vs7777sk", "silver", engine2, wheel2);
//        Auto auto3 = new Auto("toyota", 2019, "vs1111sk", "silver", engine1, wheel2);
//        Set <Auto> autoTreeSet=new TreeSet<>();
//        autoTreeSet.add(auto1);
//        autoTreeSet.add(auto2);
//        autoTreeSet.add(auto3);
//        System.out.println(autoTreeSet);
//        System.out.println("*****************************");
//
//        for (Auto auto : autoTreeSet) {
//            if (auto.getYear()<2015){
//                auto.getCarWheel().setDiametr(auto.getCarWheel().getDiametr()-1);
//            }
//        }
//        System.out.println(autoTreeSet);
//        System.out.println("*****************************");
//        for (Auto auto : autoTreeSet) {
//            if (auto.getYear()>=2015){
//                auto.setColor("green");
//            }
//        }
//        System.out.println(autoTreeSet);
//        System.out.println("*****************************");wh
        ZooClub fish = new ZooClub(new Person("ivan", 70), new Pet("bulka"), new Pet("akula"));
        System.out.println(fish);

        ZooClub birds = new ZooClub();
        birds.addX(new Person("masha", 23), new Pet("kakadu"), new Pet("popugay"));
        System.out.println(birds);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1) додати учасника в клуб;\n" +
                    "2) додати тваринку до учасника клубу.\n" +
                    "3) видалити тваринку з власника.\n" +
                    "4) видалити учасника клубу.\n" +
                    "5) видалити конкретну тваринку з усіх власників.\n" +
                    "6) вивести на екран зооклуб.\n" +
                    "7) вихід");
            System.out.println("Зробіть вибір");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
            }


//
        }
    }
}
