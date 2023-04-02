import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static final int UNIT = 10;
    public static void main(String[] args) {

        ArrayList<BasicHero> list = new ArrayList<>();
        ArrayList<BasicHero> list2 = new ArrayList<>();

//        for (int i = 0; i < UNIT; i++) {
//            switch (new Random().nextInt(4)) {
//                case 0:
//                    list.add(new Krestianin());
//                    break;
//                case 1:
//                    list.add(new Razboynik());
//                    break;
//                case 2:
//                    list.add(new Sniper());
//                    break;
//                case 3:
//                    list.add(new Koldun());
//                    break;
//            }
//
//            switch (new Random().nextInt(4)) {
//                case 0:
//                    list2.add(new Krestianin());
//                    break;
//                case 1:
//                    list2.add(new Kopeyshik());
//                    break;
//                case 2:
//                    list2.add(new Arbaletchik());
//                    break;
//                case 3:
//                    list2.add(new Monah());
//                    break;
//            }
//
//        }

//        System.out.println("Команда 1: ");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getInfo());
//        }
//
//        System.out.println("________________");
//
//        System.out.println("Команда 2: ");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list2.get(i).getInfo());
//        }

//
//        ArrayList<BasicHero> allUnits = new ArrayList<>();
//        allUnits.addAll(list);
//        allUnits.addAll(list2);
//        allUnits.sort(new Comparator<BasicHero>() {
//            @Override
//            public int compare(BasicHero o1, BasicHero o2) {
//                if (o1.getSpeed() == o2.getSpeed()) {
//                    return 0;
//                } else if (o1.getSpeed() > o2.getSpeed()) {
//                    return 1;
//                } else return -1;
//            }
//        });
//
//        for (int i = 0; i < allUnits.size(); i++) {
//            System.out.println(allUnits.get(i).getInfo());
//        }

    }

}
