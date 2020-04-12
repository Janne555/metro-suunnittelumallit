package visitor;

public interface State {
  public void accept(Visitor visitor);
  public State nextState();
  public int getMultiplier();
  public int getPoints();
  public void setPoints(int points);
}