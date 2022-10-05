/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celularsimples;
import java.io.Serializable;
/**
 *
 * @author mauro
 */
public class Contacts{
    
    //Variáveis de instância 
    private int numeroTel;
    private String nome;

    // Construtor de Account sem parâmetros
    public Contacts() {
    }
    
// Construtor de Contacts que recebe 1 parâmetro
    public Contacts(String nome) {
        // atribui numeroTel à variável de instância numeroTel
        this.nome=nome;
    }
    
// Construtor de Account que recebe dois parâmetros
    public Contacts(int numeroTel, String nome) {
        // atribui numeroTel e nome à variável de instância numeroTel e nome
        this.numeroTel = numeroTel;
        this.nome = nome;
        
    }
//método que retorna o numero de telefone
    public int getNumeroTel() {
        return numeroTel;
    }

    //método que retorna o nome
    public String getNome() {
        return nome;
    }

 //Método que define o número do telefone
    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
//Método que definre o nome 
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String toString(){
        return "\nNome: "+nome+"\n"+"Número: "+numeroTel+"\n";
    }
}// fim da classe Contacts
