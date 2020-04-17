package builder;

import java.util.List;
import java.util.stream.Collectors;

import builder.ainesosat.Ainesosa;

public class Main {
  public static void main(String[] args) {
    Builder<List<Ainesosa>> mäkkäri = new McDonalds();
    Builder<StringBuilder> hese = new Hesburger();

    hese.lisääPihvi().lisääSalaatti().lisääTomaatti().lisääMajoneesi().lisääPihvi().lisääSämpylä().lisääKetsuppi()
        .lisääPihvi().lisääSuolakurkku().lisääSämpylä();

    mäkkäri.lisääPihvi().lisääSalaatti().lisääTomaatti().lisääMajoneesi().lisääPihvi().lisääSämpylä().lisääKetsuppi()
        .lisääPihvi().lisääSuolakurkku().lisääSämpylä();

    StringBuilder hesenPurilainen = hese.getPurilainen();
    List<Ainesosa> mäkinPurilainen = mäkkäri.getPurilainen();

    System.out.println(hesenPurilainen.toString());
    
    String mäkinPurilaisString = mäkinPurilainen.stream().map(ainesosa -> ainesosa.getClass().getSimpleName())
        .collect(Collectors.joining(", "));
    System.out.println(mäkinPurilaisString);
  }
}