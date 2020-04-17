package builder;

public class Hesburger implements Builder<StringBuilder> {
  private StringBuilder purilainen;

  public Hesburger() {
    this.purilainen = new StringBuilder();
  }

  @Override
  public StringBuilder getPurilainen() {
    return this.purilainen;
  }

  @Override
  public Hesburger lisääSämpylä() {
    this.purilainen.append("sämpylä").append(", ");
    return this;
  }

  @Override
  public Hesburger lisääKetsuppi() {
    this.purilainen.append("ketsuppi").append(", ");
    return this;
  }

  @Override
  public Hesburger lisääSalaatti() {
    this.purilainen.append("salaatti").append(", ");
    return this;
  }

  @Override
  public Hesburger lisääPihvi() {
    this.purilainen.append("pihvi").append(", ");
    return this;
  }

  @Override
  public Hesburger lisääMajoneesi() {
    this.purilainen.append("majoneesi").append(", ");
    return this;
  }

  @Override
  public Hesburger lisääSuolakurkku() {
    this.purilainen.append("suolakurkku").append(", ");
    return this;
  }

  @Override
  public Hesburger lisääTomaatti() {
    this.purilainen.append("tomaatti").append(", ");
    return this;
  }
}