import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = conta.next();

        System.out.println("Por favor, digite o número da Conta !");
        String numero = conta.next();

        conta.nextLine(); // Em busca encontrei esse comando para limpar o buffer do scanner,
        //pois o próximo comando é um nextLine() e ele estava pulando a leitura do nome do cliente.

        System.out.println("Por favor, digite o nome do titular da conta !");
        String nomeCliente = conta.nextLine();

        System.out.println("Por favor, digite o valor do depósito inicial !");
        double saldo = conta.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
