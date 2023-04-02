package Units;

import java.util.ArrayList;

public abstract class BasicHero implements BasicHeroInterface {
    protected float hp;
    protected int speed;
    protected int damage;
    protected Position position;
    protected String state;

    public BasicHero(float hp, int speed, int damage, int x, int y) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        position = new Position(x, y);
        state = "Stand";
    }

    @Override
    public String getInfo() {
        return String.format("Базовый воин - Здоровье: %.1f Скорость: %d Урон: %d",
                this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    public float getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    //    public int getDamage() {
//        return damage;
//    }
    public boolean getDamage(float dmg) {
        hp -= dmg;
        if (hp < 0) {
            hp = 0;
            return true;
        } else return false;
    }

}
