package model;

public class Transacao {

    private String tipo;
    private double valor;
    private double saldoApos;

    public Transacao(String tipo, double valor, double saldoApos) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldoApos = saldoApos;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldoApos() {
        return saldoApos;
    }

    @Override
    public String toString() {
        return tipo + " | Valor: R$ " + valor + " | Saldo após: R$ " + saldoApos;
    }
}
