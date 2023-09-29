import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();
        System.out.println("numero da conta:");
        Integer numero = sc.nextInt();
        System.out.println("Por favor, digite o nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Digite o Saldo:");
        Double saldo = sc.nextDouble();
       
        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
    

        sc.close();
    }   
}
