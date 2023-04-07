import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String saudacaoInicial = "Dados iniciais do cliente:";
        String acao = "Qual operacao voce deseja realizar?";
        String opcoes = """
                1 - Consultar saldo
                2 - Depositar valor
                3 - Saque
                4 - Consultar extrato
                5 - Sair
                """;

        String cliente = "Guilherme Fontanella";
        String conta = "Corrente";
        String movimentacao = "";
        double saldo = 10000.00;


        // Saudacao inicial
        System.out.println(String.format("""
                *******************************************
                %s
                
                - Nome:               %s
                - Conta:              %s
                - Saldo disponível    %.2f
                *******************************************
                """,saudacaoInicial, cliente, conta, saldo));

        // solicitando açao
        System.out.println(String.format("""
                *******************************************
                %s
                
                %s
                *******************************************
                """, acao, opcoes));

        int acaoSelecionada = input.nextInt();

        while (acaoSelecionada != 5) {
            if (acaoSelecionada == 1) {
                System.out.println(String.format("""
                *******************************************
                
                Saldo disponível: R$ %.2f           
                
                *******************************************
                """, saldo));

                System.out.println(String.format("""
                *******************************************
                %s
                
                %s
                *******************************************
                """, acao, opcoes));
                acaoSelecionada = input.nextInt();

            } if (acaoSelecionada == 2) {
                System.out.println(String.format("""
                *******************************************
                
                Digite quanto deseja depositar:           
                
                *******************************************
                """));
                double valorDep = input.nextDouble();
                if (valorDep > 0) {
                    saldo += valorDep;
                    movimentacao += String.format("""
                            Depósito: R$ %.2f
                            """, valorDep);
                } else {
                    System.out.println("Valor inválido");
                }
                System.out.println(String.format("""
                *******************************************
                %s
                
                %s
                *******************************************
                """, acao, opcoes));
                acaoSelecionada = input.nextInt();

            } if (acaoSelecionada == 3) {
                System.out.println(String.format("""
                    *******************************************
                    
                    Digite quanto deseja sacar:          
                    
                    *******************************************
                    """));
                double valorSaque = input.nextDouble();
                if (valorSaque > 0 && valorSaque <= saldo) {
                    saldo -= valorSaque;
                    movimentacao += String.format("""
                            Saque: R$ %.2f
                            """, valorSaque);
                } else {
                    System.out.println("Valor inválido");
                }
                System.out.println(String.format("""
                    *******************************************
                    %s
                    
                    %s
                    *******************************************
                    """, acao, opcoes));
                acaoSelecionada = input.nextInt();

            } if (acaoSelecionada == 4) {
                System.out.println(String.format("""
                    *******************************************
                    
                    Seu extrato:  
                    %s        
                    
                    *******************************************
                    """, movimentacao));

                System.out.println(String.format("""
                    *******************************************
                    %s
                    
                    %s
                    *******************************************
                    """, acao, opcoes));
                acaoSelecionada = input.nextInt();

            } if (acaoSelecionada == 5) {
                System.out.println(String.format("""
                    *******************************************
                    
                    Obrigado por usar nossos serviços. Até breve      
                    
                    *******************************************
                    """));
            }
        }

    }
}
