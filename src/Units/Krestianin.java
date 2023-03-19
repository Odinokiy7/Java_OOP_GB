package Units;

// Крестьянин
public class Krestianin extends BasicHero {

    protected float attack;
    protected float protection;
    protected int delivery;

    public Krestianin() {
        super(1, 3, 1);
        this.attack = 1;
        this.protection = 1;
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format("Крестьянин - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Доставка: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.delivery, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Крестьянин принёс запасы";
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
