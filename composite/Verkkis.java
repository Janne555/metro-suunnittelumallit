package composite;

public class Verkkis implements Verkkokauppa {
  private static Verkkis instance = null;

  private Verkkis() {
  }

  public static Verkkokauppa getInstance() {
    if (instance == null) {
      instance = new Verkkis();
    }
    return instance;
  }

  @Override
  public Muistipiiri tilaaMuistipiiri() {
    return new MuistipiiriB();
  }

  @Override
  public Emolevy tilaaEmolevy() {
    return new Emolevy();
  }

  @Override
  public Prosessori tilaaProsessori() {
    return new ProsessoriB();
  }

  @Override
  public Kotelo tilaaKotelo() {
    return new KoteloB();
  }

}