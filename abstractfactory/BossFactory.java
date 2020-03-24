package abstractfactory;

public class BossFactory implements VaateFactory {
  @Override
  public Kengat createKengat() {
    return new BossKengat();
  }

  @Override
  public Lippis createLippis() {
    return new BossLippis();
  }

  @Override
  public Farmarit createFarmarit() {
    return new BossFarmarit();
  }

  @Override
  public TPaita createTPaita() {
    return new BossTPaita();
  }

}