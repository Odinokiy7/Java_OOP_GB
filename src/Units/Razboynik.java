package Units;

// Разбойник
public class Razboynik extends ClassCloseCombat {

    public Razboynik() {
        super(10, 6, 3, 8, 3);
    }

    @Override
    public String getInfo() {
        return String.format("Разбойник - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Разбойник нанёс удар";
    }

}
