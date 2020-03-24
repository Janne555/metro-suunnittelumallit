package abstractfactory;

public class AdidasFactory implements VaateFactory {

  @Override
  public Kengat createKengat() {
    return new AdidasKengat();
  }

  @Override
  public Lippis createLippis() {
    return new AdidasLippis();
  }

  @Override
  public Farmarit createFarmarit() {
    return new AdidasFarmarit();
  }

  @Override
  public TPaita createTPaita() {
    return new AdidasTPaita();
  }

}