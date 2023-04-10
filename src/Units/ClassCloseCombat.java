package Units;

import java.util.ArrayList;

public abstract class ClassCloseCombat extends BasicHero implements BasicHeroInterface {

    protected int stamina;

    public ClassCloseCombat(int hp, int speed, int damage, int maxDamage, int protection, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, protection, name, x, y);
        this.stamina = stamina;
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> friends) {
        if (this.stamina > 0 && this.hp > 0) {
            BasicHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BasicHero unit : team) {
                if (this.position.getDistance(unit) < minDistance && unit.hp > 0) {
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }

            if (this.position.getDistance(target) >= 2) {
                this.position.direction(target.position, friends);
            } else if (target.hp > 0) {
                this.attack(target, this.damage, this.maxDamage);
                this.stamina--;
            }

        }
    }

}
