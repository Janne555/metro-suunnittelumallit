package abstractfactory;

public class Jasper {
  private Kengat kengat;
  private Lippis lippis;
  private Farmarit farmarit;
  private TPaita tPaita;
  private String titteli;

  public Jasper(VaateFactory factory, String titteli) {
    this.kengat = factory.createKengat();
    this.lippis = factory.createLippis();
    this.farmarit = factory.createFarmarit();
    this.tPaita = factory.createTPaita();
    this.titteli = titteli;
  }

  public void tulostaVaatteet() {
    System.out.println(String.format("Olen %s Jasper ja minulla on päällä %s, %s, %s ja %s", titteli, kengat, lippis, farmarit, tPaita));
  }
}