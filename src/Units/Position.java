package Units;

import java.util.ArrayList;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getPosition(BasicHero unit) {
        return (Math.pow(x - unit.position.x, 2)) + (Math.pow(y - unit.position.y, 2));
    } // Мой вариант

    public double getDistance(ArrayList<BasicHero> team, int index) {
        return Math.sqrt(Math.pow(x - team.get(index).position.x, 2)) + (Math.pow(y - team.get(index).position.y, 2));
    } // С семинара

}
