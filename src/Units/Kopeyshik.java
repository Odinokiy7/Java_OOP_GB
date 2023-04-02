package Units;

import java.util.ArrayList;

// Копейщик
public class Kopeyshik extends ClassCloseCombat {

    public Kopeyshik(float hp, int speed, int damage, int x, int y, float attack, float protection) {
        super(hp, speed, damage, x, y, attack, protection);
    }

    @Override
    public String getInfo() {
        return String.format("Копейщик - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Копейщик нанес удар!");
    }

    @Override
    public String toString() {
        return "Копейщик: ";
    }

}
