package state;

public class FirstLevelWizard implements Wizard {
  @Override
  public Wizard levelUp() {
    System.out.println("Player hit level 2");
    return new SecondLevelWizard();
  }

  @Override
  public void castUtilitySpell() {
    System.out.println("Cast utility spell: Acid Splash");
  }

  @Override
  public void castAttackSpell() {
    System.out.println("Cast attack spell: Shocking Grasp");
  }
}