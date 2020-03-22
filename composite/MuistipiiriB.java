package composite;

public class MuistipiiriB implements Muistipiiri {
  public static final double HINTA = 45.0;

  @Override
  public double hinta() {
    return HINTA;
  }

  @Override
  public void addLaiteosa(Laiteosa laiteosa) {
  }
}