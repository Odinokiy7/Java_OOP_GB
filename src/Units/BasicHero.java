package Units;

import java.util.ArrayList;

public abstract class BasicHero implements BasicHeroInterface {
    protected float hp;
    protected float maxHp;
    protected int speed;
    protected int damage;
    protected int attack;
    protected int protection;
    protected Position position;
    protected String state;

    public BasicHero(float hp, int speed, int damage, int x, int y) {
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.attack = attack;
        this.protection = protection;
        position = new Position(x, y);
        state = "Stand";
    }

    public String getName() {
        return "Базовый воин";
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> whiteSide) {
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t ",
                attack, protection, (int) hp * 100 / maxHp, damage);
        return outStr;
    }

//    @Override
//    public String getInfo() {
//        return String.format("Базовый воин - Здоровье: %.1f Скорость: %d Урон: %d",
//                this.hp, this.speed, this.damage, this.getClass().getSimpleName());
//    }

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

    public Position getPosition() {
        return position;
    }
}
