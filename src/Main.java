

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        exercicio3();


    }

    public static void exercicio1(){
        //ex01
        String planeta = "Plutão";
        // Cria a variável 'planeta' e atribui o valor "Plutão"

        System.out.println("O planeta é: " + planeta);
        // Exibe o valor da variável
    }

    public static void exercicio2(){
        //ex02
        Scanner entrada = new Scanner(System.in);
        String nome = "Exemplo";
        // Cria a variável 'planeta' e atribui o valor "Plutão"
        System.out.println("Qual é o seu Nome?");
        nome = entrada.nextLine(); //Altamente tipado
        System.out.println("Olá, " + nome);
        // Exibe o valor da variável

        entrada.close();

    }
    public static void exercicio3(){
        //ex03
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu Nome?");
        String nome = entrada.nextLine(); //Altamente tipado
        System.out.println("Qual é a sua idade?");
        int idade = entrada.nextInt();
        // Cria a variável 'planeta' e atribui o valor "Plutão"


        System.out.println("Olá, " + nome);
        System.out.print("sua idade é " + idade);
        // Exibe o valor da variável

    }
}
