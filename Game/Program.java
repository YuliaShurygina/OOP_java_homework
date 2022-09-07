package Game;

import java.util.ArrayList;
import java.util.List;

public class Program {

  public static void main(String[] args) {
    List<Magician> allMagicians = new ArrayList<>();
    List<Crossbower> allCrossbowers = new ArrayList<>();
    List<Monk> allMonks = new ArrayList<>();
    List<Outlaw> allOutlaws = new ArrayList<>();
    List<Peasant> allPeasants = new ArrayList<>();
    List<Shafter> allShafters = new ArrayList<>();
    List<Sniper> allSnipers = new ArrayList<>();
    int i = 0;
    while (i < 5) {
      allMagicians.add(new Magician());
      allCrossbowers.add(new Crossbower("Hero"));
      allMonks.add(new Monk("Monk", 12));
      allOutlaws.add(new Outlaw());
      allPeasants.add(new Peasant("Peasant", 3));
      allShafters.add(new Shafter("Shafter"));
      allSnipers.add(new Sniper());
      i++;
    }
    for (Magician magician : allMagicians) {
      System.out.println(magician.returnCondition());
    }
    for (Crossbower crossbower : allCrossbowers) {
      System.out.println(crossbower.returnCondition());
    }
    for (Monk monk : allMonks) {
      System.out.println(monk.returnCondition());
    }
    for (Outlaw outlaw : allOutlaws) {
      System.out.println(outlaw.returnCondition());
    }
    for (Peasant peasant : allPeasants) {
      System.out.println(peasant.returnCondition());
    }
    for (Shafter shafter : allShafters) {
      System.out.println(shafter.returnCondition());
    }
    for (Sniper sniper : allSnipers) {
      System.out.println(sniper.returnCondition());
    }
  }
}
