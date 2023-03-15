package Units;

// Крестьянин
public class Krestianin_4 extends BasicHero {
    public Krestianin_4() {
        super(50, 20, 3);
    }

    @Override
    public String getInfo() {
        return String.format("Крестианин - Hp: %f Speed: %d Damage: %s",
                this.hp, this.speed, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public String step() {
        return "Вышел крестьянин";
    }

}
