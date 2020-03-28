package decorator;

public class Main {

    public static void main(String[] args) {
      FileWriter fileWriter = new SimpleFileWriter();
      FileWriter nsaEncryptor = new NSAEncryptor(fileWriter);
      FileWriter fsbEncryptor = new FSBEncryptor(nsaEncryptor);
      fsbEncryptor.write("This is top secret data");
    }
}
