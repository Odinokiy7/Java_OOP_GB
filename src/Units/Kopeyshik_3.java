package Units;

// Копейщик
public class Kopeyshik_3 extends ClassCloseCombat {
    public Kopeyshik_3() {
        super(100, 10, 8, 15);
    }

    @Override
    public String getInfo() {
        return String.format("Копейщик - Hp: %f Speed: %d Damage: %s Hit: %d",
                this.hp, this.speed, this.damage, this.hit, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Копейщик нанёс удар";
    }

}
