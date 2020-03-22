package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();

        AterioivaOtus opiskelija = new Opettaja();
        opiskelija.aterioi();

        AterioivaOtus assari = new Assari();
        assari.aterioi();
    }
}
