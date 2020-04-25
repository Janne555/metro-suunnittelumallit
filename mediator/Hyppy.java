package mediator;

public class Hyppy {
  private double pituus;
  private int tyyliPisteet;

  public Hyppy(double pituus, int tyyliPisteet) {
    this.pituus = pituus;
    this.tyyliPisteet = tyyliPisteet;
  }

  public int getTyyliPisteet() {
    return tyyliPisteet;
  }

  public double getPituus() {
    return pituus;
  }

  public void setPituus(double pituus) {
    this.pituus = pituus;
  }

  public void setTyyliPisteet(int tyyliPisteet) {
    this.tyyliPisteet = tyyliPisteet;
  }
}