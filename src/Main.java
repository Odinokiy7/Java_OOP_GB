import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int GANG_SIZE = 10;
    public static ArrayList<BasicHero> whiteSide = new ArrayList<>();
    public static ArrayList<BasicHero> darkSide = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Init();

        while (true) {
            Step();
            ConsoleView.view();
            sc.nextLine();
        }
    }

    public static void Init() {
        for (int i = 1; i < GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Krestianin(1, 1, 1, 1, 1, 1, 1, 1));
                    break;
                case 1:
                    whiteSide.add(new Razboynik(1, 1, 1, 1, 2, 1, 1));
                    break;
                case 2:
                    whiteSide.add(new Sniper(1, 1, 1, 1, 3, 1, 1, 1, 1));
                    break;
                case 3:
                    whiteSide.add(new Koldun(1, 1, 1, 1, 4, 1, 1, 1));
                    break;
            }

            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new Krestianin(1, 1, 1, 10, 1, 1, 1, 1));
                    break;
                case 1:
                    darkSide.add(new Kopeyshik(1, 1, 1, 10, 2, 1, 1));
                    break;
                case 2:
                    darkSide.add(new Arbaletchik(1, 1, 1, 10, 3, 1, 1, 1, 1));
                    break;
                case 3:
                    darkSide.add(new Monah(1, 1, 1, 10, 4, 1, 1, 1));
                    break;
            }

        }
    }

    public static void Step() {
        ArrayList<BasicHero> allUnits = new ArrayList<>();
        allUnits.addAll(whiteSide);
        allUnits.addAll(darkSide);
        allUnits.sort(new Comparator<BasicHero>() {
            @Override
            public int compare(BasicHero o1, BasicHero o2) {
                if (o1.getSpeed() == o2.getSpeed()) {
                    return 0;
                } else if (o1.getSpeed() > o2.getSpeed()) {
                    return 1;
                } else return -1;
            }
        });

        for (BasicHero unit : allUnits) {
            if (darkSide.contains(unit)) {
                unit.step(whiteSide, darkSide);
            } else unit.step(darkSide, whiteSide);
        }
    }

}
