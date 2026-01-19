public class ContaBancaria {

    // ATRIBUTOS (características)
    private String titular;
    private double saldo;

    // CONSTRUTOR (nascimento do objeto)
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // MÉTODOS (ações)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
