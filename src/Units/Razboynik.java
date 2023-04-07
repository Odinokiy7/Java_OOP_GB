package Units;

import java.util.ArrayList;

// Разбойник
public class Razboynik extends ClassCloseCombat {

    public Razboynik(float hp, int speed, int damage, int x, int y, float attack, float protection) {
        super(hp, speed, damage, x, y, attack, protection);
    }

    @Override
    public String getName() {
        return "Разбойник";
    }

    @Override
    public String getInfo() {
        return String.format("Разбойник - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Разбойник нанес удар!");
    }

    @Override
    public String toString() {
        return "Разбойник: ";
    }

}
