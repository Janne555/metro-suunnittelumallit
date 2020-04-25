package mediator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mediator {
  private List<Arvostelutuomari> tuomarit;
  private Kisasihteeri sihteeri;
  private Mittamies mittamies;
  private Tulostaulu tulostaulu;
  private List<Hyppääjä> hyppääjät;

  public Mediator() {
    this.tuomarit = IntStream.range(0, 5).mapToObj(i -> new Arvostelutuomari()).collect(Collectors.toList());
    this.mittamies = new Mittamies();
    this.tulostaulu = new Tulostaulu();
    this.sihteeri = new Kisasihteeri();
    this.hyppääjät = Arrays.asList(new Hyppääjä("Matti", this.sihteeri.luoHyppylupa()), new Hyppääjä("Teppo", this.sihteeri.luoHyppylupa()));
  }

  public void mediate(Hyppääjä hyppääjä) {
    Hyppylupa hyppylupa = (Hyppylupa) hyppääjä.getHyppylupa();
    if (!this.sihteeri.saakoHypätä(hyppylupa)) {
      return;
    }

    List<Integer> tulokset = tuomarit.stream().map(tuomari -> tuomari.arvostele()).collect(Collectors.toList());
    int pisteet = sihteeri.keskiarvo(tulokset);
    double pituus = this.mittamies.mittaa();
    Hyppy hyppy = sihteeri.luoHyppy(pituus, pisteet);

    hyppääjä.lisääHyppy(hyppy);
    Tulosrivi tulosrivi = sihteeri.luoTulosRivi(hyppääjä.getNimi(), pisteet, pituus);
    this.tulostaulu.lisääTulos(tulosrivi);

    hyppylupa.tekiHypyn();
  }

  public void kisaa() {
    System.out.println("Kisa käynnistyi\nEnsimmäinen kierros");
    this.hyppääjät.forEach(hyppääjä -> mediate(hyppääjä));
    this.tulostaulu.tulostaTulokset();
    System.out.println("Toinen kierros");
    this.hyppääjät.forEach(hyppääjä -> mediate(hyppääjä));
    this.tulostaulu.tulostaTulokset();
  }
}