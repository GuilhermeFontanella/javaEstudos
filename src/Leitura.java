import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano:");
        int ano = leitura.nextInt();

        System.out.println("Digite sua nota:");
        double nota = leitura.nextDouble();

        System.out.println(String.format("""     
                Filme: %s,
                Ano: %d,
                nota: %.2f
                """, filme, ano, nota));
    }
}
