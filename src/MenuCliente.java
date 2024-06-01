import java.util.Scanner;

public class MenuCliente {
    private void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Depositar;");
        System.out.println("2 - Sacar;");
        System.out.println("3 - Transferir;");
        System.out.println("4 - Imprimir Extrato;");
        System.out.println("0 - Encerrar");
    }

    public void menuCadastro() {
        System.out.println("Se ainda não é nosso cliente e quer se tornar um, escolha uma opção abaixo:");
        System.out.println("1 - Criar Conta Corrente;");
        System.out.println("2 - Criar Conta Poupança;");
        System.out.println("3 - Criar as duas contas;");
        System.out.println("0 - Encerrar");
    }

    public void menuContaCorrente() {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        String nomeDoCliente = "";
        while (continuar) {
            while (nomeDoCliente == "") {
                System.out.println("Entre com o nome do correntista: ");
                nomeDoCliente = scanner.nextLine();
            }

            Cliente cliente = new Cliente();
            cliente.setNome(nomeDoCliente);

            ContaCorrente conta = new ContaCorrente(cliente);
            conta.saldo = 0;

            int opcao = 999;
            while (opcao == 999) {
                menu();
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Entre com o valor para depositar na Conta Corrente: ");
                        double valorDepositoCC = scanner.nextDouble();
                        conta.depositar(valorDepositoCC);
                        break;
                    case 2:
                        System.out.println("Entre com o valor para sacar da Conta Corrente: ");
                        double valorSaqueCC = scanner.nextDouble();
                        conta.sacar(valorSaqueCC);
                        break;
                    case 3:
                        System.out.println("Entre com o valor que deseja transferir: ");
                        double valorTransferir = scanner.nextDouble();
                        conta.transferir(valorTransferir, conta);
                        break;
                    case 4:
                        conta.imprimirExtrato();
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }

    public void menuContaPoupanca() {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        String nomeDoCliente = "";
        while (continuar) {
            while (nomeDoCliente == "") {
                System.out.println("Entre com o nome do correntista: ");
                nomeDoCliente = scanner.nextLine();
            }

            Cliente cliente = new Cliente();
            cliente.setNome(nomeDoCliente);

            ContaCorrente conta = new ContaCorrente(cliente);
            conta.saldo = 0;

            int opcao = 999;
            while (opcao == 999) {
                menu();
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Entre com o valor para depositar na Conta Corrente: ");
                        double valorDepositoCC = scanner.nextDouble();
                        conta.depositar(valorDepositoCC);
                        break;
                    case 2:
                        System.out.println("Entre com o valor para sacar da Conta Corrente: ");
                        double valorSaqueCC = scanner.nextDouble();
                        conta.sacar(valorSaqueCC);
                        break;
                    case 3:
                        System.out.println("Entre com o valor que deseja transferir: ");
                        double valorTransferir = scanner.nextDouble();
                        conta.transferir(valorTransferir, conta);
                        break;
                    case 4:
                        conta.imprimirExtrato();
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }

}
