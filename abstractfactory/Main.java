package abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Class<?> c = null;
        VaateFactory factory = null;

        Properties properties = new Properties();
        
        try {
            properties.load(new FileInputStream("abstractfactory/tehdas.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            c = Class.forName(properties.getProperty("tehdas"));
            factory = (VaateFactory) c.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Jasper opiskelevaJasper = new Jasper(factory, properties.getProperty("jasper"));
        opiskelevaJasper.tulostaVaatteet();
    }
}
