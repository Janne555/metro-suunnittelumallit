package memento;

public class Main {
  public static final int MAX = 10;

  public static void main(String[] args) throws InterruptedException {
    Pelaaja heikki = new Pelaaja("Heikki");
    Pelaaja erkki = new Pelaaja("Erkki");
    Pelaaja taina = new Pelaaja("Taina");
    Pelaaja pirjo = new Pelaaja("Pirjo");
    new Thread(heikki).start();
    new Thread(erkki).start();
    new Thread(taina).start();
    new Thread(pirjo).start();
  }
}