package projetofintech.funcoes;
import usuarios.Usuario;

public class Deposito {
    private int IdDeposito;
    private double ValorDeposito;


    public double getValorDeposito() {
        return ValorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        ValorDeposito = valorDeposito;
    }
    public boolean Depositar(Usuario usuario, double valorDeposito) {
        if (valorDeposito > 0) {
            double novoSaldo = usuario.getValorSaldo() + valorDeposito;
            usuario.setValorSaldo(novoSaldo);
            System.out.println("Deposito realizado com sucesso seu novo saldo é de:" + novoSaldo);
            return true;
        } else {
            System.out.println("Impossivel realizar o deposito nesse valor");
            return false;
        }
    }

    public int getIdDeposito() {
        return IdDeposito;
    }

    public void setIdDeposito(int idDeposito) {
        IdDeposito = idDeposito;
    }
}