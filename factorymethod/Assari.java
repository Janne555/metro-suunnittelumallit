package factorymethod;

public class Assari extends AterioivaOtus {

    public Juoma createJuoma(){
        return new IKaffe();
    };

}
