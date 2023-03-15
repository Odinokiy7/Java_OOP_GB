package Units;

// Колдун
public class Koldun_2 extends ClassMagiciansCombat {
    public Koldun_2() {
        super(100, 10, 7, 10);
    }

    @Override
    public String getInfo() {
        return String.format("Колдун - Hp: %f Speed: %d Damage: %s Spells: %d",
                this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Колдун отработал";
    }

}
