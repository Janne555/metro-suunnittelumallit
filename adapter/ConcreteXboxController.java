package adapter;

public class ConcreteXboxController implements XboxController {

  @Override
  public void buttonA() {
    System.out.println("Shoot");
  }

  @Override
  public void buttonB() {
    System.out.println("Jump");
  }

  @Override
  public void buttonX() {
    System.out.println("Crouch");
  }

  @Override
  public void buttonY() {
    System.out.println("Reload");
  }

}