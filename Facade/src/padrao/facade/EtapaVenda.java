package padrao.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class EtapaVenda {
    private List<Venda> vendasComPendencia = new ArrayList<Venda>();

    public void addVendaPendente(Venda venda) {
        this.vendasComPendencia.add(venda);
    }

    public boolean verificarVendaComPendencia(Venda venda) {
        return this.vendasComPendencia.contains(venda);
    }
}
