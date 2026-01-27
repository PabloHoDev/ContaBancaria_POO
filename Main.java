import java.util.Scanner;
import model.ContaBancaria;
import service.BancoService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoService banco = new BancoService();
        int opcao;

        do {
            System.out.println("\n=== MENU BANCO ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Listar contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Remover conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    banco.criarConta(titular, saldo);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    banco.listarContas();
                    break;

                case 3:
                    System.out.print("Titular: ");
                    titular = scanner.nextLine();
                    ContaBancaria contaDep = banco.buscarConta(titular);
                    if (contaDep != null) {
                        System.out.print("Valor: ");
                        double valor = scanner.nextDouble();
                        if (contaDep.depositar(valor))
                            System.out.println("Depósito realizado!");
                        else
                            System.out.println("Valor inválido.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Titular: ");
                    titular = scanner.nextLine();
                    ContaBancaria contaSaq = banco.buscarConta(titular);
                    if (contaSaq != null) {
                        System.out.print("Valor: ");
                        double valor = scanner.nextDouble();
                        if (contaSaq.sacar(valor))
                            System.out.println("Saque realizado!");
                        else
                            System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Titular: ");
                    titular = scanner.nextLine();
                    if (banco.removerConta(titular))
                        System.out.println("Conta removida!");
                    else
                        System.out.println("Conta não encontrada.");
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
