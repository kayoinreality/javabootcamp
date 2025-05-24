import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Digite o seu nome: ");
        String nomeTitular = scanner.next();
        
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: R$ " + saldo);
        
    }

}
