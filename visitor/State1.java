package visitor;

public enum State1 implements State {
  INSTANCE;

  private final int multiplier = 1;
  private int points = 0;

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public State nextState() {
    return State2.INSTANCE;
  }

  @Override
  public int getMultiplier() {
    return this.multiplier;
  }

  @Override
  public int getPoints() {
    return this.points;
  }

  @Override
  public void setPoints(int points) {
    this.points = points;
  }
}