package state;

public class Player implements Wizard {
  public Wizard wizard;

  public Player() {
    this.wizard = new FirstLevelWizard();
  }

  @Override
  public Wizard levelUp() {
    this.wizard = wizard.levelUp();
    return null;
  }

  @Override
  public void castUtilitySpell() {
    this.wizard.castUtilitySpell();
  }

  @Override
  public void castAttackSpell() {
    this.wizard.castAttackSpell();
  }
}