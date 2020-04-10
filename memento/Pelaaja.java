package memento;

import memento.arvuuttaja.Arvuuttaja;

public class Pelaaja implements Runnable {
  private Object memento;
  private String nimi;

  public Pelaaja(String nimi) {
    this.nimi = nimi;
    Arvuuttaja.INSTANCE.liityPeliin(this);
  }

  @Override
  public void run() {
    for (int i = 1; i <= Main.MAX; i++) {
      try {
        Thread.sleep(Math.round(Math.random() * 1000) + 1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (Arvuuttaja.INSTANCE.arvaa(this.memento, i, this.nimi)) {
        break;
      }
    }
  }

  public void setMemento(Object memento) {
    this.memento = memento;
  }
}