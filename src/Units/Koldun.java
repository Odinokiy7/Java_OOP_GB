package Units;

// Колдун
public class Koldun extends ClassMagiciansCombat {

    public Koldun(int x, int y) {
        super(30, 9, -5, -5, 12, "Колдун", x, y);
    }

    @Override
    public String getName() {
        return "Колдун";
    }

}
