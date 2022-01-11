package padrao.facade;

public class ServicoConsumidorFacade {
    public static boolean verificarPendenciasVenda(Venda venda) {
        if (OrdemFinalizada.getInstancia().verificarVendaComPendencia(venda)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarVendaComPendencia(venda)) {
            return false;
        }
        if (Envio.getInstancia().verificarVendaComPendencia(venda)) {
            return false;
        }
        return true;
    }
}
