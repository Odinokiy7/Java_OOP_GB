import Units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BasicHero> list = new ArrayList<>();
        ArrayList<BasicHero> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    list.add(new Arbaletchik_1());
                    break;
                case 1:
                    list.add(new Koldun_2());
                    break;
                case 2:
                    list.add(new Kopeyshik_3());
                    break;
                case 3:
                    list.add(new Krestianin_4());
                    break;
            }

            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Sniper_1());
                    break;
                case 1:
                    list2.add(new Monah_2());
                    break;
                case 2:
                    list2.add(new Razboynik_3());
                    break;
                case 3:
                    list2.add(new Krestianin_4());
                    break;
            }

        }

        System.out.println("Команда 1: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }

        System.out.println("________________");

        System.out.println("Команда 2: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list2.get(i).getInfo());
        }
    }
}
