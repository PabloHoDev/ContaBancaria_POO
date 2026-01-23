
import java.util.ArrayList;
import java.util.List;
import java.util.ContaBancaria;

public class BancoService {

    private List<ContaBancaria> contas = new ArrayList<>();

    // CREATE
    public void criarConta(String titular, double saldoInicial) {
        contas.add(new ContaBancaria(titular, saldoInicial));
    }

    // READ
    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (ContaBancaria conta : contas) {
            System.out.println("Titular: " + conta.getTitular() +
                               " | Saldo: R$ " + conta.getSaldo());
        }
    }

    // SEARCH
    public ContaBancaria buscarConta(String titular) {
        for (ContaBancaria conta : contas) {
            if (conta.getTitular().equalsIgnoreCase(titular)) {
                return conta;
            }
        }
        return null;
    }

    // DELETE
    public boolean removerConta(String titular) {
        ContaBancaria conta = buscarConta(titular);
        if (conta != null) {
            contas.remove(conta);
            return true;
        }
        return false;
    }
}
