/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celularsimples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author mauro
 */
public class MobilePhone {

    //Uma lista vazia que contém, neste caso iráguardar todos os atributos da nossa classe Contacts
    ArrayList<Contacts> lista;

    public MobilePhone() {
        lista = new ArrayList<>();
    }

    public void add(Contacts contacts) {
        // Checking if a record already exists or not,
        // if not add it to Record list, Otherwise
        // error display message
       /* for (Contacts l : lista) {
            System.out.println(lista.indexOf(l) + l.getNome());
            if (l.getNome() == "Mauro") {
                System.out.println("Verdade");
            }
        }*/

        // System.out.print(contacts.getNome()+" "+find(contacts.getNome()));
        if (find(contacts.getNome().toUpperCase()) == false) {
            lista.add(contacts);
            
            //  System.out.println(contacts.toString());
            JOptionPane.showMessageDialog(null,"Nome Inserido com Sucesso!");
            System.out.println("\n"+contacts.getNome()+"\nInserido com Sucesso");
        } else {
            // Print statement
              JOptionPane.showMessageDialog(null,"Nome já Existe!","Alert",JOptionPane.WARNING_MESSAGE);
            System.out.println("Nome: "+contacts.getNome()+"\nJá foi gravado!");
           
        }
    }

    // Method 2
    // Searching Record
    // @param idNimber
    //  @return
    public boolean find(String nome) {
        
       
        for (Contacts l : lista) {
            if (nome.toUpperCase().equals(l.getNome().toUpperCase())) {
               
                return true;
            }
        }
        return false;
    }

    // Method 3
    // Delete Record
    // @param recIdNumber
    public void delete(String nome) {
        Contacts apagarNr = null;

        // Iterating record list
        for (Contacts ll : lista) {

            // Finding record to be deleted by id Number
            if (ll.getNome() == nome) {
                apagarNr = ll;
            }
        }

        // If recordDel is null, then show error message,
        // otherwise remove the record from Record list
        if (apagarNr == null) {

            // Displaying no record found
            System.out.println("Nome não existe");
        } else {

            lista.remove(apagarNr);

            // Display message for successful deletion of
            // record
            System.out.println(
                    "Successfully removed record from the list");
        }
    }

    // Method 4
    // Finding Record
    // @param idNumber
    // @return
    public Contacts findContacto(String nome) {
        // Iterate Record list
        // using for each loop
        for (Contacts l : lista) {
            if (nome.toUpperCase().equals(l.getNome().toUpperCase())) {
               
                return l;
            }
        }
        return null;
    }

    // Method 5
    // Update Record
    // @param id
    // @param input
    public void update(String nome) {

        if (find(nome.toUpperCase())) {
            Contacts contacto=findContacto(nome);
            // Display message only
            System.out.println(contacto);
            String nomeNovo = JOptionPane.showInputDialog("Nome do novo ");
            int numeroNovo = Integer.parseInt(JOptionPane.showInputDialog("Número novo"));
            contacto.setNome(nomeNovo);
            contacto.setNumeroTel(numeroNovo);
            System.out.println("Actualizado com sucesso");
            System.out.println("--------------------------------------");
        } else {

            // Print statement
            System.out.println("Nome não encontrado na lista");
        }
    }

    // Method 6
    // Display Records
    public void display() {

        // If record list is empty then
        // print the message below
        if (lista.isEmpty()) {

            // Print statement
            System.out.println("Não tem nenhum contacto\n");
        }
        // Iterating Record list
        // using for each loop
        for (Contacts contacto : lista) {
            // Printing the list
            System.out.println(contacto.toString());
        }
    }

}
