package flyweigth;
/**
 * origin: https://www.javaworld.com/article/2073632/make-your-apps-fly.html
 */
public class Example1 {
  public static void main(String[] args) {
    String fly = "fly", weight = "weight";
    String fly2 = "fly", weight2 = "weight";

    System.out.println(fly == fly2); // true
    System.out.println(weight == weight2); // true

    String distinctString = fly + weight;
    System.out.println(distinctString == "flyweight"); // false

    String flyweight = (fly + weight).intern();
    System.out.println(flyweight == "flyweight"); // true

    /**
     * Stringien sisällön vertailussa pitää huomioida flyweigth aspect
     */

    String foo = "foo";
    String bar = "bar";
    String fooBar = foo + bar;
    System.out.println(fooBar == "foobar"); // false
    System.out.println(fooBar.equals("foobar")); // true
  }
}