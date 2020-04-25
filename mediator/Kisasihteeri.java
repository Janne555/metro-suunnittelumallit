package mediator;

import java.util.List;

public class Kisasihteeri {
  public int keskiarvo(List<Integer> tulokset) {
    int summa = tulokset.stream().reduce(0, Integer::sum);
    return summa / tulokset.size();
  }

  public Tulosrivi luoTulosRivi(String nimi, int pisteet, double pituus) {
    return new Tulosrivi(nimi, pisteet, pituus);
  }

  public Hyppy luoHyppy(double pituus, int tyyliPisteet) {
    return new Hyppy(pituus, tyyliPisteet);
  }

  public boolean saakoHypätä(Hyppylupa hyppylupa) {
    return hyppylupa.saakoHypätä();
  }

  public Hyppylupa luoHyppylupa() {
    return new Hyppylupa();
  }
}