package mediator;

public class Hyppylupa {
  private int hyppyIndeksi = 0;
  public void tekiHypyn() {
    this.hyppyIndeksi++;
  }

  public boolean saakoHypätä() {
    return this.hyppyIndeksi <= 1;
  }
}