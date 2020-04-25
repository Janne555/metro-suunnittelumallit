package mediator;

public class Tulosrivi {
  private String nimi;
  private int pisteet;
  private double pituus;

  public Tulosrivi(String nimi, int pisteet, double pituus) {
    this.setNimi(nimi);
    this.setPisteet(pisteet);
    this.setPituus(pituus);
  }

  public String getNimi() {
    return nimi;
  }

  public void setNimi(String nimi) {
    this.nimi = nimi;
  }

  public int getPisteet() {
    return pisteet;
  }

  public void setPisteet(int pisteet) {
    this.pisteet = pisteet;
  }

  public double getPituus() {
    return pituus;
  }

  public void setPituus(double pituus) {
    this.pituus = pituus;
  }
}