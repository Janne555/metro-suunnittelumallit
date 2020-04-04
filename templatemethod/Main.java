package templatemethod;

public class Main {
  public static void main(String[] args) {
    Game game = new DiceGame(Die.D20, 20);
    game.playOneGame(3);
  }
}