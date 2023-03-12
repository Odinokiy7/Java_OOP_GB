package Units;

// Разбойник
public class Razboynik_3 extends Warriors_3 {

    public Razboynik_3(float hp, int speed, int damage, int hit) {
        super(hp, speed, damage, hit);
    }

    public String getInfo() {
        return String.format("Разбойник - Hp: %f Speed: %d Damage: %s Hits: %d",
                this.hp, this.speed, this.damage, this.hits, this.getClass().getSimpleName());
    }
}
