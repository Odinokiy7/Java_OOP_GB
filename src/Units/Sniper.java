package Units;

// Снайпер
public class Sniper extends ClassRangedCombat {

    public Sniper(int x, int y) {
        super(15, 9, 8, 8, 10, "Снайпер", x, y);
    }

    @Override
    public String getName() {
        return "Снайпер";
    }

}
