package prototype;

public class MinuteHand extends Hand {
  private int position = 0;

  private Hand next;

  public MinuteHand(Hand next) {
    this.next = next;
  }

  @Override
  public void tick() {
    if (position == 59) {
      next.tick();
      position = 0;
    } else {
      position += 1;
    }
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    MinuteHand mh = (MinuteHand) super.clone();
    mh.next = (Hand) this.next.clone();
    return mh;
  }
  
  @Override
  public void printTime() {
    this.next.printTime();
    System.out.printf("%d:", this.position);
  }
}