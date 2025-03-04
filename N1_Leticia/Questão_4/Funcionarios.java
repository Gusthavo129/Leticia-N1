package N1_Leticia.Questão_4;
import java.time.LocalDate;
public class Funcionarios {
    int idFuncionario;
    String nome;
    String cpf;
    int telefone;
    String email;
    String endereco;
    LocalDate dataDeNascimento;
    String cargo;
    double salario;
    double impostos;
    double descontosDeBeneficios;
    double beneficios;

    public Funcionarios (double salario, double impostos, double descontosDeBeneficios, double beneficios) {
        this.salario = salario;
        this.impostos = impostos;
        this.descontosDeBeneficios = descontosDeBeneficios;
        this.beneficios = beneficios;
    }

   public double descontos() {
    return impostos += descontosDeBeneficios;
   }
   public double salariobruto() {
    return salario += beneficios;
   }
   public double salarioliquido (double descontos, double salariobruto){
    return salariobruto -= descontos;
   }
}
