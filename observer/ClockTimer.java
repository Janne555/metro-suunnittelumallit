package observer;

import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
  private static final ClockTimer instance = new ClockTimer();
  private Long lastUpdated;
  private int seconds;

  private ClockTimer() {
    this.lastUpdated = System.currentTimeMillis();
  }

  public static ClockTimer getInstance() {
    return ClockTimer.instance;
  }

  @Override
  public void run() {
    while (true) {
      if (System.currentTimeMillis() - lastUpdated > 1000) {
        this.seconds++;
        lastUpdated = System.currentTimeMillis();
        this.setChanged();
        this.notifyObservers();
      }
    }
  }

  public int getSeconds() {
    return this.seconds;
  }
}