package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BasicHero implements BasicHeroInterface {

    protected static Random r = new Random();

    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int damage;
    protected int maxDamage;
    protected int protection;
    protected final String NAME;
    protected Position position;

    public BasicHero(int hp, int speed, int damage, int maxDamage, int protection, String name, int x, int y) {
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.protection = protection;
        NAME = name;
        position = new Position(x, y);
    }

//    public BasicHero(float hp, int speed, int damage, int x, int y) {
//        this.hp = hp;
//        this.maxHp = hp;
//        this.speed = speed;
//        this.damage = damage;
//        this.attack = attack;
//        this.protection = protection;
//        position = new Position(x, y);
//        state = "Stand";
//    }

    public String getName() {
        return "Базовый воин";
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> friends) {
    }

//    @Override
//    public String getInfo() {
//        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t ",
//                attack, protection, (int) hp * 100 / maxHp, damage);
//        return outStr;
//    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t        ", 0, 0, protection, (int) hp * 100 / maxHp, damage);
        return outStr;
    }

    public void attack(BasicHero target, int damage, int maxDamage) {
        int causedDamage;
        if (damage < target.protection) causedDamage = damage;
        else {
            switch (new Random().nextInt(4)) {
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
            }
        }
        target.getDamage(causedDamage);
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
    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public Position getPosition() {
        return position;
    }

}
