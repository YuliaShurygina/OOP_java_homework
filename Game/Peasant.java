package Game;

public class Peasant extends BaseHero {

  public Peasant() {
    name = "Peasant";
    attack = 1;
    protection = 1;
    shots = 0;
    damage[0] = 1;
    damage[1] = 1;
    health = 1;
    speed = 3;
    delivery = true;
    magic = false;
    status = true;
  }

  public Peasant(String name, int health) {
    super(name, health);
  }

  public Peasant(String name) {
    super(name);
  }
}
