package Units;

public abstract class ClassCloseCombat extends BasicHero implements UnitInterface {
    protected int hit;

    public ClassCloseCombat(float hp, int speed, int damage, int hit) {
        super(hp, speed, damage);
        this.hit = hit;
    }

}
