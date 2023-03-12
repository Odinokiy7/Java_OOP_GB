package Units;

// Копейщик
public class Kopeyshik_3 extends Warriors_3 {
    public Kopeyshik_3(float hp, int speed, int damage, int hit) {
        super(hp, speed, damage, hit);
    }

    public String getInfo() {
        return String.format("Копейщик - Hp: %f Speed: %d Damage: %s Hits: %d",
                this.hp, this.speed, this.damage, this.hits, this.getClass().getSimpleName());
    }
}
