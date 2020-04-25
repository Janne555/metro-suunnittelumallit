package mediator;

import java.util.ArrayList;
import java.util.List;

public class Tulostaulu {
  private List<Tulosrivi> tulokset;

  public Tulostaulu() {
    this.tulokset = new ArrayList<>();
  }

  public void lisääTulos(Tulosrivi tulosrivi) {
    this.tulokset.add(tulosrivi);
  }

  public void tulostaTulokset() {
    System.out.printf("Nimi\t\tPituus\t\tPisteet\n");
    tulokset.forEach(tulos -> {
      System.out.printf("%s\t\t%.2f\t\t%d\n", tulos.getNimi(), tulos.getPituus(), tulos.getPisteet());
    });
  }
}