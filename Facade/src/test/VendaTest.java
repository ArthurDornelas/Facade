package test;

import org.junit.jupiter.api.Test;
import padrao.facade.Envio;
import padrao.facade.OrdemFinalizada;
import padrao.facade.Pagamento;
import padrao.facade.Venda;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendaTest {

    @Test
    void deveRetornarPendeciaOrdemFinalizadaVenda() {
        Venda venda = new Venda();
        OrdemFinalizada.getInstancia().addVendaPendente(venda);

        assertEquals(false, venda.concluirVenda());
    }

    @Test
    void deveRetornarPendeciaPagamentoVenda() {
        Venda venda = new Venda();
        Pagamento.getInstancia().addVendaPendente(venda);

        assertEquals(false, venda.concluirVenda());
    }

    @Test
    void deveRetornarPendeciaEnvioVenda() {
        Venda venda = new Venda();
        Envio.getInstancia().addVendaPendente(venda);

        assertEquals(false, venda.concluirVenda());
    }

    @Test
    void deveRetornarVendaSemPendecia() {
        Venda venda = new Venda();

        assertEquals(true, venda.concluirVenda());
    }
}
