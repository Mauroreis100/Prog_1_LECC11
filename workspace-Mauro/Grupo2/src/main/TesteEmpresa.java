package main;
import java.util.*;

import Empresa.*;
import Funcionario.*;
import Empresa.*;
public class TesteEmpresa {
public static void main(String[] args) {

    Funcionario vendedor = new Vendedor("Grácio", 2000.0, 10000.0);
    Funcionario atendente = new Atendente("Milton", 1500.0);
	Funcionario gerente = new Gerente("Mauro", 4000);
    
    // Criando uma lista de funcionários
    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(gerente);
    funcionarios.add(vendedor);
    funcionarios.add(atendente);
    
    // Calculando a folha de pagamento
    Empresa minhaEmpresa = new Empresa();
    double totalPagamentos = minhaEmpresa.calcularFolhaPagamento(funcionarios);
    System.out.println("Total de pagamentos: " + totalPagamentos);
}
}
