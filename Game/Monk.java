package Game;

public class Monk extends BaseHero {

  public Monk() {
    name = "Monk";
    attack = 12;
    protection = 7;
    shots = 0;
    damage[0] = -4;
    damage[1] = -4;
    health = 30;
    speed = 5;
    delivery = false;
    magic = true;
    status = true;
  }

  public Monk(String name, int health) {
    super(name, health);
  }

  public Monk(String name) {
    super(name);
  }
}
