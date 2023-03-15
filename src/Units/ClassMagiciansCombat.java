package Units;

public abstract class ClassMagiciansCombat extends BasicHero implements UnitInterface {
    protected int spells;

    public ClassMagiciansCombat(float hp, int speed, int damage, int spell) {
        super(hp, speed, damage);
        this.spells = spell;
    }

}
