package proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Image> images = Arrays.asList(
      new ProxyImage("koira.jpg"),
      new ProxyImage("kissa.png"),
      new ProxyImage("pupu.gif"),
      new ProxyImage("marsu.webp")
    );

    images.forEach(image -> image.showData());
    images.forEach(image -> image.displayImage());
  }
}