package visitor;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    Visitor visitor = new ConcreteVisitor();
    for (int i = 0; i < 9; i++) {
      context.accept(visitor);
      context.printPoints();
      context.nextState();
    }
  }
}