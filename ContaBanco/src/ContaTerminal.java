import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("\nBem-vindo ao FreeDBank!\n\n");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("\nPor favor, digite a identificação da sua agência!");
        String agenciaId = scanner.next();

        System.out.println("\nPor favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("\nPor favor, digite o seu sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("\nPor favor, digite o seu saldo!");
        float saldoConta = scanner.nextFloat();

        scanner.close();

        System.out.println("\nOlá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaId + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.\n");
    }
}
