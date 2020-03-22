package composite;

public class ProsessoriA implements Prosessori {
  public static final double HINTA = 100.99;

  @Override
  public double hinta() {
    return HINTA;
  }

  @Override
  public void addLaiteosa(Laiteosa laiteosa) {
  }

}