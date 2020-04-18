package adapter;

public class DualShockToXboxAdapter extends ConcreteDualShock implements XboxController {

  @Override
  public void buttonA() {
    super.buttonX();
  }

  @Override
  public void buttonB() {
    super.buttonCircle();
  }

  @Override
  public void buttonY() {
    super.buttonTriangle();
  }

  @Override
  public void buttonX() {
    super.buttonSquare();
  }
}