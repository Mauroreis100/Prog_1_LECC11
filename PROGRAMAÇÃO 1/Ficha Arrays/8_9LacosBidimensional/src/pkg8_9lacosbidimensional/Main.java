/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_9lacosbidimensional;
import java.util.Arrays;
/**
 *
 * @author mauro
 */
public class Main {

    public static void main(String[] args) {
       int alineaA[][]=new int[3][10];
       int alineaB[][]=new int[5][10];
       int alineaC[][]=new int[6][6];
       int alineaD[][]=new int[9][6];
       
       //Alinea a
       for (int i = 0; i < alineaA.length; i++) {
            for (int j = 0; j < alineaA[i].length; j++) {
                alineaA[i][j]=j;
            }
        }
       for (int i = 0; i < alineaA.length; i++) {
            for (int j = 0; j < alineaA[i].length; j++) {
                System.out.print(alineaA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    
     //Alinea b
      for (int i = 0; i < alineaB.length; i++) {
            for (int j = 0; j < alineaB[i].length; j++) {
                alineaB[i][j]=(int) Math.pow(j,2);
            }
        }
       for (int i = 0; i < alineaB.length; i++) {
            for (int j = 0; j < alineaB[i].length; j++) {
                System.out.print(alineaB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    //Alinea c
    for (int i = 0; i < alineaC.length; i++) {
            for (int j = 0; j < alineaC[i].length; j++) {
                alineaC[i][j]=i;
            }
        }
       for (int i = 0; i < alineaC.length; i++) {
            for (int j = 0; j < alineaC[i].length; j++) {
                System.out.print(alineaC[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
   //Alinea d
   for (int i = 0; i < alineaD.length; i++) {
            for (int j = 0; j < alineaD[i].length; j++) {
                if(i%2==0){
                    alineaD[i][j]=-1;
                }else{
                    alineaD[i][j]=0;
                }
                
            }
        }
       for (int i = 0; i < alineaD.length; i++) {
            for (int j = 0; j < alineaD[i].length; j++) {
                System.out.print(alineaD[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
   
    } 
    
   
}
