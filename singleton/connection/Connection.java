package singleton.connection;

public interface Connection {
  public void open();
  public boolean isOpen();
  public void writeByte(Byte b);
  public Byte readByte();
  public void close();
}