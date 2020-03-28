package state;

public class ThirdLevelWizard implements Wizard {
  @Override
  public Wizard levelUp() {
    System.out.println("Max level reached!");
    return new ThirdLevelWizard();
  }

  @Override
  public void castUtilitySpell() {
    System.out.println("Cast utility spell: Arcane Lock");
  }

  @Override
  public void castAttackSpell() {
    System.out.println("Cast attack spell: Scorching Ray");
  }
}