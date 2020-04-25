package prototype;

public abstract class Hand implements Cloneable {
  public abstract void tick();
  public abstract void printTime();

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}