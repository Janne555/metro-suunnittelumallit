package singleton.connection;

public class FiberConnection implements Connection {
  private static FiberConnection INSTANCE;
  private boolean open = false;

  private FiberConnection() {
  }

  protected static FiberConnection getInstance() {
    if (FiberConnection.INSTANCE == null) {
      synchronized (FiberConnection.class) {
        if (FiberConnection.INSTANCE == null) {
          FiberConnection.INSTANCE = new FiberConnection();
        }
      }
    }
    return FiberConnection.INSTANCE;
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
    System.out.println("I'm quite fast");
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