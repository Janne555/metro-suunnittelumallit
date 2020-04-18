package adapter;

public class Main {
  public static void main(String[] args) {
    DualShock playstation = new XboxControllerToPlaystationAdapter(new ConcreteXboxController());
    XboxController xbox = new DualShockToXboxAdapter();

    playstation.buttonX();
    playstation.buttonSquare();
    playstation.buttonCircle();
    playstation.buttonTriangle();

    xbox.buttonA();
    xbox.buttonX();
    xbox.buttonB();
    xbox.buttonY();
  }
}