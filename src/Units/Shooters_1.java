package Units;

public class Shooters_1 extends BasicHero {
    protected int ammunitions;

    public Shooters_1(float hp, int speed, int damage, int ammunition) {
        super(hp, speed, damage);
        this.ammunitions = ammunition;
    }
}
