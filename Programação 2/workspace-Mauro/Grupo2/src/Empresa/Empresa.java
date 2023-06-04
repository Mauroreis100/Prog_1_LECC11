package Empresa;
import java.util.ArrayList;
import java.util.List;
import Funcionario.Funcionario;

public class Empresa {



    public static double calcularFolhaPagamento(List<Funcionario> funcionarios) {
        double folhaPagamento = 0;
        List<Funcionario> f = new ArrayList<Funcionario>();
        folhaPagamento += ((Funcionario) funcionarios).calcularPagamento(((Funcionario) funcionarios).getSalario());
        return folhaPagamento;
    }
}
