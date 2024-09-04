import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args)  {
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso programa
        //Obter pela Scanner os valores digitados no Terminal
        //Exibir a mensagem conta criada
        
        Locale.setDefault(Locale.US); //Adicionei " Locale " por dar erro ao usar sem essa linha
        Scanner   fazLeitura = new Scanner(System.in);
       int numConta;
       String agencia;
       String nomeCliente;
       double saldo;

        System.out.println("Por favor, digite o seu nome para cadastro !");
        nomeCliente = fazLeitura.nextLine();

       System.out.println("Por favor, digite o número da Agência !");
       agencia = fazLeitura.nextLine();

       System.out.println("Por favor, digite o número da Conta !"  );
        numConta = fazLeitura.nextInt();

        System.out.println("Por Favor, insira o valor para adicionar ao saldo");
        saldo = fazLeitura.nextDouble();
       
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+ numConta +" e seu saldo "+ saldo + " já está disponível para saque");
        
    }

}
