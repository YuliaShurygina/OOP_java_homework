package Game;

public class Sniper extends BaseHero {

  public Sniper() {
    name = "Sniper";
    attack = 12;
    protection = 10;
    shots = 32;
    damage[0] = 8;
    damage[1] = 10;
    health = 15;
    speed = 9;
    delivery = false;
    magic = false;
    status = true;
  }

  public Sniper(String name, int health) {
    super(name, health);
  }

  public Sniper(String name) {
    super(name);
  }
}
