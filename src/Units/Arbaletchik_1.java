package Units;

// Арбалетчик
public class Arbaletchik_1 extends ClassRangedCombat {
    protected int arrows;

    public Arbaletchik_1() {
        super(100, 10, 5);
        this.arrows = 20;
    }

    @Override
    public String getInfo() {
        return String.format("Арбалетчик - Hp: %f Speed: %d Damage: %s Arrows: %d",
                this.hp, this.speed, this.damage, this.arrows, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Арбалетчик выстрелил";
    }

}
