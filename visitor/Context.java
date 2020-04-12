package visitor;

public class Context {
  private State state;

  public Context() {
    this.state = State1.INSTANCE;
  }

  public void accept(Visitor visitor) {
    this.state.accept(visitor);
  }

  public void nextState() {
    this.state = this.state.nextState();
  }

  public void printPoints() {
    System.out.printf("The state is %s, and current points are %d \n", state.getClass().getSimpleName(), state.getPoints());
  }
}