/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produtorecursivo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class ProdutoRecursivo {
public static Scanner ler = new Scanner(System.in);
    /**
     * @param args the command line arguments 2. Faça uma função recursiva que
     * determina o produto de valores contidos em uma lista.
     */
    public static void main(String[] args) {
           ArrayList<Integer> n = new ArrayList<>();
        System.out.print(produtoLista (n,0));
        
      
        
    }

    public static ArrayList preencher() {
         ArrayList<Integer> n = new ArrayList<>();
        int digite=-1;
        while(digite!=0){
            System.out.println("Digite 1 para inserir um valor na lista e 0 para parar");
            digite=ler.nextInt();
            if(digite!=0){
            System.out.println("Digite o nº que pretende inserir na lista");
            int numero=ler.nextInt();
            n.add(numero);
            }
        }
        return n;
    }

    public static int produtoLista(ArrayList<Integer> lista, int i){
         if (lista.isEmpty()){
        ArrayList<Integer> n = new ArrayList<>();
        int digite=-1;
        while(digite!=0){
            System.out.println("Digite 1 para inserir um valor na lista e 0 para parar");
            digite=ler.nextInt();
            if(digite!=0){
            System.out.println("Digite o nº que pretende inserir na lista");
            int numero=ler.nextInt();
            n.add(numero);
            }


}
