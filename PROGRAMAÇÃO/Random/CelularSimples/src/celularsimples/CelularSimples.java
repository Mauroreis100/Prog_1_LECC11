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

        //Variavel acessar a classe MobilePhone 
        MobilePhone acessar = new MobilePhone();

        //Variavel para acessar a classe Contacts
        Contacts contacto = new Contacts();

        //String das opções do exercício
        String menu = "0-SAIR \n 1-IMPRIMIR LISTA DE CONTACTOS \n 2-ADICIONAR NOVO CONTACTO \n 3-ACTUALIZAR CONTACTO EXISTENTE \n 4-REMOVER CONTACTO \n 5-BUSCAR/ENCONTRAR CONTACTO";

        int opcao = 0;

        //
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 0: {
                    //Saída do Programa
                    JOptionPane.showMessageDialog(null, "SAÍNDO DO PROGRAMA, PRESSIONE OK");
                }
                break;
                case 1: {
                    //Impressão de todos os contactos
                    acessar.display();

                }
                break;
                case 2: {
                    try {
                        //Adição de contactos
                        System.out.println("--------Adicionando novo contacto------");
                        String nome = JOptionPane.showInputDialog("Digite o nome");
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                        contacto = new Contacts(numero, nome);
                        // Chamada do metodo add()
                        acessar.add(contacto);
                        System.out.println("----------------------------------------");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inserção Inválida, tente de novo!", "Alert", JOptionPane.WARNING_MESSAGE);
                        System.out.print(("Inserção Inválida, tente denovo"));
                    }
                }
                break;
                case 3: {
                    //Actualização de um contacto
                    String nomeNovo = JOptionPane.showInputDialog("Digite o nome que pretende actualizar");
                    acessar.update(nomeNovo);
                }
                break;
                case 4: {
                    //Remover Contacto
                    String nomeRemove = JOptionPane.showInputDialog("Qual é o nome do contacto que pretende remover?");

                    // Invocar método delete()
                    acessar.delete(nomeRemove);

                }
                break;
                case 5: {
                    //Impressão especificada de um contacto
                    String nome = JOptionPane.showInputDialog("Digite o nome que quer imprimir");
                    try {
                        System.out.println(acessar.findContacto(nome).toString());
                    } catch (Exception e) {
                        System.out.println("Nome inválido. Tente de novo");
                    }

                }
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!", "Alert", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Opção inválida! Tente De novo");
                    break;
            }//Fim de switch

        } while (opcao != 0);//do-while
    }//Fim de main

}//fim da class
