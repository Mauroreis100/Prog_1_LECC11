package logica;
public class Cliente {
  private int id;
  private String nome, sexo;
  
 //Metodos getters devolvem o valor 
 //Metodos setters permitem mudar o valoe
public int getId(){
	return id;
}
public void setId(int id){
	this.id=id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}

}
