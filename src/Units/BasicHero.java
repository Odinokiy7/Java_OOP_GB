package Units;

public abstract class BasicHero implements UnitInterface {
    protected float hp;
    protected int speed;
    protected int damage;

    public BasicHero(float hp, int speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public String getInfo() {
        return String.format("Базовый воин - Hp: %f Speed: %d Damage: %d ",
                this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Шаг - Базовый воин";
    }

}
