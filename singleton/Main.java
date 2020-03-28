package singleton;

import singleton.connection.Connection;
import singleton.connection.ConnectionFactory;

public class Main {
  public static void main(String[] args) throws Exception {
    Connection copper = ConnectionFactory.getConnection("singleton.connection.CopperConnection");
    copper.readByte();

    Connection fiber = ConnectionFactory.getConnection("singleton.connection.FiberConnection");
    fiber.readByte();
  }
}