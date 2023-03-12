package Units;

// Колдун
public class Koldun_2 extends Magicians_2 {
    public Koldun_2(float hp, int speed, int damage, int spell) {
        super(hp, speed, damage, spell);
    }

    public String getInfo() {
        return String.format("Колдун - Hp: %f Speed: %d Damage: %s Spells: %d",
                this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }
}
