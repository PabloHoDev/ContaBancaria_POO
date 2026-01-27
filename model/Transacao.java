package model;

public class Transacao {
 
    private String tipo; // "DEPOSITO" ou "SAQUE"
    private double valor;
    private double saldoAposTransacao;
    // Esta classe pode ser expandida no futuro para incluir detalhes de transações

    public Transacao(String tipo, double valor, double saldoAposTransacao) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldoAposTransacao = saldoAposTransacao;
    }
    @Override
    public String toString() {
        return "Transacao{" +
               "tipo='" + tipo + '\'' +
               ", valor=" + valor +
               ", saldoAposTransacao=" + saldoAposTransacao +
               '}';
    }
}