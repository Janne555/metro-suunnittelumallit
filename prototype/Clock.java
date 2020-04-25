package prototype;

public class Clock implements Cloneable {
  public Hand secondHand;

  public Clock() {
    this.secondHand = new SecondHand(new MinuteHand(new HourHand()));
  }

  public void tick() {
    this.secondHand.tick();
  }

  public void printTime() {
    this.secondHand.printTime();
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    Clock clock = (Clock) super.clone();
    clock.secondHand = (Hand) this.secondHand.clone();
    return clock;
  }
}