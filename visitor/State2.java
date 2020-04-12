package visitor;

public enum State2 implements State {
  INSTANCE;

  private final int multiplier = 2;
  private int points = 0;

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public State nextState() {
    return State3.INSTANCE;
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