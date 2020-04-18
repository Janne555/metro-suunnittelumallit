package adapter;

public class XboxControllerToPlaystationAdapter implements DualShock {
  private final XboxController controller;

  public XboxControllerToPlaystationAdapter(XboxController controller) {
    this.controller = controller;
  }


  @Override
  public void buttonCircle() {
    this.controller.buttonB();
  }

  @Override
  public void buttonSquare() {
    this.controller.buttonX();
  }

  @Override
  public void buttonTriangle() {
    this.controller.buttonY();
  }

  @Override
  public void buttonX() {
    this.controller.buttonA();
  }

}