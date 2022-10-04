/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_17espacovogais;

/**
 *
 * @author mauro
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler=new Scanner(System.in);
        String frase=ler.nextLine();
        int a=0;
        int b=0;
        for(int i=frase.length()-1;i>=0;i--){
            char currChar = frase.charAt(i);
		if(currChar==' '){
                    a++;
                }else{ 
                switch(currChar){
                    case 'a':
                        b++;
                        break;
                        case 'e':
                                 b++;
                        break;
                        case 'i':
                                 b++;
                        break;
                        case 'o':
                                 b++;
                        break;
                        case 'u':    
                            b++;
                            
                        break;
                        default:
                        
                        break;
                }
                }
        }
        System.out.println("A frase tem "+a+" espaços e "+b+" vogais");
    }
    
}
