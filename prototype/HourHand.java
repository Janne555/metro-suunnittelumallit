package prototype;

public class HourHand extends Hand {
  private int position = 0;

  @Override
  public void tick() {
    if (position == 23) {
      position = 0;
    } else {
      position += 1;
    }
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public void printTime() {
    System.out.printf("%d:", this.position);
  }
}