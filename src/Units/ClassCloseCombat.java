package Units;

public abstract class ClassCloseCombat extends BasicHero implements BasicHeroInterface {
    protected float attack;
    protected float protection;

    public ClassCloseCombat(float hp, int speed, int damage, int x, int y, float attack, float protection) {
        super(hp, speed, damage, x, y);
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
