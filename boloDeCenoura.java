package estudosDeContaPropria;
import java.util.Scanner;

public class boloDeCenoura {

    public static void main(String[] args) {
        exibirTitulo();
        int quantidadeDePessoas = lerQuantidadeDePessoas();
        exibirIngredientes(quantidadeDePessoas);
        System.out.println("=================================");
    }

    // Exibe o título da receita
    public static void exibirTitulo() {
        System.out.println("=================================");
        System.out.println("Receita de Bolo de Cenoura");
        System.out.println("Medidas de acordo com a quantidade de pessoas (Média 150g por pessoa)");
        System.out.print("Insira a quantidade de pessoas: ");
    }

    // Lê a quantidade de pessoas do usuário
    public static int lerQuantidadeDePessoas() {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        scanner.close();
        return quantidade;
    }

    // Calcula e exibe os ingredientes
    public static void exibirIngredientes(int quantidadeDePessoas) {
        int quantidadeDeMassa     = quantidadeDePessoas * 30; // 30g de farinha de trigo
        int quantidadeDeCenoura   = quantidadeDePessoas * 50; // 50g de cenoura
        int quantidadeDeOvo       = quantidadeDePessoas * 1;  // 1 ovo
        int quantidadeDeAcucar    = quantidadeDePessoas * 25; // 25g de açúcar
        int quantidadeDeOleo      = quantidadeDePessoas * 20; // 20ml de óleo
        int quantidadeDeFermento  = quantidadeDePessoas * 3;  // 3g de fermento em pó

        System.out.println();
        System.out.println("Ingredientes necessários:");
        System.out.println("------------------------");
        System.out.println("Farinha de trigo  : " + quantidadeDeMassa     + "g");
        System.out.println("Cenoura           : " + quantidadeDeCenoura   + "g");
        System.out.println("Ovo               : " + quantidadeDeOvo       + " unidade(s)");
        System.out.println("Açúcar            : " + quantidadeDeAcucar    + "g");
        System.out.println("Óleo              : " + quantidadeDeOleo      + "ml");
        System.out.println("Fermento em pó    : " + quantidadeDeFermento  + "g");
        System.out.println("------------------------");
        System.out.println("Farinha de trigo :" + quantidadeDeMassa + "g");
        System.out.println("Cenoura :" + quantidadeDeCenoura + "g");
        System.out.println("Ovo :" + quantidadeDeOvo + " unidade(s)");
        System.out.println("Açúcar :" + quantidadeDeAcucar + "g");
        System.out.println("Óleo :" + quantidadeDeOleo + "ml");
        System.out.println("Fermento em pó :" + quantidadeDeFermento + "g");
    }
}
