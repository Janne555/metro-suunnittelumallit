package visitor;

public interface Visitor {
  public void visit(State1 state);
  public void visit(State2 state);
  public void visit(State3 state);
}