import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean loop = true;
		while (loop) {
			System.out.println("Já é cliente do banco? S - Sim; N - Não; 0 - Sair;");
			Scanner scanner = new Scanner(System.in);

			String ehCliente = scanner.nextLine().trim();
			MenuCliente menuCliente = new MenuCliente();

			if (ehCliente.equalsIgnoreCase("s")) {
				System.out.println("C - Conta Corrente;");
				System.out.println("P - Conta Poupança;");
				String tipoConta = scanner.nextLine().trim();
				if (tipoConta.equalsIgnoreCase("c")) {
					menuCliente.menuContaCorrente();
				} else if (tipoConta.equalsIgnoreCase("p")) {
					menuCliente.menuContaPoupanca();
				}
			} else if (ehCliente.equalsIgnoreCase("0")) {
				loop = false;
			} else {
				menuCliente.menuCadastro();
				String tipoDeConta = scanner.nextLine();

				System.out.println("Entre com o nome do correntista: ");
				String nomeDoCliente = scanner.nextLine();

				System.out.println("Cadastro realizado com sucesso, aproveite nosso banco: " + nomeDoCliente);
			}

			scanner.close();
		}
	}
}
