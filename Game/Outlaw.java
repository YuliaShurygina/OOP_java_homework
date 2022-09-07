package Game;

public class Outlaw extends BaseHero {

  public Outlaw() {
    name = "Outlaw";
    attack = 8;
    protection = 3;
    shots = 0;
    damage[0] = 2;
    damage[1] = 4;
    health = 10;
    speed = 6;
    delivery = false;
    magic = false;
    status = true;
  }

  public Outlaw(String name, int health) {
    super(name, health);
  }

  public Outlaw(String name) {
    super(name);
  }
}
