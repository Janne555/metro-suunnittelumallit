package mediator;

public class Hyppääjä {
  private Hyppy[] hypyt;
  private String nimi;
  private Object hyppylupa;

  public Hyppääjä(String nimi, Object hyppylupa) {
    this.hypyt = new Hyppy[2];
    this.nimi = nimi;
    this.hyppylupa = hyppylupa;
  }
  
  public Object getHyppylupa() {
    return hyppylupa;
  }

  public void setHyppylupa(Object hyppylupa) {
    this.hyppylupa = hyppylupa;
  }

  public String getNimi() {
    return nimi;
  }

  public void lisääHyppy(Hyppy hyppy) {
    if (this.hypyt[0] == null) {
      this.hypyt[0] = hyppy;
    } else if (this.hypyt[1] == null) {
      this.hypyt[1] = hyppy;
    }
  }

}