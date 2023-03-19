package Units;

public abstract class ClassRangedCombat extends BasicHero implements UnitInterface {
    protected float attack;
    protected float protection;
    protected int shots;

    public ClassRangedCombat(float hp, int speed, int damage, float attack, float protection, int shots) {
        super(hp, speed, damage);
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
    }

    public float getAttack() {
        return attack;
    }

    public float getProtection() {
        return protection;
    }

    public int getShots() {
        return shots;
    }
}
