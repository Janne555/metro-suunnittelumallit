package adapter;

public class ConcreteDualShock implements DualShock {

  @Override
  public void buttonCircle() {
    System.out.println("Jump");
  }

  @Override
  public void buttonSquare() {
    System.out.println("Crouch");
  }

  @Override
  public void buttonTriangle() {
    System.out.println("Reload");
  }

  @Override
  public void buttonX() {
    System.out.println("Shoot");
  }
}