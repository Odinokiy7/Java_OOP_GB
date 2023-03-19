package Units;

// Снайпер
public class Sniper extends ClassRangedCombat {

    public Sniper() {
        super(15, 9, 8, 12, 10, 32);
    }

    @Override
    public String getInfo() {
        return String.format("Снайпер - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Стрелы: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.shots, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Снайпер выстрелил";
    }

}
