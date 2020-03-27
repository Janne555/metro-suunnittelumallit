package observer;

import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer, Clock {
  private final ClockTimer timer;

  public AnalogClock(ClockTimer timer) {
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
    System.out.println(String.format("Analogisesti: aikaa on kulunut %d sekuntia", this.timer.getSeconds()));
  }
}