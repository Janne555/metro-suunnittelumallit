package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer, Clock {
  private final ClockTimer timer;

  public DigitalClock(ClockTimer timer) {
    this.timer = timer;
    timer.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof ClockTimer) {
      this.draw();
    }
  }

  @Override
  public void draw() {
    System.out.println(String.format("DIGITAALISESTI: %d s", this.timer.getSeconds()));
  }
}