package Units;

// Копейщик
public class Kopeyshik extends ClassCloseCombat {

    public Kopeyshik() {
        super(10, 4, 2, 4, 5);
    }

    @Override
    public String getInfo() {
        return String.format("Копейщик - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Копейщик нанёс удар";
    }

}
