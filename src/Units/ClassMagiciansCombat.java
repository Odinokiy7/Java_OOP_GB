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
    public String step(ArrayList<BasicHero> team) {
        return super.step(team);
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
