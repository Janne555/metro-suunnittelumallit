package decorator;

public class SimpleFileWriter implements FileWriter {

  @Override
  public void write(String data) {
    System.out.printf("Writing the following data to file: %s\n", data);
  }

}