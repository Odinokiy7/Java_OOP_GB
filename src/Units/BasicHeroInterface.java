package Units;

import java.util.ArrayList;

public interface BasicHeroInterface {

    void step(ArrayList<BasicHero> team, ArrayList<BasicHero> friends);

    String getInfo();

}
