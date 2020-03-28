package decorator;

public class FSBEncryptor implements FileWriter {
  private FileWriter toDecorate;

  public FSBEncryptor(FileWriter toDecorate) {
    this.toDecorate = toDecorate;
  }

  @Override
  public void write(String data) {
    toDecorate.write(data);
    System.out.println("[copying data to FSB servers]");
  }
}