package projetofintech.funcoes;

import usuarios.Usuario;

public class Saque {
    private int IdSaque;
    private double ValorSaque;
    public int getIdSaque() {
        return IdSaque;
    }

    public void setIdSaque(int idSaque) {
        IdSaque = idSaque;
    }

    public double getValorSaque() {
        return ValorSaque;
    }

    public void setValorSaque(double valorSaque) {
        ValorSaque = valorSaque;
    }

    public boolean Sacar(Usuario usuario, double valorSaque){
        if (valorSaque > usuario.getValorSaldo()) {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valorSaque);
            return false;
        } else {
            double novoSaldo = usuario.getValorSaldo() - valorSaque;
            usuario.setValorSaldo(novoSaldo);
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
            return true;
        }
    }
}
