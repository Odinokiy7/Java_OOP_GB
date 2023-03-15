package Units;

// Снайпер
public class Sniper_1 extends ClassRangedCombat {
    protected int ammos;

    public Sniper_1() {
        super(100, 10, 10);
        this.ammos = 8;
    }

    @Override
    public String getInfo() {
        return String.format("Снайпер - Hp: %f Speed: %d Damage: %s Ammos: %d",
                this.hp, this.speed, this.damage, this.ammos, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Снайпер выстрелил";
    }

}
