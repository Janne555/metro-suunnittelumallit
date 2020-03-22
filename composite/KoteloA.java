package composite;

public class KoteloA extends Kotelo {
  public static final double HINTA = 69.54;

  @Override
  public double hinta() {
    double osienHinta = laiteosat.stream().map(Laiteosa::hinta).reduce(0.0, Double::sum);
    return osienHinta + HINTA;
  }
}