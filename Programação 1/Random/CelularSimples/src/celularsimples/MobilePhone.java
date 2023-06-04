/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celularsimples;

import javax.swing.JOptionPane;

import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class MobilePhone {

    //Uma lista vazia que contém, neste caso irá guardar todos os atributos da nossa classe Contacts
    ArrayList<Contacts> lista;

    public MobilePhone() {
        //ArrayList publica 
        lista = new ArrayList<>();
    }

    //Método para adicionar contacto
    public void add(Contacts contacts) {

        //Verificação se existe ou não
        if (find(contacts.getNome().toUpperCase()) == false) {
            lista.add(contacts);//Adição dos dados inseridos na Main
            JOptionPane.showMessageDialog(null, "Nome Inserido com Sucesso!");
            System.out.println("\n" + contacts.getNome() + "\nInserido com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome já Existe!", "Alert", JOptionPane.WARNING_MESSAGE);
            System.out.println("Nome: " + contacts.getNome() + "\nJá foi gravado!");

        }

    }

//Metodo que retorna verdadeiro ou falso caso encontre um contacto já existente
    public boolean find(String nome) {

        for (Contacts l : lista) {
            if (nome.toUpperCase().equals(l.getNome().toUpperCase())) {

                return true;
            }
        }
        return false;
    }

    //Método que apaga os contactos
    public void delete(String nome) {
        //Inicialização e declaração do objecto em null
        Contacts apagarNr = null;

        // Verificação de caso o objecto seja null não faz nada. O return vem do findContacto
        if (findContacto(nome.toString()) == null) {
            JOptionPane.showMessageDialog(null, "Nome não existe", "Alert", JOptionPane.WARNING_MESSAGE);
            System.out.println(nome + " não existe!\n");
        } else {
            apagarNr = findContacto(nome);
            lista.remove(apagarNr);//Apaga o objecto
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            System.out.println(nome + ", foi Removido com sucesso");
        }
    }

//Método que retorna o objecto caso encontre o nome especificado
    //Usado para o metodo remove e update
    public Contacts findContacto(String nome) {
        //Procura os objectos
        for (Contacts l : lista) {
            if (nome.toUpperCase().equals(l.getNome().toUpperCase())) {//caso seja igual ao nome introduzido
                return l;
            }
        }
        //Se não encontrar irá retornar null
        return null;
    }

    //Actualização do objecto
    public void update(String nome) {
        try {
            //CASO encontre no find
            if (find(nome.toUpperCase())) {
                //Irá retornar o objecto através do finContacto
                Contacts contacto = findContacto(nome);
                System.out.println(contacto);
                String nomeNovo = JOptionPane.showInputDialog("Nome do novo ");
                int numeroNovo = Integer.parseInt(JOptionPane.showInputDialog("Número novo"));
                //Set de nome e numero de telefone
                contacto.setNome(nomeNovo);
                contacto.setNumeroTel(numeroNovo);
                JOptionPane.showMessageDialog(null, "Actualizado com sucesso!");
                System.out.println("Actualizado com sucesso!");
                System.out.println("--------------------------------------");
            } else {
                JOptionPane.showMessageDialog(null, "Nome não existe", "Alert", JOptionPane.WARNING_MESSAGE);
                System.out.println("Nome não encontrado na lista\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nome não existe", "Alert", JOptionPane.WARNING_MESSAGE);
            System.out.println("\n----------Erro------------\n");
        }
    }

    //Imprime todos os objectos
    public void display() {
        //Se a lista estiver vazia...
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista de Contactos Vazia", "Alert", JOptionPane.WARNING_MESSAGE);
            System.out.println("Não tem nenhum contacto\n");
        }
        for (Contacts contacto : lista) {
            System.out.println(contacto.toString());
        }
    }

}
