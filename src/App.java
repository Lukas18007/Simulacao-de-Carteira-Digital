import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double saldo_atual = 1500;

        String perguntaoqueFazer = "Qual operação gostaria de fazer?";
        System.out.println(perguntaoqueFazer);

        System.out.println("Digite 1 para: Sacar dinheiro");
        System.out.println("Digite 2 para: Fazer um depósito");
        System.out.println("Digite 3 para: Consultar saldo atual");

        System.out.println("Resposta: ");
        int resposta = scanner.nextInt();

        if (resposta != 1 && resposta != 2 && resposta != 3){
            System.err.println("Operação Inválida");
        }
        if (resposta == 1){
            String Valor_saque_questao = "Qual o valor que você gostaria de sacar?";
            System.out.println(Valor_saque_questao);

            System.out.println("Valor em R$:");
            double resposta_saque = scanner.nextDouble();

            if (resposta_saque > saldo_atual){
                System.err.println("Saldo insuficiente para esse valor de saque!");
            } else {
                double valor_restante = saldo_atual - resposta_saque;
                saldo_atual = valor_restante;
                System.out.println("Você sacou R$"+resposta_saque);
                System.out.println("Seu saldo restante é de R$"+saldo_atual);
            }
        }
        if (resposta == 2){
            String Valor_deposito_questao = "Qual o valor que você gostaria de depositar?";
            System.out.println(Valor_deposito_questao);

            System.out.println("Valor em R$:");
            double resposta_deposito = scanner.nextDouble();

            double valor_novo = saldo_atual + resposta_deposito;
            saldo_atual = valor_novo;
            System.out.println("Você depositou R$"+resposta_deposito);
            System.out.println("Seu saldo atual é de R$"+saldo_atual);
        

        }
        if (resposta ==3) {
            System.out.println("Seu saldo atual é de R$"+saldo_atual);
        }
    }
}
