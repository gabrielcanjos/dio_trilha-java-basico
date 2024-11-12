import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
       
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt(); 
        
        scanner.nextLine(); 
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); 
        
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        
       
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
       
        scanner.close();
    }
}
