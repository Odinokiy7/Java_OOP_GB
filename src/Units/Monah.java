package Units;

import java.util.ArrayList;

// Монах
public class Monah extends ClassMagiciansCombat {

    public Monah(float hp, int speed, int damage, int x, int y, float attack, float protection, int spells) {
        super(hp, speed, damage, x, y, attack, protection, spells);
    }

    @Override
    public String getInfo() {
        return String.format("Монах - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Магия: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Монах отработал");
    }

    @Override
    public String toString() {
        return "Монах: ";
    }

}
