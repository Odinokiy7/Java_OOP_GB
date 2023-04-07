package Units;

import java.util.ArrayList;

// Колдун
public class Koldun extends ClassMagiciansCombat {

    public Koldun(float hp, int speed, int damage, int x, int y, float attack, float protection, int spells) {
        super(hp, speed, damage, x, y, attack, protection, spells);
    }

    @Override
    public String getName() {
        return "Колдун";
    }

    @Override
    public String getInfo() {
        return String.format("Колдун - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Магия: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Колдун отработал!");
    }

    @Override
    public String step() {
        return "Колдун отработал";
    }

    @Override
    public String toString() {
        return "Колдун: ";
    }

}
