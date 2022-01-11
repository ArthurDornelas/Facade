package padrao.facade;

public class OrdemFinalizada extends EtapaVenda{
    private static OrdemFinalizada ordemFinalizada = new OrdemFinalizada();

    public OrdemFinalizada() {};

    public static OrdemFinalizada getInstancia() {
        return ordemFinalizada;
    }
}
