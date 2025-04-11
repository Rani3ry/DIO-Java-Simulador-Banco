import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String Nome_Cliente = scanner.nextLine();
        
        System.out.println("Agora digite a sua agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite a sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Por último, digite o saldo da sua conta:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("sua agência é: " + agencia + ", conta: " + numero);
        System.out.println("Seu saldo atual é " + saldo + " e já está disponível para saque\");");
    }
}
