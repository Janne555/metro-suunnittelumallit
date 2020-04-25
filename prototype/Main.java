package prototype;

public class Main {
  public static void main(String... args) throws CloneNotSupportedException {
    Clock clock1 = new Clock();
    Clock clock2 = (Clock) clock1.clone();

    for (int i = 0; i < 3600; i++) {
      clock1.tick();
      clock2.tick();
    }

    for (int i = 0; i < 1337; i++) {
      clock1.tick();
      if (i % 5 == 0) {
        clock2.tick();
      }
    }

    clock1.printTime();
    clock2.printTime();
  }
}