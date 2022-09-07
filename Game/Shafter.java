package Game;

public class Shafter extends BaseHero {

  public Shafter() {
    name = "Shafter";
    attack = 4;
    protection = 5;
    shots = 0;
    damage[0] = 1;
    damage[1] = 3;
    health = 10;
    speed = 4;
    delivery = false;
    magic = false;
    status = true;
  }

  public Shafter(String name, int health) {
    super(name, health);
  }

  public Shafter(String name) {
    super(name);
  }
}
