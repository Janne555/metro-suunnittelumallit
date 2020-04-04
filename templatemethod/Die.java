package templatemethod;

public enum Die {
  D2 (2),
  D6 (6),
  D20 (20);

  private final int sides;

  private Die(int sides) {
    this.sides = sides;
  }

  public int throwDie() {
    return (int) Math.ceil(Math.random() * this.sides);
  }
}