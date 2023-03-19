package Units;

// Колдун
public class Koldun extends ClassMagiciansCombat {

    public Koldun() {
        super(30, 9, 5, 17, 12, 1);
    }

    @Override
    public String getInfo() {
        return String.format("Колдун - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Магия: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Колдун отработал";
    }

}
