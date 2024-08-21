package usuarios;

import java.util.Date;
public class Usuario {
    private int IdUsuario;
    private String NomeUsuario;
    private int NumeroCPF;
    private String DescricaoSexo;
    private Date DataAniversario;
    private double ValorSaldo;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNomeUsuario(){
        return NomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        NomeUsuario = nomeUsuario;
    }

    public int getNumeroCPF() {
        return NumeroCPF;
    }

    public void setNumeroCPF(int numeroCPF) {
        NumeroCPF = numeroCPF;
    }

    public String getDescricaoSexo(){
        return DescricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        DescricaoSexo = descricaoSexo;
    }

    public Date getDataAniversario() {
        return DataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        DataAniversario = dataAniversario;
    }

    public double getValorSaldo() {
        return ValorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        ValorSaldo = valorSaldo;
    }
}
