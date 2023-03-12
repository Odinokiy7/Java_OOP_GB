package Units;

// Арбалетчик
public class Arbaletchik_1 extends Shooters_1 {
    public Arbaletchik_1(float hp, int speed, int damage, int ammunition) {
        super(hp, speed, damage, ammunition);
    }

    public String getInfo() {
        return String.format("Арбалетчик - Hp: %f Speed: %d Damage: %s Ammunitions: %d",
                this.hp, this.speed, this.damage, this.ammunitions, this.getClass().getSimpleName());
    }
}
