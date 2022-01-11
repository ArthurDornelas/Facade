package padrao.facade;

public class Envio extends EtapaVenda{
    private static Envio envio = new Envio();

    public Envio() {};

    public static Envio getInstancia() {
        return envio;
    }
}
