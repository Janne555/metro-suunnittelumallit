package facade;

import java.util.HashMap;
import java.util.Map;

public class Memory {
  static private Map<Long, byte[]> mem = new HashMap<>();

  public void load(long position, byte[] data) {
    mem.put(position, data);
    System.out.printf("Load: %d\n", position);
  }

  static public void printMem() {
    mem.values().forEach(val -> {
      System.out.printf("%b", val[0]);
    });
  }
}