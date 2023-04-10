package Units;

import java.util.ArrayList;

// Крестьянин
public class Krestianin extends BasicHero {

    protected int delivery;

    public Krestianin(int x, int y) {
        super(1, 3, 1, 1, 1, "Крестьянин" , x, y);
//        this.delivery = 1;
    }

    @Override
    public String getName() {
        return "Крестьянин";
    }

//    @Override
//    public String getInfo() {
//        return String.format("Крестьянин - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Доставка: %d",
//                this.attack, this.protection, this.hp, this.speed, this.damage, this.delivery, this.getClass().getSimpleName());
//    }

}
