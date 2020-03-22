package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
  public static final double HINTA = 44.12;
  private List<Laiteosa> laiteosat;

  public Emolevy() {
    laiteosat = new ArrayList<>();
  }

  @Override
  public double hinta() {
    double osienHinta = laiteosat.stream().map(Laiteosa::hinta).reduce(0.0, Double::sum);
    return osienHinta + HINTA;
  }

  @Override
  public void addLaiteosa(Laiteosa laiteosa) {
    laiteosat.add(laiteosa);
  }
}