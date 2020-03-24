package abstractfactory;

public abstract class Vaatekappale {
  private final String nimi;

  public Vaatekappale(String nimi) {
    this.nimi = nimi;
  }

  @Override
  public String toString() {
    return nimi;
  }
}