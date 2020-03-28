package singleton.connection;

import java.lang.reflect.Method;

public class ConnectionFactory {
  public static Connection getConnection(String connString) {
    try {
      Class<?> connectionClass = Class.forName(connString);
      Method instanceGetter = connectionClass.getDeclaredMethod("getInstance");
      return (Connection) instanceGetter.invoke(null);
    } catch (Exception e) {
      e.printStackTrace();
      throw new Error(String.format("Unable to get connection for string '%'", connString));
    }
  }
}