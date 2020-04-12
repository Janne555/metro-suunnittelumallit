package visitor;

public class ConcreteVisitor implements Visitor {

  @Override
  public void visit(State1 state) {
    state.setPoints(state.getPoints() + 100 * state.getMultiplier());
  }

  @Override
  public void visit(State2 state) {
    state.setPoints(state.getPoints() + 200 * state.getMultiplier());
  }

  @Override
  public void visit(State3 state) {
    state.setPoints(state.getPoints() + 300 * state.getMultiplier());
  }

}