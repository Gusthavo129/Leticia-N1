package N1_Leticia.Questão_2;
import java.time.LocalDate;

public class Cadastro { //cadastroClientes
    int numeroDoAgencia;
    int numeroDaConta;
    String nome;
    int cpf;
    LocalDate dataDeNascimento;
    int telefone;
    String email;
    String endereco;

    public void cadastrarClientes(int numeroDoAgencia, int numeroDaConta, String nome, int cpf, LocalDate dataDeNascimento,int telefone, String email, String endereco){
        this.numeroDoAgencia = numeroDoAgencia;
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        System.out.println("Cliente cadastrado com sucesso!");
    }
}