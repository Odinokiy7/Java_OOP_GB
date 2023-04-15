import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Init_Step {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BasicHero> whiteSide = new ArrayList<>();
    public static ArrayList<BasicHero> darkSide = new ArrayList<>();

    public static void Init() {
        for (int i = 1; i < GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Krestianin(1, i));
                    break;
                case 1:
                    whiteSide.add(new Razboynik(1, i));
                    break;
                case 2:
                    whiteSide.add(new Sniper(1, i));
                    break;
                default:
                    whiteSide.add(new Koldun(1, i));
                    break;
            }

            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new Krestianin(10, i));
                    break;
                case 1:
                    darkSide.add(new Kopeyshik(10, i));
                    break;
                case 2:
                    darkSide.add(new Arbaletchik(10, i));
                    break;
                default:
                    darkSide.add(new Monah(10, i));
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
