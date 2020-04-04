package templatemethod;

public class DiceGame extends Game {
  private Die die;
  private int targetNumber;
  private int winner;

  public DiceGame(Die die, int targetNumber) {
    this.die = die;
    this.targetNumber = targetNumber;
  }

  @Override
  void initializeGame() {
    this.winner = 0;
  }

  @Override
  void makePlay(int player) {
    if (die.throwDie() == targetNumber) {
      this.winner = player;
    }
  }

  @Override
  boolean endOfGame() {
    return this.winner != 0;
  }

  @Override
  void printWinner() {
    System.out.printf("The winner is player #%d\n", this.winner);
  }
}