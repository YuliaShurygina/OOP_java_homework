package Game;

public class Crossbower extends BaseHero {

  public Crossbower() {
    name = "Crossbower";
    attack = 6;
    protection = 3;
    shots = 16;
    damage[0] = 2;
    damage[1] = 3;
    health = 10;
    speed = 4;
    delivery = false;
    magic = false;
    status = true;
  }

  public Crossbower(String name, int health) {
    super(name, health);
  }

  public Crossbower(String name) {
    super(name);
  }
}
