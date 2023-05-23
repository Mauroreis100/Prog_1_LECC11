package Exercicio_2;

import java.util.Vector;

public class OperacoesFilme implements Operacoes {

	//Adicionar um filme
	public boolean adicionarFilme(Filme film,Vector filmes) {
		return filmes.add(film);
	}
	
	//Verificar se um filme existe
		public boolean verificarExistencia(String filme,Vector filmes) {
			for(int i=0;i<filmes.size();i++) {
				if(((Filme)filmes.get(i)).getNomeFilme()==filme) {
					return true;
				}
			}
			return false;
		}
		
		//Metodo para atualizar o genero
		public void atualizarGenero(String filme,String genero,Vector filmes) {
			if(verificarExistencia(filme, filmes)==true) {
				for(int i=0;i<filmes.size();i++) {
					if(((Filme)filmes.get(i)).getNomeFilme()==filme) {
						((Filme)filmes.get(i)).setGenero(genero);
					}
				}
			}
		}
		
		//listar os filmes
		public void listarFilmes(Vector filmes) {
			for(int i=0;i<filmes.size();i++) {
				System.out.println(((Filme)filmes.get(i)).toString());
			}
		}

		//Listar filmes atraves do ano de lancamento
		public void filmeAnoLancamento(int anoLancamento,Vector filmes) {
			for(int i=0;i<filmes.size();i++) {
				if((((Filme) filmes.get(i)).getAnoLancamento())==anoLancamento) {
					System.out.println(((Filme) filmes.get(i)).getNomeFilme());
				}
			}
		}
		
		//Devolver o nome atraves do indice fornecido
		public void nomeAtravesIndice(int indice,Vector filmes) {
			System.out.println(((Filme)filmes.get(indice)).getNomeFilme());
		}
		
		
		//Remover um filmes
		public boolean removerFilme(String nomeFilme,Vector filmes) {
			for(int i=0;i<filmes.size();i++) {
				if((((Filme) filmes.get(i)).getNomeFilme()).equalsIgnoreCase(nomeFilme)) {
					filmes.removeElement(filmes.get(i));
					return true;
				}
			}
			return false;
		}
		
		//Inserir um filme
		public void inserirFilme(Vector filmes,Filme film,int posicao) {
			filmes.insertElementAt(film,posicao);
		}
}
