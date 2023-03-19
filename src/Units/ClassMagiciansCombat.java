package Units;

public abstract class ClassMagiciansCombat extends BasicHero implements UnitInterface {
    protected float attack;
    protected float protection;
    protected int spells;

    public ClassMagiciansCombat(float hp, int speed, int damage, float attack, float protection, int spells) {
        super(hp, speed, damage);
        this.attack = attack;
        this.protection = protection;
        this.spells = spells;
    }

    public float getAttack() {
        return attack;
    }

    public float getProtection() {
        return protection;
    }

    public int getSpells() {
        return spells;
    }
}
