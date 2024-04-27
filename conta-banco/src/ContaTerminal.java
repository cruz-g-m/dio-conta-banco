import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * A ContaTerminal recebe informações bancárias e as armazena para exibir ao final.
 * 
 * @author Guilherme Cruz
 * @version 1.0
 * @since 27/04/2024
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numeroCliente = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();
        

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente + ", conta " + numeroCliente + " e seu saldo " + saldoCliente +" já está disponível para saque\".");

    }
}
