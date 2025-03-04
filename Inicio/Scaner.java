import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        double peso = entrada.nextDouble();
        int idade = entrada.nextInt();
        char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

        System.out.println("-----------------------");
        System.out.println(nome);
        System.out.println(peso);
        System.out.println(idade);
        System.out.println(sexo);
    }
}
