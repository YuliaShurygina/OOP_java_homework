package Game;

public abstract class BaseHero implements Actions {

  protected String name = "Hero";
  protected int attack;
  protected int protection;
  protected int shots;
  protected int[] damage = new int[2];
  protected int health;
  protected int speed;
  protected boolean delivery;
  protected boolean magic;
  protected boolean status;

  protected BaseHero() {
    name = "Base";
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

  protected BaseHero(String name, int health) {
    this.name = name;
    this.health = health;
  }

  protected BaseHero(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String returnCondition() {
    return String.format(
      "Герой с именем: %s, остаток здоровья: %d",
      name,
      health
    );
  }

  public float hit() {
    return 0;
  }

  public float getHit(float damage) {
    return 0;
  }

  public boolean status() {
    return false;
  }

  public boolean changePosition() {
    return false;
  }
}
