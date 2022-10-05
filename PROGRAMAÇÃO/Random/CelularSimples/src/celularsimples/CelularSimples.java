/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celularsimples;

import javax.swing.JOptionPane;

/**
 *
 * @author mauro
 */
public class CelularSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //
        MobilePhone acessar = new MobilePhone();

        Contacts contacto = new Contacts();
        // Initial Employee record
        // Using mutators to had code the data
        //  contacto.setNumeroTel(6862);
        //contacto.setNome("Mauro test");

        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        // acessar.add(contacto);
        // Creating Scanner Object to read input
        String menu = "0-SAIR \n 1-IMPRIMIR LISTA DE CONTACTOS \n 2-ADICIONAR NOVO CONTACTO \n 3-ACTUALIZAR CONTACTO EXISTENTE \n 4-REMOVER CONTACTO \n 5-BUSCAR/ENCONTRAR CONTACTO";
        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 0: {
                    JOptionPane.showMessageDialog(null, "SAÍNDO DO PROGRAMA, PRESSIONE OK");
                }
                break;
                case 1: {
                    acessar.display();

                }
                break;
                case 2: {
                    System.out.println("--------Adicionando novo contacto------");
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                    contacto = new Contacts(numero, nome);
                    // Call add() record
                    acessar.add(contacto);

                }
                break;
                case 3: {
                    String nomeNovo = JOptionPane.showInputDialog("Digite o nome que pretende actualizar");
                    acessar.update(nomeNovo);
                }
                break;
                case 4: {
                    //Remover Contacto
                    String nomeRemove = JOptionPane.showInputDialog("Qual é o nome do contacto que pretende remover?");

                    // Invoke remove/delete record
                    acessar.delete(nomeRemove);

                }
                break;
                case 5: {
                    String nome = JOptionPane.showInputDialog("Digite o nome que quer imprimir");
                    System.out.println(acessar.findContacto(nome).toString());

                }
                break;

                //	System.out.println(
                //		"Student id does not exist\n");
                //	}
                default:

                    break;
            }

        } while (opcao
                != 0);
    }

}
