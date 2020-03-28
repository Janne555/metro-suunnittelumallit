package state;

public class SecondLevelWizard implements Wizard {
  @Override
  public Wizard levelUp() {
    System.out.println("Player hit level 3");
    return new ThirdLevelWizard();
  }

  @Override
  public void castUtilitySpell() {
    System.out.println("Cast utility spell: Color Spray");
  }

  @Override
  public void castAttackSpell() {
    System.out.println("Cast attack spell: Magic Missile");
  }
}