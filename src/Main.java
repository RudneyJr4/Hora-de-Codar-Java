import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //ex01

        String planeta = "Plutão";
        // Cria a variável 'planeta' e atribui o valor "Plutão"

        System.out.println("O planeta é: " + planeta);
        // Exibe o valor da variável

        //ex02
        Scanner entrada = new Scanner(System.in);
        String nome = "Exemplo";
        System.out.println("Qual é o seu Nome?");
        nome = entrada.nextLine(); //Altamente tipado
        System.out.println("Olá, " + nome);
        entrada.close();

        //ex03
        Scanner entrada = new Scanner(System.in);
        String nome = "Exemplo";
        System.out.println("Qual é o seu Nome?");
        nome = entrada.nextLine(); //Altamente tipado
        int= 0;
        System.out.println("Qual é o seu Nome?");
        System.out.println("Olá, " + nome);
        entrada.close();






    }
}
