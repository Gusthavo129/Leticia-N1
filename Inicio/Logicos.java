import java.util.Scanner;

public class Logicos {
    
    public static void main(String[] args) {
        System.out.println("digite o sexo: (1 para 'M', 2 para 'F')");
        Scanner entrada = new Scanner(System.in);
        
        char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
        
        if (sexo == 'F') {
        	System.out.println("FEMININO");
        } else if (sexo == 'M') {
        	System.out.println("MASCULINO");
        }else {
        	System.out.println("ENTRADA INVÁLIDA");
        }
    }
}
