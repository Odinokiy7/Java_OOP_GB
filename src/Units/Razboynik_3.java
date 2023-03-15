package Units;

// Разбойник
public class Razboynik_3 extends ClassCloseCombat {

    public Razboynik_3() {
        super(100, 10, 6, 15);
    }

    @Override
    public String getInfo() {
        return String.format("Разбойник - Hp: %f Speed: %d Damage: %s Hit: %d",
                this.hp, this.speed, this.damage, this.hit, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Разбойник нанёс удар";
    }

}
