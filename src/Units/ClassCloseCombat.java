package Units;

public abstract class ClassCloseCombat extends BasicHero implements UnitInterface {
    protected float attack;
    protected float protection;

    public ClassCloseCombat(float hp, int speed, int damage, float attack, float protection) {
        super(hp, speed, damage);
        this.attack = attack;
        this.protection = protection;
    }

    public float getAttack() {
        return attack;
    }

    public float getProtection() {
        return protection;
    }

}
