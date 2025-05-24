import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

      try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Digite o seu nome: ");
        String nomeTitular = scanner.next();
        
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá "+nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia + ", conta "+numeroConta + " e seu saldo "+saldo+ " já está disponível para saque");
        
        scanner.close();
    }
    }

}
