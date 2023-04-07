package Units;

import java.util.ArrayList;

public abstract class ClassCloseCombat extends BasicHero implements BasicHeroInterface {
    protected float attack;
    protected float protection;

    public ClassCloseCombat(float hp, int speed, int damage, int x, int y, float attack, float protection) {
        super(hp, speed, damage, x, y);
        this.attack = attack;
        this.protection = protection;
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

}
