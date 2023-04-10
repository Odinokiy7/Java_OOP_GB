package Units;

// Монах
public class Monah extends ClassMagiciansCombat {

    public Monah(int x, int y) {
        super(30, 5, -4, -4, 7, "Монах", x, y);
    }

    @Override
    public String getName() {
        return "Монах";
    }

}
