public class Main {
    public static void main(String[] args) {

        // CRIANDO UM OBJETO (conta real)
        ContaBancaria conta1 = new ContaBancaria("Henrique", 500);

        conta1.mostrarSaldo();

        conta1.depositar(200);
        conta1.sacar(100);

        conta1.mostrarSaldo();
    }
}
