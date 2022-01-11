package padrao.facade;

import java.text.Normalizer;

public class Venda {
    public boolean concluirVenda() {
        return ServicoConsumidorFacade.verificarPendenciasVenda(this);
    }
}
