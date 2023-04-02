package Units;

import java.util.ArrayList;

// Снайпер
public class Sniper extends ClassRangedCombat {

    public Sniper(float hp, int speed, int damage, int x, int y, float attack, float protection, int shots, int maxShots) {
        super(hp, speed, damage, x, y, attack, protection, shots, maxShots);
    }

    @Override
    public String getInfo() {
        return String.format("Снайпер - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Стрелы: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.shots, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Снайпер выстрелил!");
    }

    @Override
    public String toString() {
        return "Снайпер: ";
    }

}
