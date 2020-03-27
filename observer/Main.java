package observer;

public class Main {
  public static void main(String[] args) throws Exception {
    Clock analog = new AnalogClock(ClockTimer.getInstance());
    Clock digital = new DigitalClock(ClockTimer.getInstance());
    Thread t = new Thread(ClockTimer.getInstance());
    t.run();
  }
}