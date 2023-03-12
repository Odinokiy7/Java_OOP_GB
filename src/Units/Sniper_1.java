package Units;

// Снайпер
public class Sniper_1 extends Shooters_1{
    public Sniper_1(float hp, int speed, int damage, int ammunition) {
        super(hp, speed, damage, ammunition);
    }

    public String getInfo() {
        return String.format("Снайпер - Hp: %f Speed: %d Damage: %s Ammunitions: %d",
                this.hp, this.speed, this.damage, this.ammunitions, this.getClass().getSimpleName());
    }
}
