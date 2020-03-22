package composite;

public class Main {

    public static void main(String[] args) {
      Shoppailija shoppailija = new Shoppailija();
      Laiteosa jimmssinKone = shoppailija.kasaaTietokone(Jimms.getInstance());
      Laiteosa verkkiksenKone = shoppailija.kasaaTietokone(Verkkis.getInstance());
      System.out.println(String.format("Tietokone Jimssiltä maksaa %.2f euroa", jimmssinKone.hinta()));
      System.out.println(String.format("Tietokone Verkkokauppa.comista maksaa %.2f euroa", verkkiksenKone.hinta()));
    }
}
