package state;

public class Main {
  public static void main(String[] args) throws Exception {
    Player player = new Player();
    player.castAttackSpell();
    player.castUtilitySpell();
    player.levelUp();
    player.castAttackSpell();
    player.castUtilitySpell();
    player.levelUp();
    player.castAttackSpell();
    player.castUtilitySpell();
    player.levelUp();
  }
}