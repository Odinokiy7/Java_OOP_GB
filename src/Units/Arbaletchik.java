package Units;

import java.util.ArrayList;

// Арбалетчик
public class Arbaletchik extends ClassRangedCombat {

    public Arbaletchik(float hp, int speed, int damage, int x, int y, float attack, float protection, int shots, int maxShots) {
        super(hp, speed, damage, x, y, attack, protection, shots, maxShots);
    }

    @Override
    public String getInfo() {
        return String.format("Арбалетчик - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Стрелы: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.shots, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Арбалетчик выпустил стрелу!");
    }

    @Override
    public String toString() {
        return "Арбалетчик: ";
    }
}
