package Units;

// Монах
public class Monah_2 extends ClassMagiciansCombat {
    public Monah_2() {
        super(100, 10, 8, 8);
    }

    @Override
    public String getInfo() {
        return String.format("Монах - Hp: %f Speed: %d Damage: %s Spells: %d",
                this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Монах отработал";
    }

}
