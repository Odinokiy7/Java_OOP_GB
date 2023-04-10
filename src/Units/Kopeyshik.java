package Units;

// Копейщик
public class Kopeyshik extends ClassCloseCombat {

    public Kopeyshik(int x, int y) {
        super(10, 4, 1, 3, 5, "Копейщик", x, y);
    }

    @Override
    public String getName() {
        return "Копейщик";
    }

}
