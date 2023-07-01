package numero5;

import java.util.Vector;

public interface Comportamento {
void adicionaPessoa(int id, String nome, int idade, float atura);
void removePessoa(int id);
Pessoa buscaPessao(int idade);//Devolve as Pessoas cuja idade = parametro passado
Pessoa buscaNome(String nome);
Vector relatorio();//Devolve o vector completo usado o toString para imprimir.
/*Crie as classes necessárias para satisfazer  o pedido do Arquiteto de Software .
 * NB: 	use o Conceito casting assumindo que o vector passado seja generico */
}
