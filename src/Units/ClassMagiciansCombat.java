package Units;

import java.util.ArrayList;

public abstract class ClassMagiciansCombat extends BasicHero implements BasicHeroInterface {
    protected float attack;
    protected float protection;
    protected int spells;

    public ClassMagiciansCombat(float hp, int speed, int damage, int x, int y, float attack, float protection, int spells) {
        super(hp, speed, damage, x, y);
        this.attack = attack;
        this.protection = protection;
        this.spells = spells;
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> whiteSide) {
        super.step(team, whiteSide);
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

    public abstract String step();
}
