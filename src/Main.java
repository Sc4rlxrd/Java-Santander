import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("BEM VINDO! AO BANCO SCARLXRD");
        System.out.print("Informe o seu nome completo: "); //Mario andrade
        nomeCliente = scanner.next();
        System.out.println();
        System.out.print("Informe sua agência: "); //067-8
        agencia = scanner.next();
        System.out.println();
        System.out.print("Informe o número da conta: "); //1021
        numero = scanner.nextInt();
        System.out.println();
        System.out.println("Olá: " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + "  e seu saldo: " + saldo + " já está disponível para saque");

    }
}