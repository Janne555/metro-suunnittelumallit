package abstractfactory;

public class Main {

    public static void main(String[] args) {
        Jasper opiskelevaJasper = new Jasper(new AdidasFactory(), "opiskeleva");
        opiskelevaJasper.tulostaVaatteet();

        Jasper insinooriJasper = new Jasper(new BossFactory(), "insinööri");
        insinooriJasper.tulostaVaatteet();
    }
}
