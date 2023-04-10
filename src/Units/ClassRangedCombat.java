package Units;

import java.util.ArrayList;

public abstract class ClassRangedCombat extends BasicHero implements BasicHeroInterface {
    protected int shots;

    public ClassRangedCombat(int hp, int speed, int damage, int maxDamage, int protection, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, protection, name, x, y);
        this.shots = shots;
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> friends) {
        if (this.shots > 0 && this.hp > 0) {

            BasicHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BasicHero unit : team) {
                if (this.position.getDistance(unit) < minDistance && unit.hp > 0) {
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }
            System.out.printf("%s выбрал %s\n", this.getClass().getSimpleName(), target.getClass().getSimpleName());
            this.attack(target, this.damage, this.maxDamage);
            this.shots--;
        }

        for (BasicHero unit : friends) {
            if (unit instanceof Krestianin) {
                this.shots++;
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.shots);
    }

}
