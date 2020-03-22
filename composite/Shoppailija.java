package composite;

public class Shoppailija {
  public Laiteosa kasaaTietokone(Verkkokauppa verkkokauppa) {
    Laiteosa kotelo = verkkokauppa.tilaaKotelo();
    Laiteosa emolevy = verkkokauppa.tilaaEmolevy();
    emolevy.addLaiteosa(verkkokauppa.tilaaMuistipiiri());
    emolevy.addLaiteosa(verkkokauppa.tilaaProsessori());
    kotelo.addLaiteosa(emolevy);
    return kotelo;
  }
}