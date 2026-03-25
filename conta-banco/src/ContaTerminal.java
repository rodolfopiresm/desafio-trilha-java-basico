import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = conta.next();

        System.out.println("Por favor, digite o número da Conta !");
        String numero = conta.next();

        System.out.println("Por favor, digite o nome do titular da conta !");
        String nomeCliente = conta.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
