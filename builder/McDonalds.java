package builder;

import java.util.ArrayList;
import java.util.List;

import builder.ainesosat.Ainesosa;
import builder.ainesosat.Ketsuppi;
import builder.ainesosat.Majoneesi;
import builder.ainesosat.Pihvi;
import builder.ainesosat.Salaatti;
import builder.ainesosat.Suolakurkku;
import builder.ainesosat.Sämpylä;
import builder.ainesosat.Tomaatti;

public class McDonalds implements Builder<List<Ainesosa>> {
  private List<Ainesosa> purilainen;

  public McDonalds() {
    this.purilainen = new ArrayList<>();
  }

  @Override
  public List<Ainesosa> getPurilainen() {
    return this.purilainen;
  }

  @Override
  public McDonalds lisääSämpylä() {
    this.purilainen.add(new Sämpylä());
    return this;
  }

  @Override
  public McDonalds lisääKetsuppi() {
    this.purilainen.add(new Ketsuppi());
    return this;
  }

  @Override
  public McDonalds lisääSalaatti() {
    this.purilainen.add(new Salaatti());
    return this;
  }

  @Override
  public McDonalds lisääPihvi() {
    this.purilainen.add(new Pihvi());
    return this;
  }

  @Override
  public McDonalds lisääMajoneesi() {
    this.purilainen.add(new Majoneesi());
    return this;
  }

  @Override
  public McDonalds lisääSuolakurkku() {
    this.purilainen.add(new Suolakurkku());
    return this;
  }

  @Override
  public McDonalds lisääTomaatti() {
    this.purilainen.add(new Tomaatti());
    return this;
  }
}