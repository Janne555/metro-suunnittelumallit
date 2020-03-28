package singleton.connection;

public class CopperConnection implements Connection {
  private static CopperConnection INSTANCE;
  private boolean open = false;

  private CopperConnection() {
  }

  protected static CopperConnection getInstance() {
    if (CopperConnection.INSTANCE == null) {
      synchronized (CopperConnection.class) {
        if (CopperConnection.INSTANCE == null) {
          CopperConnection.INSTANCE = new CopperConnection();
        }
      }
    }
    return CopperConnection.INSTANCE;
  }

  @Override
  public boolean isOpen() {
    return this.open;
  }

  @Override
  public void writeByte(Byte b) {
  }

  @Override
  public Byte readByte() {
    System.out.println("I'm very slow at this");
    return null;
  }

  @Override
  public void close() {
    this.open = false;
  }

  @Override
  public void open() {
    this.open = true;
  }

}