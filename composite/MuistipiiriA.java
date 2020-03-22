package composite;

public class MuistipiiriA implements Muistipiiri {
  public static final double HINTA = 25.0;

  @Override
  public double hinta() {
    return HINTA;
  }

  @Override
  public void addLaiteosa(Laiteosa laiteosa) {
  }
}