package composite;

public class Jimms implements Verkkokauppa {
  private static Jimms instance = null;

  private Jimms() {
  }

  public static Verkkokauppa getInstance() {
    if (instance == null) {
      instance = new Jimms();
    }

    return instance;
  }

  @Override
  public Muistipiiri tilaaMuistipiiri() {
    return new MuistipiiriA();
  }

  @Override
  public Emolevy tilaaEmolevy() {
    return new Emolevy();
  }

  @Override
  public Prosessori tilaaProsessori() {
    return new ProsessoriA();
  }

  @Override
  public Kotelo tilaaKotelo() {
    return new KoteloA();
  }

}