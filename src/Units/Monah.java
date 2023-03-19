package Units;

// Монах
public class Monah extends ClassMagiciansCombat {

    public Monah() {
        super(30, 5, 4, 12, 7, 1);
    }

    @Override
    public String getInfo() {
        return String.format("Монах - Атака: %.1f Защита %.1f Здоровье: %.1f Скорость: %d Урон: %d Магия: %d",
                this.attack, this.protection, this.hp, this.speed, this.damage, this.spells, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Монах отработал";
    }

}
