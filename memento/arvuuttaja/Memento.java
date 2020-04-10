package memento.arvuuttaja;

public class Memento {
  private final int arvottuLuku;

  protected Memento(int arvottuLuku) {
    this.arvottuLuku = arvottuLuku;
  }

  protected int getArvottuLuku() {
    return arvottuLuku;
  }
}