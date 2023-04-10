package Units;

// Арбалетчик
public class Arbaletchik extends ClassRangedCombat {

    public Arbaletchik(int x, int y) {
        super(10, 4, 2, 3, 3, "Арбалетчик", x, y);
    }

    @Override
    public String getName() {
        return "Арбалетчик";
    }

}
