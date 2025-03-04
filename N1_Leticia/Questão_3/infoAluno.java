package N1_Leticia.Questão_3;

import java.time.LocalDate;

public class infoAluno {
    public static void main(String[] args){
        alunos gusthavo = new alunos( );
        gusthavo.nome = "gusthavo Reberte";
        gusthavo.dataDeNascimento = LocalDate.of(2005,03,20);
        gusthavo.idade = 19;
        gusthavo.cpf = "06164738180";
        gusthavo.email = "gusthavoreberte2005@gmail.com";
        gusthavo.endereço = "Rua 3, Quadra 5, Lote 6";
        gusthavo.curso = "ADS";
        gusthavo.idAluno = 1;
        gusthavo.n1 = 10.0;
        gusthavo.n2 = 7.6;
        gusthavo.n3 = 9.44;

        System.out.println(gusthavo.nome);
        System.out.println(gusthavo.dataDeNascimento);
        System.out.println(gusthavo.idade);
        System.out.println(gusthavo.cpf);
        System.out.println(gusthavo.email);
        System.out.println(gusthavo.endereço);
        System.out.println(gusthavo.curso);
        System.out.println(gusthavo.idAluno);
        System.out.println(gusthavo.n1);
        System.out.println(gusthavo.n2);
        System.out.println(gusthavo.n3);

    }   
}
