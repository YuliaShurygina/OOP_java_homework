package Game;

public class Magician extends BaseHero {

  public Magician() {
    super.name = "Magician";
    attack = 17;
    protection = 12;
    shots = 0;
    damage[0] = -5;
    damage[1] = -5;
    health = 30;
    speed = 9;
    delivery = false;
    magic = true;
    status = true;
  }

  public Magician(String name, int health) {
    super(name, health);
  }

  public Magician(String name) {
    super(name);
  }
}
