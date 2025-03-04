package N1_Leticia.Questão_2;
//Questão 2
public class Conta {
    int numeroDaConta;
    int numeroDaAgencia;
    double saldo;
    
    public Conta(int numeroDaConta, int numeroDaAgencia, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.saldo = saldo;
    }

    public void deposito (double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Novo saldo é de:" + saldo);
        }
        else {
            System.out.println("Valor invalido");
        }
    }
    public boolean saque (double valor, double saque){
        if (valor < saldo){
            saldo -= valor;
            System.out.println("Aprovados");
            return true;
        }
        else{
            System.out.println("Negado");
            return false;
        }
    } 
    public boolean transferencia(double valor, double transferencia){
        if (valor < transferencia){
            saldo -= transferencia;
            System.out.println("Aprovados");
            return true;
        }
        else{
            System.out.println("Negado");
            return false;
        }
    }
}
