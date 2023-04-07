package Units;

import java.util.ArrayList;

public abstract class ClassRangedCombat extends BasicHero implements BasicHeroInterface {
    protected float attack;
    protected float protection;
    protected int shots;
    protected int maxShots;
    protected int maxDamage;

    public ClassRangedCombat(float hp, int speed, int damage, int x, int y, float attack, float protection, int shots, int maxShots) {
        super(hp, speed, damage, x, y);
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
        this.maxShots = maxShots;
        this.maxDamage = maxDamage;
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> whiteSide) {
        super.step(team, whiteSide);
    }

    //    @Override
//    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> friends) {
//        if (this.shots > 0 && this.hp > 0) {
//            System.out.println("Могу стрелять");
//            for (BasicHero unit : team) {
//                if (unit.hp > 0) {
//                    this.attack(unit, this.damage, this.maxDamage);
//                    this.shots--;
//                    break;
//                } else System.out.println("Пропустить");
//            }
//        }
//
//        System.out.println(toString());
//    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.shots);
    }

//    @Override
//    public String step(ArrayList<BasicHero> team) {
//        if (!state.equals("Die") && shots == 0);
//        return null;
//    } // Препод писал на семинаре 4 в начале

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
