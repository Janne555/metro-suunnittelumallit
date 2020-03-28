package decorator;

public class NSAEncryptor implements FileWriter {
  private FileWriter toDecorate;

  public NSAEncryptor(FileWriter toDecorate) {
    this.toDecorate = toDecorate;
  }

  @Override
  public void write(String data) {
    toDecorate.write(data);
    System.out.println("[copying data to NSA servers]");
  }
}