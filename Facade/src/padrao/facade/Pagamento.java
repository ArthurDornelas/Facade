package padrao.facade;

public class Pagamento extends EtapaVenda{
    private static Pagamento pagamento = new Pagamento();

    public Pagamento() {};

    public static Pagamento getInstancia() {
        return pagamento;
    }
}
