// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        /** TIPOS PRIMITIVOS JAVA
         *
         * boolean = true/false;
         * byte = valores de -128 a 127;
         * char = caracteres individuais "a";
         * short = numeros inteiros de 16 bits -32.768 a 32.767;
         * int = numeros inteiros de 32 bits = -2.147.483.648 a 2.147.483.647;
         * long = numeros inteiros de 64 bits = -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807;
         * float = numéricos de ponto flutuante, ocupa 32 bits de memória 8.5;
         * double = similar o float, ocupa 64 bits de memória. representa números decimais com até 15 dígitos
         */

        int ano = 2022;
        boolean incluidoPlano = false;
        double nota = 8.5;
        double nota2 = 5.0;
        double media = (nota + nota2) / 2;
        String nomeFilme = "Top Gun";

        /**
         * Formatar textos em Java é utilizando o método format()
         *  Esse método permite formatar um texto utilizando diversos placeholders,
         *  que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder.
         *  Por exemplo, %s indica que uma String será inserida no placeholder,
         *  %d indica um valor inteiro e %f indica um valor decimal. Vamos ver um exemplo:
         *
         *  String nome = "Maria";
         * int idade = 30;
         * double valor = 55.9999;
         * System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
         */

        System.out.println(String.format("""
                Esse é o Screen Match,
                Voce está assistindo o filme: %s,
                Ano de lancamento: %d,
                Nota geral do filme: %.2f.
                """, nomeFilme, ano, media));

        double x = 10.5;
        int y = (int) x; // casting explícito

        double temperaturaC = 25;
        double temperaturaF = (temperaturaC * 1.8) + 32;
        System.out.println("A temperatura é: " + temperaturaF + "F");
    }
}