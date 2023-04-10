package Units;

import java.util.ArrayList;

public abstract class ClassMagiciansCombat extends BasicHero implements BasicHeroInterface {

    protected int spells;

    public ClassMagiciansCombat(int hp, int speed, int damage, int maxDamage, int protection, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, protection, name, x, y);
        this.spells = spells;
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> friends) {
        if (this.spells > 0 && this.hp > 0) {
            for (BasicHero unit : friends) {
                if (unit.hp > 0 && unit.hp < unit.maxHp) {
                    this.attack(unit, this.damage, this.maxDamage);
                    if (unit.hp > unit.maxHp) {
                        unit.hp = unit.maxHp;
                    }
                    break;
                }
            }
            this.spells--;
        }
    }

}
