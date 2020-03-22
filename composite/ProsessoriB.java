package composite;

public class ProsessoriB implements Prosessori {
  public static final double HINTA = 150.0;

  @Override
  public double hinta() {
    return HINTA;
  }

  @Override
  public void addLaiteosa(Laiteosa laiteosa) {
  }

}