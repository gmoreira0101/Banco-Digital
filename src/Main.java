import usuarios.Usuario;
import usuarios.UsuarioPremium;
import projetofintech.funcoes.Deposito;
import projetofintech.funcoes.Saque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioComum = new Usuario();
        usuarioComum.setIdUsuario(1);
        usuarioComum.setNomeUsuario("Everton");
        usuarioComum.setNumeroCPF(123456);
        usuarioComum.setDescricaoSexo("Masculino");
        usuarioComum.setDataAniversario(new Date());
        usuarioComum.setValorSaldo(500.0);

        UsuarioPremium usuarioPremium = new UsuarioPremium();
        usuarioPremium.setIdUsuario(2);
        usuarioPremium.setPremium(true);
        usuarioPremium.setNomeUsuario("Rato");
        usuarioPremium.setNumeroCPF(123454);
        usuarioPremium.setDescricaoSexo("Não definido");
        usuarioPremium.setDataAniversario(new Date());
        usuarioPremium.setValorSaldo(1500.00);


        System.out.println("Informações do Usuário Comum:");
        exibirInformacoesUsuario(usuarioComum);

        System.out.println("\nInformações do Usuário Premium:");
        exibirInformacoesUsuario(usuarioPremium);
        Deposito depositoo = new Deposito();
        depositoo.setValorDeposito(200.00);
        depositoo.setIdDeposito(1);
        depositoo.Depositar(usuarioComum, depositoo.getValorDeposito());
        System.out.println("Informações do Usuário Comum:");
        exibirInformacoesUsuario(usuarioComum);
        Saque saque = new Saque();
        saque.setValorSaque(200);
        saque.setIdSaque(2);
        saque.Sacar(usuarioPremium, saque.getValorSaque());
        System.out.println("\nInformações do Usuário Premium:");
        exibirInformacoesUsuario(usuarioPremium);

    }
    public static void exibirInformacoesUsuario(Usuario usuario) {
        System.out.println("ID: " + usuario.getIdUsuario());
        System.out.println("Nome: " + usuario.getNomeUsuario());
        System.out.println("CPF: " + usuario.getNumeroCPF());
        System.out.println("Sexo: " + usuario.getDescricaoSexo());
        System.out.println("Data de Aniversário: " + usuario.getDataAniversario());
        System.out.println("Saldo: " + usuario.getValorSaldo());
    }
}
