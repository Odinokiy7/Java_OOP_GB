package Units;

import java.util.ArrayList;

// Крестьянин
public class Krestianin extends BasicHero {

    protected float attack;
    protected float protection;
    protected int delivery;

    public Krestianin(float hp, int speed, int damage, int x, int y, float attack, float protection, int delivery) {
        super(hp, speed, damage, x, y);
        this.attack = attack;
        this.protection = protection;
        this.delivery = delivery;
    }

    @Override
    public String getName() {
        return "Крестьянин";
    }

    @Override
    public String getInfo() {
        return String.format("Крестьянин - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Доставка: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.delivery, this.getClass().getSimpleName());
    }

    @Override
    public void String(ArrayList<BasicHero> team) {
        System.out.println("Крестьянин принёс запасы");
    }

    @Override
    public String toString() {
        return "Крестьянин: ";
    }

    public float getAttack() {
        return attack;
    }

    public float getProtection() {
        return protection;
    }

    public int getDelivery() {
        return delivery;
    }
}
