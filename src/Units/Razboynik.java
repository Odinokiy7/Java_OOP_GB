package Units;

// Разбойник
public class Razboynik extends ClassCloseCombat {

    public Razboynik(int x, int y) {
        super(10, 6, 2, 4, 3, "Разбойник", x, y);
    }

    @Override
    public String getName() {
        return "Разбойник";
    }

}
