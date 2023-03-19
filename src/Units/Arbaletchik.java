package Units;

// Арбалетчик
public class Arbaletchik extends ClassRangedCombat {

    public Arbaletchik() {
        super(10, 4, 2, 6, 3, 16);
    }

    @Override
    public String getInfo() {
        return String.format("Арбалетчик - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Стрелы: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.shots, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Арбалетчик выстрелил";
    }

}
