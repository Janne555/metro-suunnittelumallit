package composite;

public class KoteloB extends Kotelo {
  public static final double HINTA = 77.12;

  @Override
  public double hinta() {
    double osienHinta = laiteosat.stream().map(Laiteosa::hinta).reduce(0.0, Double::sum);
    return osienHinta + HINTA;
  }
}