package memento.arvuuttaja;

import memento.Main;
import memento.Pelaaja;

public enum Arvuuttaja {
  INSTANCE;

  public void liityPeliin(Pelaaja pelaaja) {
    pelaaja.setMemento(new Memento((int) Math.ceil(Math.random() * Main.MAX)));
  }

  public boolean arvaa(Object obj, int arvaus, String nimi) {
    if (obj instanceof Memento) {
      Memento memento = (Memento) obj;
      if (memento.getArvottuLuku() == arvaus) {
        System.out.printf("VOITTO! %s arvasi %d, mikä on oikein!\n", nimi, arvaus);
        return true;
      } else {
        System.out.printf("%s arvasi %d, mikä on väärin!\n", nimi, arvaus);
      }
    }
    return false;
  }
}