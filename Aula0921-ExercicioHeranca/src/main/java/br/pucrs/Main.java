package br.pucrs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void run(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(
            new Pix("Ana", 200.00, "ana@email.com")
        );

        pagamentos.add(
            new CartaoCredito(
                "Carlos", 500.00, "1234567890123456", 3
            )
        );

        pagamentos.add(
            new CartaoCredito(
                "Marina", 150.00, "1234", 1
            )
        );

        ProcessadorDePagamentos processador =
                new ProcessadorDePagamentos();

        for (Pagamento pagamento : pagamentos) {
            try {
                processador.processar(pagamento);
            } catch (PagamentoInvalidoException e) {
                System.out.println(
                    "Pagamento recusado: " + e.getMessage()
                );
            }
        }
    }
}